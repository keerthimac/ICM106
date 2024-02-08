import java.util.*;

class List{
	private int nextIndex;
	private Order[] orderArray;
	private float loadFact;
	
	List(int size,float loadFact){
		nextIndex=0;
		orderArray= new Order[size];
		this.loadFact = loadFact;
	}
	
	private boolean isEmpty(){
		return nextIndex<=0;
	}

	private boolean isFull(){
		return nextIndex>=orderArray.length;
	}
	
	private void extendOrderArray(){
		int size = orderArray.length + (int)(loadFact*orderArray.length);
		Order[] temp = new Order[size];
		for (int i = 0; i < nextIndex; i++){
			temp[i]=orderArray[i];
		}
		orderArray=temp;
	}

//------------Add Order to List-----------------------------------------
	
	public void addOrder(Order data){
		if(isFull()){
			extendOrderArray();
		}
		orderArray[nextIndex++]=data;
	}

//------------Search Order Index----------------------------------------
	
	public int searchOrderIndex(String id){
		for (int i = 0; i < nextIndex; i++){
			if(id.equalsIgnoreCase(orderArray[i].getOrderId())){
				return i;
			}
		}
		return -1;		
	}

//-------------Search Customer Index------------------------------------	
	public int searchCustomerIndex(String id){
		for (int i = 0; i < nextIndex; i++){
			if(id.equalsIgnoreCase(orderArray[i].getCustomerId())){
				return i;
			}
		}
		return -1;
	}	


//------------Print Order by Index--------------------------------------
	
	public void printOrderByIndex(int orderIndex){
		System.out.println("-------------------------------------------------------------------------------");
		System.out.printf(" %-10s %-15s %-10s %-10s %-15s %-10s | %n", "OrderID", "CustomerID","Name","Quantity","OrderValue","OrderStatus");
		System.out.println("-------------------------------------------------------------------------------");				
		System.out.printf(" %-10s %-15s %-10s %5d %15.2f %15s  | %n",orderArray[orderIndex].getOrderId() ,orderArray[orderIndex].getCustomerId() ,orderArray[orderIndex].getCustomerName(),orderArray[orderIndex].getQty(),orderArray[orderIndex].getTotal(),orderArray[orderIndex].getStatus()==0?"preparing":orderArray[orderIndex].getStatus()==1?"Delevered":"cancel");
		System.out.println("-------------------------------------------------------------------------------");					
		System.out.println();	
	}

//------------Print Order by Customer-----------------------------------

	public void printCustomerOrders(int cusIndex){
		String customerName = orderArray[cusIndex].getCustomerName();
		String customerId = orderArray[cusIndex].getCustomerId();
		System.out.println();			
		System.out.println("CustomerID - "+customerId);
		System.out.println("Name       - "+customerName);
		System.out.println();
		System.out.println("Customer Order Details");
		System.out.println("=======================");	
		System.out.println();								
		System.out.println("-----------------------------------------");
		System.out.printf(" %-10s %-15s %-10s | %n", "OrderID","Order_Quantity","Total_value");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < nextIndex; i++){
			if(customerId.equalsIgnoreCase(orderArray[i].getCustomerId())){
				System.out.printf(" %-10s %-15d %-11.2f | %n", orderArray[i].getCustomerId(),orderArray[i].getQty(),orderArray[i].getTotal());	
			}	
		}
		System.out.println("-----------------------------------------");
		System.out.println();
	}
	
//------------Print Order by Option-------------------------------------

	public void printOrderByOption(int option){
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\t"+(option==0?"PREPARING ORDERS":(option == 1?"DELIVERED ORDERS":"CANCELLED ORDERS"))+"\t\t\t\t|");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		System.out.printf(" %-10s %-15s %-10s %-10s %15s | %n", "OrderID", "CustomerID","Name","Quantity","OrderValue");
		System.out.println("-------------------------------------------------------------------");	
		for (int i = 0; i < nextIndex; i++){
			if(orderArray[i].getStatus()==option){
				System.out.printf(" %-10s %-15s %-10s %5s %20s | %n", orderArray[i].getOrderId(), orderArray[i].getCustomerId(),orderArray[i].getCustomerName(),orderArray[i].getQty(),orderArray[i].getTotal());
				System.out.println("-------------------------------------------------------------------");	
			}
		}
		System.out.println();
		System.out.println();
	}
}


class Order{
	//object creation
	private String orderId;
	private String customerId;
	private String customerName;
	private int qty;
	private double total;
	private int status;
	
	//Order Constructor
	Order(String orderId,String customerId,String customerName,int qty,double total,int status){
		this.orderId=orderId;
		this.customerId=customerId;
		this.customerName=customerName;
		this.qty=qty;
		this.total=total;
		this.status=status;
	}
	
	//Getters
	public String getOrderId(){
		return orderId;
	}
	public String getCustomerId(){
		return customerId;
	}
	public String getCustomerName(){
		return customerName;
	}
	public int getQty(){
		return qty;
	}
	public double getTotal(){
		return total;
	}
	public int getStatus(){
		return status;
	}

	//Setters	
	public void setQty(int qty){
		this.qty = qty;
	}
	public void setTotal(double total){
		this.total = total;
	}
	public void setStatus(int status){
		this.status = status;
	}
	
}
 
class Demo {
	
//----------------Initiate Scanner--------------------------------------	
	public static Scanner input = new Scanner(System.in);
	
	
//----------------Static(global) Varibles-------------------------------
	//final variables for the order info
	public static final int PREPARING = 0;
	public static final int DELIVERED = 1;
	public static final int CANCEL = 2;
	final static double BURGERPRICE=500;
	
	
//-----------------Create Orders from Constructor-----------------------
	public static List orderList = new List(10,0.5f);
	
//-----------------Add Sample Orders to the List------------------------
	
	public static Order[] orderArray={
		new Order("B001","0711234567","Nimal",3,1500.00,0),
		new Order("B002","0759876543","Sunil",5,2500.00,0),
		new Order("B003","0711234567","Nimal",2,1000.00,0),
		new Order("B004","0701231234","Sunimal",4,2000.00,1),
		new Order("B005","0743214321","Kamal",1,500.00,0),
		new Order("B006","0724545145","Samanmal",3,1500.00,0),
		new Order("B007","0759876543","Sunil",1,500.00,0),
		new Order("B008","0743214321","Kamal",7,3500.00,0)
	};

//================Main Program Methods==================================

//----------------Exit Method-------------------------	
	public static void exit(){
		clearConsole();
		System.out.println("\n\t\tYou left the program...\n");
		System.exit(0);
	}

//----------------Clean Console Method----------------------------------		
	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
			e.printStackTrace();
			// Handle any exceptions.
		}
	}

//==============Extend Arrays Method====================================
	
//-------------Extend Original Order Array------------------------------

	public static void extendOrderArray(){
		Order[] temp = new Order[orderArray.length+1];
		for(int i = 0; i<orderArray.length; i++){
			temp[i]=orderArray[i];
		}
		orderArray=temp;
	}	


//--------------Extend Custom Order Array--------------------------
	public static Order[] extendCustArray(Order[] arr){
		Order[] tempArr = new Order[arr.length+1];
		for (int i = 0; i < arr.length; i++){
			tempArr[i]=arr[i]; 
		}
		arr=tempArr;
		return arr;
	}


//===============Search Methods=========================================

	
//-------------Search Customer Index------------------------------------	
	public static int searchCustomerIndex(String id, Order[] arr){
		for (int i = 0; i < arr.length; i++){
			if(id.equalsIgnoreCase(arr[i].getCustomerId())){
				return i;
			}
		}
		return -1;
	}

//------------Search Order Index----------------------------------------
	public static int searchOrderIndex(String id, Order[] arr){
		for (int i = 0; i < arr.length; i++){
			if(id.equalsIgnoreCase(arr[i].getOrderId())){
				return i;
			}
		}
		return -1;
	}


		
//===============Sorting Algorithms=====================================

//---------------Selection Sort-----------------------------------------
	public static int[] sort(int[] ar){ //Selection Sort
		for (int i = 0; i < ar.length-1; i++){
			int min = ar[ar.length-1];
			int index = ar.length-1;
			for(int j=ar.length-1 ; j>=i ; j--){
				if(min>ar[j]){
					min=ar[j];
					index=j;
				}		
			}
			ar[index]=ar[i];
			ar[i]=min;				
		}			
		return ar;											
	}

//-------------Remove Duplicate Customer Ids----------------------------------------		
	public static Order[] removeDupCusId(Order[] arr) {
		Order[] dupRemovedArr = new Order[0];
		for (int i = 0; i < arr.length; i++){
			if(searchCustomerIndex(arr[i].getCustomerId(),dupRemovedArr)==-1){
				dupRemovedArr = extendCustArray(dupRemovedArr);
				dupRemovedArr[dupRemovedArr.length-1] = arr[i];
			}
		}
		return dupRemovedArr;
	}
	

//=================Generate IDs=========================================
	
	public static String generateId() {
		if(orderArray.length==0){
			return String.format("B%03d",1);
		}else{
			String[] tempIdArray = new String[orderArray.length];
			for (int i = 0; i < orderArray.length; i++){
				tempIdArray[i] = orderArray[i].getOrderId();
			}
			String lastId=tempIdArray[tempIdArray.length-1];
			int lastDigit = Integer.parseInt(lastId.substring(1));
			return String.format("B%03d",lastDigit+1);		
		}
	}


	
//=================Main menu Methods====================================
	

//-----------------Update order-----------------------------------------
	public static void updateOrder() {
		L1:do{
			clearConsole();
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|\t\t\tUPDATE ORDER\t\t\t\t\t|");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Enter order Id - ");
			String orderId = input.next();
			System.out.println();
			
			int orderIndex = searchOrderIndex(orderId,orderArray);
			
			if(orderIndex==-1){
				L2:do{
					System.out.println("Invalid order ID");
					System.out.print("Do you want to enter again?");
					String answer = input.next();
					if(answer.toLowerCase().charAt(0)=='y'){
						continue L1;
					}else if(answer.toLowerCase().charAt(0)=='n'){
						return;
					}
				} while (true);
			}else{
				if(orderArray[orderIndex].getStatus()==1){
					System.out.println("This Order is already delevered...You can not update this order...");
					System.out.println();
				}else if(orderArray[orderIndex].getStatus()==2){
					System.out.println("This Order is cancelled...You can not update this order...");
					System.out.println();
				}else if(orderArray[orderIndex].getStatus()==0){
					System.out.printf("%-10s - %-5s %n","OrderID",orderArray[orderIndex].getOrderId());
					System.out.printf("%-10s - %-5s %n","CustomerID",orderArray[orderIndex].getCustomerId());
					System.out.printf("%-10s - %-5s %n","Name",orderArray[orderIndex].getCustomerName());
					System.out.printf("%-10s - %-5d %n","Quantity",orderArray[orderIndex].getQty());
					System.out.printf("%-10s - %-5.2f %n","OrderValue",orderArray[orderIndex].getTotal());
					System.out.printf("%-10s - %-5s %n","OrderValue",orderArray[orderIndex].getStatus()==0?"preparing":orderArray[orderIndex].getStatus()==1?"Delevered":"cancel");

					System.out.println();
					System.out.println("What do you want to update ?");
					System.out.println("\t(01) Quantity");
					System.out.println("\t(02) Status");
					System.out.println();
					
					L3:do{
						System.out.print("Enter your option : ");
						int option = input.nextInt();
						if(option==1){
							clearConsole();
							System.out.println("Quantity Update");
							System.out.println("================");
							System.out.println();
							System.out.printf("%-10s - %-5s %n","OrderID",orderArray[orderIndex].getOrderId());
							System.out.printf("%-10s - %-5s %n","CustomerID",orderArray[orderIndex].getCustomerId());
							System.out.printf("%-10s - %-5s %n","Name",orderArray[orderIndex].getCustomerName());							
							System.out.println();
							System.out.print("Enter your quantity update value - ");
							int bugQty = input.nextInt();
							orderArray[orderIndex].setQty(bugQty);
							orderArray[orderIndex].setTotal(bugQty*BURGERPRICE);
							
							System.out.println();
							System.out.println("\tupdate order quantity successfully...");
							System.out.println();
							System.out.println("new order quantity - "+orderArray[orderIndex].getQty());
							System.out.printf("new order quantity - %.2f%n",orderArray[orderIndex].getTotal());
							System.out.println();
							break L3;
						}else if(option==2){
							clearConsole();
							System.out.println("Status Update");
							System.out.println("================");
							System.out.println();
							System.out.printf("%-10s - %-5s %n","OrderID",orderArray[orderIndex].getOrderId());
							System.out.printf("%-10s - %-5s %n","CustomerID",orderArray[orderIndex].getCustomerId());
							System.out.printf("%-10s - %-5s %n","Name",orderArray[orderIndex].getCustomerName());	
							System.out.println();
							System.out.println("\t(0)Preparing");
							System.out.println("\t(1)Devivered");							
							System.out.println("\t(2)Cancel");						
							System.out.println();						
							L5:do{
								System.out.print("Enter order status - ");
								int statusUpdate = input.nextInt();	
								if (statusUpdate==0 ||statusUpdate==1 || statusUpdate==2){
									orderArray[orderIndex].setStatus(statusUpdate);										
									System.out.println();
									System.out.println("\tupdate order status successfully...");
									System.out.println();
									System.out.println("new order Status - "+(orderArray[orderIndex].getStatus()==0?"preparing":orderArray[orderIndex].getStatus()==1?"Delevered":"cancel"));
									System.out.println();
									System.out.println();
									break L5;
								}else{
									System.out.println("Please Enter Valid Input");
								}						
							} while (true);
							break L3;							
						}else{
							System.out.println("Please Enter Valid Input");
						}
					} while (true);								
				}
				L4:do{
					System.out.print("Do you Want to search another Order details(Y/N): ");
					String answer  = input.next();
					if(answer.toLowerCase().charAt(0)=='y'){
						continue L1;
					}else if(answer.toLowerCase().charAt(0)=='n'){
						return;
					}else{
						System.out.println("Please Enter Valid Input");
					}								
				} while (true);					
			}						
		} while (true);
	}	


//-----------------Check order------------------------------------------	
	public static void orderCheck(int option) {
		L1:do{
			clearConsole();
			orderList.printOrderByOption(option);
			L2:do{
				System.out.print("Do you Want to go to home page (Y/N): ");
				String answer  = input.next();
				if(answer.toLowerCase().charAt(0)=='y'){
					return;
				}else if(answer.toLowerCase().charAt(0)=='n'){
					continue L1;
				}else{
					System.out.println("Please Enter Valid Input");
				}								
			} while (true);
		} while (true);
	}
	
	
//-----------------View orders------------------------------------------	
	public static void viewOrders() {
		L1:do{
			clearConsole();
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|\t\t\tVIEW ORDER LIST\t\t\t\t\t|");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println();
			System.out.println("[1] Delevered Order");
			System.out.println("[2] Preparing Order");
			System.out.println("[3] Canceled Order");
			System.out.println("[4] Main Menu");
			System.out.println();
			System.out.print("Enter an option to continue : ");
			int option = input.nextInt();
			System.out.println();

			switch(option){
				case 1 : orderCheck(1); break;
				case 2 : orderCheck(0); break;
				case 3 : orderCheck(2); break;
				case 4 : return;
			}	
		} while (true);
	}

//-----------------Search Orders----------------------------------------
	public static void searchOrder() {
		L1:do{
			clearConsole();
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("|\t\t\tSEARCH ORDER DETAILS\t\t\t\t\t|");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Enter order Id: ");
			String orderId = input.next();
			System.out.println();
			int orderIndex = orderList.searchOrderIndex(orderId);

			if(orderIndex==-1){
				System.out.println("Invalid order ID");
				System.out.print("Do you want to enter again?");
				String answer = input.next();
				L2:do{
					if(answer.toLowerCase().charAt(0)=='y'){
						continue L1;
					}else if(answer.toLowerCase().charAt(0)=='n'){
						return;
					}
				} while (true);
			}else{
				orderList.printOrderByIndex(orderIndex);
				L3:do{
					System.out.print("Do you Want to search another Order detail? (Y/N): ");
					String answer  = input.next();
					if(answer.toLowerCase().charAt(0)=='y'){
						continue L1;
					}else if(answer.toLowerCase().charAt(0)=='n'){
						return;
					}else{
						System.out.println("Please Enter Valid Input");
					}								
				} while (true);					
			}			
		} while (true);
	}
	
//-----------------Search Customer--------------------------------------
	public static void searchCustomer() {
		L1:do{
			clearConsole();
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("|\t\t\tSEARCH CUSTOMER DETAILS\t\t\t\t\t|");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Enter customer Id: ");
			String customerId = input.next();
			System.out.println();
			int cusIndex = orderList.searchCustomerIndex(customerId);
			
			if(cusIndex==-1){
				System.out.println("\tThis Customer id not added yet.......");
				L2:do{
					System.out.print("Do you want to Search another customer Details?");
					String answer = input.next();
					if(answer.toLowerCase().charAt(0)=='y'){
						continue L1;
					}else if(answer.toLowerCase().charAt(0)=='n'){
						return;
					}
				} while (true);
			}else{
				orderList.printCustomerOrders(cusIndex);
				L2:do{
					System.out.print("Do you Want to Search Another Customer Detail? (Y/N): ");
					String answer  = input.next();
					if(answer.toLowerCase().charAt(0)=='y'){
						continue L1;
					}else if(answer.toLowerCase().charAt(0)=='n'){
						return;
					}else{
						System.out.println("Please Enter Valid Input");
					}								
				} while (true);				
			}			
		} while (true);
	}

//-----------------Search Best Customer--------------------------------------
	public static void searchBestCustomer() {
		L1:do{
			clearConsole();
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("|\t\t\tSEARCH CUSTOMER DETAILS\t\t\t\t\t|");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println();
			
			//Remove Duplicates from the Customer Array
			Order[] cusArray = removeDupCusId(orderArray);
	
			//calculate totals for this Customers
			double[] totalForEach = new double[cusArray.length];
			for (int i = 0; i <cusArray.length ; i++){
				int total = 0;
				for (int j = 0; j < orderArray.length; j++){
					if(cusArray[i].getCustomerId().equalsIgnoreCase(orderArray[j].getCustomerId())){
						total+=orderArray[j].getTotal();
					}
				}
				totalForEach[i] = total;
			}
		
			//Sort totalForEach and Customer Arrays
			for (int i = totalForEach.length-1; i>0; i--){
				for(int j = 0 ; j<i ; j++){
					if(totalForEach[j]<totalForEach[j+1]){
						double temp = totalForEach[j];
						totalForEach[j] = totalForEach[j+1];
						totalForEach[j+1]=temp;
						
						//Sort cusId array
						Order tempIdStr = cusArray[j];
						cusArray[j] = cusArray[j+1];
						cusArray[j+1]=tempIdStr;
						
					}
				}
			}

			//Print Result Arrays
			System.out.println("----------------------------------------------");			
			System.out.printf(" %-15s %-15s %-10s  | %n", "CustomerID","Name","Total");
			System.out.println("----------------------------------------------");			
			for(int i=0; i<cusArray.length; i++){
				System.out.printf(" %-15s %-15s %-11.2f | %n", cusArray[i].getCustomerId(),cusArray[i].getCustomerName(),totalForEach[i]);			
				System.out.println("----------------------------------------------");
			}
			System.out.println();
			System.out.println();			
	
			L2:do{
				System.out.print("\tDo you Want to go back to main menu? (Y/N): ");
				String answer  = input.next();
				if(answer.toLowerCase().charAt(0)=='y'){
					return;
				}else if(answer.toLowerCase().charAt(0)=='n'){
					continue L1;
				}else{
					System.out.println("Please Enter Valid Input");
				}								
			} while (true);						
		} while (true);
	}


//-----------------Place order------------------------------------------	
	public static void placeOrder() {
		L1:do{
			clearConsole();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\tPLACE ORDER\t\t\t\t|");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("\n");
			String orderId = generateId();
			System.out.println("ORDER ID - "+orderId);
			System.out.println("====================");
			System.out.println();
			System.out.println();
			String customerId = "0";
			L2:do{
				System.out.print("Enter Customer ID (Phone no.) : ");
				customerId  = input.next();
				if(customerId.charAt(0)!= '0' || customerId.length()!=10){
					System.out.println("Please Enter Valid Phone Number");
					continue L2;
				}
				break L2;
			}while(true);
			int cusId = searchCustomerIndex(customerId,orderArray);
			String name = null;
			if(cusId!=-1){
				name = orderArray[cusId].getCustomerName();
			}
			String customerName = null;		
			if(name==null){
				System.out.print("Customer Name : ");
				customerName  = input.next();
			}else{
				System.out.print("Customer Name : "+name);
				customerName  = name;
				System.out.println();
			}
			System.out.print("Enter Burger Quantity : ");
			int burgerQty  = input.nextInt();
			double total = burgerQty*BURGERPRICE;
			input.nextLine();
			System.out.printf("Total Value : %.2f%n",total);
			L3:do{
				System.out.print("Are you confirm order -> ");
				String answer  = input.next();
				if(answer.toLowerCase().charAt(0)=='y'){
					orderList.addOrder(new Order(orderId,customerId,customerName,burgerQty,total,PREPARING));//New Add
					System.out.println("Your order is enter to the system successfully");//New Add
					//extendOrderArray();
					//orderArray[orderArray.length-1]=new Order(orderId,customerId,customerName,burgerQty,total,PREPARING);
					break L3;
				}else if(answer.toLowerCase().charAt(0)=='n'){
					break L3;
				}else{
					System.out.println("Please Enter Valid Input");
				}				
			} while (true);

			L4:do{
				System.out.print("Do you Want to Place Another Order (Y/N): ");
				String answer  = input.next();
				if(answer.toLowerCase().charAt(0)=='y'){
					continue L1;
				}else if(answer.toLowerCase().charAt(0)=='n'){
					return;
				}else{
					System.out.println("Please Enter Valid Input");
				}								
			} while (true);			
		}while(true);
	}
	
	
	public static void main(String args[]) {
		do{
			clearConsole();
			Scanner input = new Scanner(System.in);
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\tiHungry Burger\t\t\t\t|");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("\n");
			System.out.printf("%-35s %-35s %n", "[1] Place Order", "[2] Search Best Customer");
			System.out.printf("%-35s %-35s %n", "[3] Search Order", "[4] Search Customer");
			System.out.printf("%-35s %-35s %n", "[5] View Oder", "[6] Update Order Details");
			System.out.printf("%-35s %n","[7] Exit");
			System.out.println();
			
			//Load Sample Orders //New Code
			Demo.orderList.addOrder(new Order("B001","0711234567","Nimal",3,1500.00,0));
			Demo.orderList.addOrder(new Order("B002","0759876543","Sunil",5,2500.00,0));
			Demo.orderList.addOrder(new Order("B003","0711234567","Nimal",2,1000.00,0));
			Demo.orderList.addOrder(new Order("B004","0701231234","Sunimal",4,2000.00,1));
			Demo.orderList.addOrder(new Order("B005","0743214321","Kamal",1,500.00,0));
			Demo.orderList.addOrder(new Order("B006","0724545145","Samanmal",3,1500.00,0));
			Demo.orderList.addOrder(new Order("B007","0759876543","Sunil",1,500.00,0));
			Demo.orderList.addOrder(new Order("B008","0743214321","Kamal",7,3500.00,0));		
			
			int op;
			System.out.print("Enter an option to continue -> ");
			op = input.nextInt();
			switch(op){
			case 1 : placeOrder(); break;
			case 2 : searchBestCustomer(); break;
			case 3 : searchOrder(); break;
			case 4 : searchCustomer();break;
			case 5 : viewOrders();break;
			case 6 : updateOrder();break;
			case 7 : exit();
			}
		}while(true);
		
	}
}

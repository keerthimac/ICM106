import java.util.*;
class Example {

//----------------Static(global) Varibles-------------------------------

	public static String[] orderIds={"C001","C002","C001","C002","C003","C001","C002","C004"};
	public static String[] customerIds={"100","200","100","300","150","210","200","150"};
	public static String[] customerNames={"Nimal","Sunil","Nimal","Sunimal","Kamal","Samanmal","Sunil","Kamal"};
	public static int[] qty=new int[0];
	public static double[] totals={100.00,200.00,100.00,300.00,150.00,210.00,200.00,150.00};
	public static int[] status=new int[0];
	public static Scanner input = new Scanner(System.in);
	public static final int PREPARING = 0;
	public static final int DELIVERED = 1;
	public static final int CANCEL = 2;
	final static double BURGERPRICE=500;

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
	
//--------------Extend Custom String Array------------------------------
	public static String[] extendArray(String[] arr){
		String[] tempArr = new String[arr.length+1];
		for (int i = 0; i < arr.length; i++){
			tempArr[i]=arr[i]; 
		}
		arr=tempArr;
		return arr;
	}

//--------------Extend Custom int Array---------------------------------
	public static int[] extendArray(int[] arr){
		int[] tempArr = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++){
			tempArr[i]=arr[i]; 
		}
		arr=tempArr;
		return arr;
	}

//-------------Extend all Global Arrays---------------------------------
	public static void extendAllArrays(){
		String[] tempCustIds = new String[customerIds.length+1];
		String[] tempOrderIds = new String[orderIds.length+1];
		String[] tempNames = new String[customerNames.length+1];
		int[] tempQtys = new int[qty.length+1];
		double[] tempTotals = new double[totals.length+1];
		int[] tempStatus = new int[status.length+1];
		
		for (int i = 0; i < customerIds.length; i++){
			tempCustIds[i] = customerIds[i];
			tempOrderIds[i] = orderIds[i];
			tempNames[i] = customerNames[i];
			tempQtys[i] = qty[i];
			tempTotals[i] = totals[i];			
			tempStatus[i] = status[i];
		}
		
		customerIds = tempCustIds;
		orderIds = tempOrderIds;
		customerNames = tempNames;
		totals=tempTotals;
		qty = tempQtys;
		status = tempStatus;
	}

//===============Search Methods=========================================

	
//-------------Search Index---------------------------------------------	
	public static int searchIndex(String id, String[] arr){
		for (int i = 0; i < arr.length; i++){
			if(id.equalsIgnoreCase(arr[i])){
				return i;
			}
		}
		return -1;
	}

//-------------Search String--------------------------------------------		
	public static String searchString(String id,String[] arr) {
		for (int i = 0; i < arr.length; i++){
			if(id.equalsIgnoreCase(arr[i])){
				return arr[i];
			}
		}
		return null;
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


//-------------Remove Duplicates----------------------------------------		
	public static String[] removeDuplicates(String[] arr) {
		String[] dupRemovedArr = new String[0];
		for (int i = 0; i < arr.length; i++){
			if(searchIndex(arr[i],dupRemovedArr)==-1){
				dupRemovedArr = extendArray(dupRemovedArr);
				dupRemovedArr[dupRemovedArr.length-1] = arr[i];
			}
		}
		return dupRemovedArr;
	}
	

//=================Generate IDs=========================================
	
	public static String generateId() {
		if(orderIds.length==0){
			return String.format("B%03d",1);
		}else{
			String[] tempIdArray = new String[orderIds.length];
			for (int i = 0; i < orderIds.length; i++){
				tempIdArray[i] = orderIds[i];
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
			
			int orderIndex = searchIndex(orderId,customerIds);
			
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
				if(status[orderIndex]==1){
					System.out.println("This Order is already delevered...You can not update this order...");
					System.out.println();
				}else if(status[orderIndex]==2){
					System.out.println("This Order is cancelled...You can not update this order...");
					System.out.println();
				}else if(status[orderIndex]==0){
					System.out.printf("%-10s - %-5s %n","OrderID",orderIds[orderIndex]);
					System.out.printf("%-10s - %-5s %n","CustomerID",customerIds[orderIndex]);
					System.out.printf("%-10s - %-5s %n","Name",customerNames[orderIndex]);
					System.out.printf("%-10s - %-5d %n","Quantity",qty[orderIndex]);
					System.out.printf("%-10s - %-5.2f %n","OrderValue",totals[orderIndex]);
					System.out.printf("%-10s - %-5s %n","OrderValue",status[orderIndex]==0?"preparing":status[orderIndex]==1?"Delevered":"cancel");

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
							System.out.printf("%-10s - %-5s %n","OrderID",orderIds[orderIndex]);
							System.out.printf("%-10s - %-5s %n","CustomerID",customerIds[orderIndex]);
							System.out.printf("%-10s - %-5s %n","Name",customerNames[orderIndex]);							
							System.out.println();
							System.out.print("Enter your quantity update value - ");
							int bugQty = input.nextInt();
							qty[orderIndex] = bugQty;
							totals[orderIndex] = bugQty*BURGERPRICE;
							
							System.out.println();
							System.out.println("\tupdate order quantity successfully...");
							System.out.println();
							System.out.println("new order quantity - "+qty[orderIndex]);
							System.out.printf("new order quantity - %.2f%n",totals[orderIndex]);
							System.out.println();
							break L3;
						}else if(option==2){
							clearConsole();
							System.out.println("Status Update");
							System.out.println("================");
							System.out.println();
							System.out.printf("%-10s - %-5s %n","OrderID",orderIds[orderIndex]);
							System.out.printf("%-10s - %-5s %n","CustomerID",customerIds[orderIndex]);
							System.out.printf("%-10s - %-5s %n","Name",customerNames[orderIndex]);
							System.out.println();
							System.out.println("\t(0)Preparing");
							System.out.println("\t(1)Devivered");							
							System.out.println("\t(2)Cancel");						
							System.out.println();
							System.out.print("Enter order status - ");
							int statusUpdate = input.nextInt();
							status[orderIndex] = statusUpdate;
							System.out.println();
							System.out.println("\tupdate order status successfully...");
							System.out.println();
							System.out.println("new order Status - "+(status[orderIndex]==0?"preparing":status[orderIndex]==1?"Delevered":"cancel"));
							System.out.println();
							System.out.println();
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
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|\t\t\t"+(option==0?"PREPARING ORDERS":(option == 1?"DELIVERED ORDERS":"CANCELLED ORDERS"))+"\t\t\t\t|");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println("-------------------------------------------------------------------");
			System.out.printf(" %-10s %-15s %-10s %-10s %15s | %n", "OrderID", "CustomerID","Name","Quantity","OrderValue");
			System.out.println("-------------------------------------------------------------------");	
			for (int i = 0; i < status.length; i++){
				if(status[i]==option){
					System.out.printf(" %-10s %-15s %-10s %5s %20s | %n", orderIds[i], customerIds[i],customerNames[i],qty[i],totals[i]);
					System.out.println("-------------------------------------------------------------------");	
				}
			}
			System.out.println();
			System.out.println();
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
			int orderIndex = searchIndex(orderId,customerIds);

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
				System.out.println("-------------------------------------------------------------------------------");
				System.out.printf(" %-10s %-15s %-10s %-10s %-15s %-10s | %n", "OrderID", "CustomerID","Name","Quantity","OrderValue","OrderStatus");
				System.out.println("-------------------------------------------------------------------------------");				
				System.out.printf(" %-10s %-15s %-10s %5d %15.2f %15s  | %n",orderIds[orderIndex] ,customerIds[orderIndex] ,customerNames[orderIndex],qty[orderIndex],totals[orderIndex],status[orderIndex]==0?"preparing":status[orderIndex]==1?"Delevered":"cancel");
				System.out.println("-------------------------------------------------------------------------------");					
				System.out.println();
				L3:do{
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
	
//-----------------Search Customer--------------------------------------
	public static void searchCustomer() {
		L1:do{
			clearConsole();
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("|\t\t\tSEARCH CUSTOMER DETAILS\t\t\t\t\t|");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Enter customer Id: ");
			String cusmId = input.next();
			System.out.println();
			String cusName = searchString(cusmId,customerNames);

			if(cusName==null){
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
				System.out.println();			
				System.out.println("CustomerID - "+cusmId);
				System.out.println("Name       - "+cusName);
				System.out.println();
				System.out.println("Customer Order Details");
				System.out.println("=======================");	
				System.out.println();								
				System.out.println("-----------------------------------------");
				System.out.printf(" %-10s %-15s %-10s | %n", "OrderID","Order_Quantity","Total_value");
				System.out.println("-----------------------------------------");
				for (int i = 0; i < customerIds.length; i++){
					if(cusmId.equalsIgnoreCase(customerIds[i])){
						System.out.printf(" %-10s %-15d %-11.2f | %n", orderIds[i],qty[i],totals[i]);	
					}	
				}
				System.out.println("-----------------------------------------");
				System.out.println();
				L2:do{
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
			String[] cusArray = removeDuplicates(customerIds);
			String[] cusNameArray = removeDuplicates(customerNames);
	
			//calculate totals for this Customers
			double[] totalForEach = new double[cusArray.length];
			for (int i = 0; i <cusArray.length ; i++){
				int total = 0;
				for (int j = 0; j < customerIds.length; j++){
					if(cusArray[i].equalsIgnoreCase(customerIds[j])){
						total+=totals[j];
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
						String tempIdStr = cusArray[j];
						cusArray[j] = cusArray[j+1];
						cusArray[j+1]=tempIdStr;
						
						//Sort name array
						String tempNmStr = cusNameArray[j];
						cusNameArray[j] = cusNameArray[j+1];
						cusNameArray[j+1]=tempNmStr;
					}
				}
			}

			//Print Result Arrays
			System.out.println("----------------------------------------------");			
			System.out.printf(" %-15s %-15s %-10s  | %n", "CustomerID","Name","Total");
			System.out.println("----------------------------------------------");			
			for(int i=0; i<cusArray.length; i++){
				System.out.printf(" %-15s %-15s %-11.2f | %n", cusArray[i],cusNameArray[i],totalForEach[i]);			
				System.out.println("----------------------------------------------");
			}
			System.out.println();
			System.out.println();			
	
			L2:do{
				System.out.print("\tDo you Want to go back to main menu? (Y/N): ");
				String answer  = input.next();
				if(answer.toLowerCase().charAt(0)=='y'){
					continue L1;
				}else if(answer.toLowerCase().charAt(0)=='n'){
					return;
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
			String name = searchString(customerId,customerNames);
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
					System.out.println("Your order is enter to the system successfully");
					extendAllArrays();
					orderIds[orderIds.length-1]=orderId;
					customerIds[customerIds.length-1]=customerId;
					customerNames[customerNames.length-1]=customerName;
					qty[qty.length-1]=burgerQty;
					totals[totals.length-1]=total;
					status[status.length-1]=PREPARING;
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

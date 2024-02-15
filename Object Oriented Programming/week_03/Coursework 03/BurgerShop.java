import java.util.*;

class OrderList{
	private Node first;

	OrderList(){
		addSampleOrders();
	}
//=================Private Intenal Classe for Linked List===============
	
	private class Node{
		Order order;
		Node next;
		
		Node(Order order){
			this.order =order;
		}
	
	}

//======================================================================


   private void addSampleOrders() {
        add("B001", "0711234567", "Nimal", 3, 1500.00, 0);
        add("B002", "0759876543", "Sunil", 5, 2500.00, 0);
        add("B003", "0711234567", "Nimal", 2, 1000.00, 0);
        add("B004", "0701231234", "Sunimal", 4, 2000.00, 1);
        add("B005", "0743214321", "Kamal", 1, 500.00, 0);
        add("B006", "0724545145", "Samanmal", 3, 1500.00, 0);
        add("B007", "0759876543", "Sunil", 1, 500.00, 0);
        add("B008", "0743214321", "Kamal", 7, 3500.00, 0);
    }

	
	private boolean isEmpty(){
		return first==null;
	}

//=================Generate Order IDs===================================
	
	public String generateId() {
		if(first==null){
			return String.format("B%03d",1);
		}else{
			Node temp = first;
			while(temp.next!=null){
				temp=temp.next;
			}
			String lastId = temp.order.getOrderId();
			int lastDigit = Integer.parseInt(lastId.substring(1));
			return String.format("B%03d",lastDigit+1);		
		}
	}

//------------Add Order to List-----------------------------------------
	
	public void add(String orderId,String customerId,String customerName,int burgerQty,double total,int status){
		Order order = new Order(orderId,customerId,customerName,burgerQty,total,status);
		Node n1 = new Node(order);
		if(first==null){
			first = n1;
		}else{
			Node lastNode = first;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next=n1;
		}
	}

//------------Search Order Index----------------------------------------
	
	public int searchOrderIndex(String orderId){
		if(orderId!=null){
			Node temp = first;
			int count = 0;
			while(temp!=null){
				if(orderId.equalsIgnoreCase(temp.order.getOrderId())){
					return count;
				}else{
					temp=temp.next;
					count++;
				}
			}
		}
		return -1;		
	}




//-------------Search Customer Index------------------------------------	
	public int searchCustomerIndex(String cusId){
		if(cusId!=null){
			Node temp = first;
			int count = 0;
			while(temp!=null){
				if(cusId.equalsIgnoreCase(temp.order.getCustomerId())){
					return count;
				}else{
					temp=temp.next;
					count++;
				}
			}
		}		
		return -1;
	}	

//-------------get Customer Oders---------------------------------------

	private int getOrderCount(String customerId){
		if(customerId!=null){
			Node temp = first;
			int orderCount = 0;
			while(temp!=null){
				if(customerId.equalsIgnoreCase(temp.order.getCustomerId())){
					orderCount++;
					temp=temp.next;
				}else{
					temp=temp.next;
				}
			}
			return orderCount;
		}
		return -1;
	}

	public Order[] getCustomerOrders(String customerId){
		if(customerId!=null){
			Order[] tempArr = new Order[getOrderCount(customerId)];
			Node temp =first;
			int count = 0;
			while(temp!=null){
				if(customerId.equalsIgnoreCase(temp.order.getCustomerId())){
					tempArr[count++] = temp.order;
					temp=temp.next;
				}else{
					temp=temp.next;
				}
			}
			return tempArr;
		}
		return null;
	}

//-------------get Orders by Index--------------------------------------

	private int getOrderCount(int option){
		Node temp = first;
		int orderCount = 0;
		while(temp!=null){
			if(option==temp.order.getStatus()){
				orderCount++;
				temp=temp.next;
			}else{
				temp=temp.next;
			}
		}
		return orderCount;
	}

	public Order[] getOrdersByStatus(int option){
		Order[] tempArr = new Order[getOrderCount(option)];
		Node temp =first;
		int count = 0;
		while(temp!=null){
			if(option==temp.order.getStatus()){
				tempArr[count++] = temp.order;
				temp=temp.next;
			}else{
				temp=temp.next;
			}
		}
		return tempArr;		
	}

//-------------Duplicate Removed Arrays---------------------------------

   //-------------Return Copy of Order Array-----------------------//

	private Order[] copyOrderList(){
		Order[] tempArr = new Order[size()];
		Node temp=first;
		int count = 0;
		while(temp!=null){
			tempArr[count++]=temp.order;
			temp=temp.next;
		}
		return tempArr;
	}

	//--------------Extend Custom Order Array---------------------//
	private Order[] extendCustArray(Order[] arr){
		Order[] tempArr = new Order[arr.length+1];
		for (int i = 0; i < arr.length; i++){
			tempArr[i]=arr[i]; 
		}
		arr=tempArr;
		return arr;
	}

	//-------------Search Customer Index in Array----------------//	
	public static int searchCustomerIndex(String id, Order[] arr){
		for (int i = 0; i < arr.length; i++){
			if(id.equalsIgnoreCase(arr[i].getCustomerId())){
				return i;
			}
		}
		return -1;
	}
	
	public Order[] removeDupCusId() {
		Order[] dupRemovedArr = new Order[0];
		Order[] orderArray = copyOrderList();
		for (int i = 0; i < orderArray.length; i++){
			if(searchCustomerIndex(orderArray[i].getCustomerId(),dupRemovedArr)==-1){
				dupRemovedArr = extendCustArray(dupRemovedArr);
				dupRemovedArr[dupRemovedArr.length-1] = orderArray[i];
			}
		}
		return dupRemovedArr;
	}

	public double[] findTotalForEach(){
		Order[] cusArray = removeDupCusId();
		Order[] orderArray = copyOrderList();
		double[] totalForEach = new double[cusArray.length];
		for (int i = 0; i <cusArray.length;i++){
			int total = 0;
			for (int j = 0; j<orderArray.length; j++){
				if(cusArray[i].getCustomerId().equalsIgnoreCase(orderArray[j].getCustomerId())){
					total+=orderArray[j].getTotal();
				}
			}
			totalForEach[i] = total;
		}
		return totalForEach;
	}
//-------------Update Order by Index------------------------------------
	
	public void updateOrderByQty(int orderIndex,int bugQty,double price){
		Order order = getOrderInfo(orderIndex);
		order.setQty(bugQty);
		order.setTotal(bugQty*price);
	}

	public int size(){
		Node temp = first;
		int count=0;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}

//-------------Return Order Object--------------------------------------
	
	public Order getOrderInfo(int index){
		if(isValidIndex(index)){
			Node temp=first;
			int count=0;
			while(count<index){
				temp=temp.next;
				count++;
			}
			return temp.order;
		}
		return null;
	}


//-------------Validate Index-------------------------------------------
	private boolean isValidIndex(int index){
		return index>=0 && index<=size();
	}
}


class Order{
	private String orderId;
	private String customerId;
	private String customerName;
	private int qty;
	private double total;
	private int status;
		
	Order(String orderId,String customerId,String customerName,int qty,double total,int status){
		this.orderId=orderId;
		this.customerId=customerId;
		this.customerName=customerName;
		this.qty=qty;
		this.total=total;
		this.status=status;
	}
		
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

class OrderController{
	static OrderList db = new OrderList();
	
	public String generateId(){
		return db.generateId();
	}
	
	public Order getOrderInfo(int Index){
		return db.getOrderInfo(Index);
	}
	public void addOrder(String orderId,String customerId,String customerName,int burgerQty,double total,int status){
		db.add(orderId,customerId,customerName,burgerQty,total,status);
	}
	
	public int searchOrderIndex(String orderId){
		return db.searchOrderIndex(orderId);
	}
	
	public int searchCustomerIndex(String customerId){
		return db.searchCustomerIndex(customerId);
	}
	
	public Order[] getCustomerOrders(String customerId){
		return db.getCustomerOrders(customerId);
	}

	public Order[] getOrdersByStatus(int option){
		return db.getOrdersByStatus(option);
	}
	public void updateOrderByQty(int orderIndex,int bugQty,double price){
		db.updateOrderByQty(orderIndex,bugQty,price);
	}
	
	public double[] findTotalForEach(){
		return db.findTotalForEach();
	}	
	
	public Order[] findBestCustomers(){
		return db.removeDupCusId();		
	}
	
}

class OrderView{
	static Scanner input=new Scanner(System.in);
	static OrderController controller = new OrderController();

//----------------Static(global) Varibles-------------------------------
	//final variables for the order info
	public static final int PREPARING = 0;
	public static final int DELIVERED = 1;
	public static final int CANCEL = 2;
	final static double BURGERPRICE=500;

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

//----------------Exit Method-------------------------	
	public static void exit(){
		clearConsole();
		System.out.println("\n\t\tYou left the program...\n");
		System.exit(0);
	}

//-----------------Search Best Customer--------------------------------------
	public static void searchBestCustomer() {
		L1:do{
			clearConsole();
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("|\t\t\tSEARCH CUSTOMER DETAILS\t\t\t\t\t|");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println();
			
			Order[] cusArray = controller.findBestCustomers();
			double[] totalForEach = controller.findTotalForEach();
					
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
			
			int orderIndex = controller.searchOrderIndex(orderId);

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
				Order order=controller.getOrderInfo(orderIndex);
				Scanner input = new Scanner(System.in);
				if(order.getStatus()==1){
					System.out.println("This Order is already delevered...You can not update this order...");
					System.out.println();
				}else if(order.getStatus()==2){
					System.out.println("This Order is cancelled...You can not update this order...");
					System.out.println();
				}else if(order.getStatus()==0){
					System.out.printf("%-10s - %-5s %n","OrderID",order.getOrderId());
					System.out.printf("%-10s - %-5s %n","CustomerID",order.getCustomerId());
					System.out.printf("%-10s - %-5s %n","Name",order.getCustomerName());
					System.out.printf("%-10s - %-5d %n","Quantity",order.getQty());
					System.out.printf("%-10s - %-5.2f %n","OrderValue",order.getTotal());
					System.out.printf("%-10s - %-5s %n","OrderValue",order.getStatus()==0?"preparing":order.getStatus()==1?"Delevered":"cancel");

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
							System.out.printf("%-10s - %-5s %n","OrderID",order.getOrderId());
							System.out.printf("%-10s - %-5s %n","CustomerID",order.getCustomerId());
							System.out.printf("%-10s - %-5s %n","Name",order.getCustomerName());							
							System.out.println();
							System.out.print("Enter your quantity update value - ");
							int bugQty = input.nextInt();
							controller.updateOrderByQty(orderIndex,bugQty,BURGERPRICE);
								
							System.out.println();
							System.out.println("\tupdate order quantity successfully...");
							System.out.println();
							System.out.println("new order quantity - "+order.getQty());
							System.out.printf("new order quantity - %.2f%n",order.getTotal());
							System.out.println();
							break L3;
						}else if(option==2){
							clearConsole();
							System.out.println("Status Update");
							System.out.println("================");
							System.out.println();
							System.out.printf("%-10s - %-5s %n","OrderID",order.getOrderId());
							System.out.printf("%-10s - %-5s %n","CustomerID",order.getCustomerId());
							System.out.printf("%-10s - %-5s %n","Name",order.getCustomerName());	
							System.out.println();
							System.out.println("\t(0)Preparing");
							System.out.println("\t(1)Devivered");							
							System.out.println("\t(2)Cancel");						
							System.out.println();						
							L5:do{
								System.out.print("Enter order status - ");
								int statusUpdate = input.nextInt();	
								if (statusUpdate==0 ||statusUpdate==1 || statusUpdate==2){
									order.setStatus(statusUpdate);										
									System.out.println();
									System.out.println("\tupdate order status successfully...");
									System.out.println();
									System.out.println("new order Status - "+(order.getStatus()==0?"preparing":order.getStatus()==1?"Delevered":"cancel"));
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
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|\t\t\t"+(option==0?"PREPARING ORDERS":(option == 1?"DELIVERED ORDERS":"CANCELLED ORDERS"))+"\t\t\t\t|");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println("-------------------------------------------------------------------");
			System.out.printf(" %-10s %-15s %-10s %-10s %15s | %n", "OrderID", "CustomerID","Name","Quantity","OrderValue");
			System.out.println("-------------------------------------------------------------------");
			Order [] orderArray = controller.getOrdersByStatus(option);
			for (int i = 0; i < orderArray.length; i++){
				if(orderArray[i].getStatus()==option){
					System.out.printf(" %-10s %-15s %-10s %5s %20s | %n", orderArray[i].getOrderId(), orderArray[i].getCustomerId(),orderArray[i].getCustomerName(),orderArray[i].getQty(),orderArray[i].getTotal());
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
			int cusIndex = controller.searchCustomerIndex(customerId);
			
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
				Order cusObject = controller.getOrderInfo(cusIndex);
				String customerName = cusObject.getCustomerName();
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
				Order [] orderArray = controller.getCustomerOrders(customerId);
				for (int i = 0; i < orderArray.length; i++){
					if(customerId.equalsIgnoreCase(orderArray[i].getCustomerId())){
						System.out.printf(" %-10s %-15d %-11.2f | %n", orderArray[i].getOrderId(),orderArray[i].getQty(),orderArray[i].getTotal());	
					}	
				}
				System.out.println("-----------------------------------------");
				System.out.println();
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
			int orderIndex = controller.searchOrderIndex(orderId);

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
				Order order = controller.getOrderInfo(orderIndex);
				System.out.println("-------------------------------------------------------------------------------");
				System.out.printf(" %-10s %-15s %-10s %-10s %-15s %-10s | %n", "OrderID", "CustomerID","Name","Quantity","OrderValue","OrderStatus");
				System.out.println("-------------------------------------------------------------------------------");				
				System.out.printf(" %-10s %-15s %-10s %5d %15.2f %15s  | %n",order.getOrderId() ,order.getCustomerId() ,order.getCustomerName(),order.getQty(),order.getTotal(),order.getStatus()==0?"preparing":order.getStatus()==1?"Delevered":"cancel");
				System.out.println("-------------------------------------------------------------------------------");					
				System.out.println();
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
	
//-----------------Place order------------------------------------------	
	public static void placeOrder() {
		L1:do{
			clearConsole();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\tPLACE ORDER\t\t\t\t|");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("\n");
			String orderId = controller.generateId();
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
			int cusIndex = controller.searchCustomerIndex(customerId);
			String name = null;
			if(cusIndex!=-1){
				Order order = controller.getOrderInfo(cusIndex);
				name = order.getCustomerName();
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
					controller.addOrder(orderId,customerId,customerName,burgerQty,total,PREPARING);
					System.out.println("Your order is enter to the system successfully");
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
	
	
	public static void run(){
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

class BurgerShop{
	public static void main(String args[]){
		OrderView.run();
	}
}


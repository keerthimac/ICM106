import java.util.*;

class OrderList{
	private Node first;

//=================Private Classes======================================
	
	//Private internal class Node
	private class Node{
		Order order;
		Node next;
		
		Node(Order order){
			this.order =order;
		}
	
	}
	
	//Private internal class Node
	private class Order{
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

/* 	
   private void addSampleOrders() {
        addOrder(new Order("B001", "0711234567", "Nimal", 3, 1500.00, 0));
        addOrder(new Order("B002", "0759876543", "Sunil", 5, 2500.00, 0));
        addOrder(new Order("B003", "0711234567", "Nimal", 2, 1000.00, 0));
        addOrder(new Order("B004", "0701231234", "Sunimal", 4, 2000.00, 1));
        addOrder(new Order("B005", "0743214321", "Kamal", 1, 500.00, 0));
        addOrder(new Order("B006", "0724545145", "Samanmal", 3, 1500.00, 0));
        addOrder(new Order("B007", "0759876543", "Sunil", 1, 500.00, 0));
        addOrder(new Order("B008", "0743214321", "Kamal", 7, 3500.00, 0));
    }
*/
	
	private boolean isEmpty(){
		return first==null;
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

//=================Generate Order IDs===================================
	
	public String generateId() {
		if(first==null){
			return String.format("B%03d",1);
		}else{
			int arrSize = size();
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
	
	public void addOrder(Order order){
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

//-------------Return Copy of Order Array-------------------------------
/*
	public Order[] copyOrderArray(){
		Order[] temp = new Order[nextIndex];
		for (int i = 0; i < nextIndex; i++){
			temp[i] = orderArray[i];
		}
		return temp;
	}
*/

	public int size(){
		Node temp = first;
		int count;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}

//-------------Return Order Object--------------------------------------
	
	public Order getOrderInfo(int index){
		
	}


}

class OrderController{
	
}

class OrderView{
	public static void run(){
		do{
			//clearConsole();
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
			//case 2 : searchBestCustomer(); break;
			//case 3 : searchOrder(); break;
			//case 4 : searchCustomer();break;
			//case 5 : viewOrders();break;
			//case 6 : updateOrder();break;
			//case 7 : exit();
			}
		}while(true);	
	}

	public static void placeOrder() {
		L1:do{
			clearConsole();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\tPLACE ORDER\t\t\t\t|");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("\n");
			String orderId = orderList.generateId();
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
			int cusIndex = orderList.searchCustomerIndex(customerId);
			String name = null;
			if(cusIndex!=-1){
				Order order = orderList.getOrderInfo(cusIndex);
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
					orderList.addOrder(new Order(orderId,customerId,customerName,burgerQty,total,PREPARING));//New Add
					System.out.println("Your order is enter to the system successfully");//New Add
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

}

class BurgerShop{
	public static void main(String args[]){
		OrderView.run();
	}
}


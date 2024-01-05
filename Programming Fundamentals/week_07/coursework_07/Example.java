import java.util.*;
class Example {
	public static String[] orderIds=new String[0];
	public static String[] customerIds=new String[0];
	public static String[] customerNames=new String[0];
	public static int[] qty=new int[0];
	public static int[] status=new int[0];
	public static Scanner input = new Scanner(System.in);
	public static final int PREPARING = 0;
	public static final int DELIVERED = 1;
	public static final int CANCEL = 2;

	
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
	
	public static void extendAllArrays(){
		String[] tempCustIds = new String[customerIds.length+1];
		String[] tempOrderIds = new String[orderIds.length+1];
		String[] tempNames = new String[customerNames.length+1];
		int[] tempQtys = new int[qty.length+1];
		int[] tempStatus = new int[status.length+1];
		
		for (int i = 0; i < customerIds.length; i++){
			tempCustIds[i] = customerIds[i];
			tempOrderIds[i] = orderIds[i];
			tempNames[i] = customerNames[i];
			tempQtys[i] = qty[i];
			tempStatus[i] = status[i];
		}
		
		customerIds = tempCustIds;
		orderIds = tempOrderIds;
		customerNames = tempNames;
		qty = tempQtys;
		status = tempStatus;
	}

	public static int[] sort(int[] ar){
		for(int i=0; i<ar.length-1; i++){
			for(int j=0; j<(ar.length-1)-i; j++){
				if(ar[j]>ar[j+1]){
					int t=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=t;
				}
			}
		}
		return ar;
	}
	
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
	
	public static String searchCustomer(String id) {
		for (int i = 0; i < customerIds.length; i++){
			if(id.equalsIgnoreCase(customerIds[i])){
				return customerNames[i];
			}
		}
		return null;
	}
	
	public static void placeOrder() {
		L1:do{
			clearConsole();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\tiPlace Order\t\t\t\t|");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("\n");
			String orderId = generateId();
			System.out.println("ORDER ID - "+orderId);
			System.out.println("========================");
			System.out.println();
			System.out.println();
			String customerId = "0";
			L2:do{
				System.out.print("Enter Customer ID (Phone no.) : ");
				customerId  = input.nextLine();
				if(customerId.charAt(0)!= '0' || customerId.length()!=10){
					System.out.println("Please Enter Valid Phone Number");
					continue L2;
				}
				break L2;
			}while(true);
			String name = searchCustomer(customerId);
			String customerName = null;		
			if(name==null){
				System.out.print("Customer Name : ");
				customerName  = input.nextLine();
			}else{
				System.out.print("Customer Name : "+name);
				customerName  = name;
				System.out.println();
			}
			System.out.print("Enter Burger Quantity : ");
			int burgerQty  = input.nextInt();
			int total = burgerQty*500;
			System.out.print("Total Value : "+total);
			System.out.println();
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
			System.out.println("\n");
			int op;
			System.out.print("Enter an option to continue -> ");
			op = input.nextInt();
			switch(op){
			case 1 : placeOrder(); break;
			//case 2 : loans(); break;
			//case 3 : tax(); break;
			//case 4 : shareMarket();break;
			//case 5 : shareMarket();break;
			//case 6 : shareMarket();break;
			case 7 : return;
			}
		}while(true);
		
	}
}

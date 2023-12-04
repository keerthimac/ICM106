import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Unit Price : ");
		double unitPrice = input.nextDouble();
		System.out.print(" Amount Brought : ");
		double amount = input.nextDouble();
		
		//Total calculation
		double total = unitPrice*amount ;
		
		if(total>500.00){
			double discount = total*5/100;
			total = total - discount; 
			System.out.println(" Your Discount is "+discount+" & your Final Amount is "+total+".");
		}else{
			System.out.println(" No discount given");
		}
	}
}

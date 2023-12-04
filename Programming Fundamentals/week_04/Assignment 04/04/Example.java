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
		
		if(total>1500){
			System.out.println(" You are entitled to the super draw.");
		}else{
			System.out.println(" Try again");
		}
	}
}

import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		double taxRate = 0.15;
		System.out.print(" Enter the total amount of purchase Rs : ");
		double totAmount = input.nextInt();
		
	
		//Tax Calculation
		double taxCal = totAmount * taxRate;
		System.out.println(" Discount is Rs : "+taxCal);		
	}
}

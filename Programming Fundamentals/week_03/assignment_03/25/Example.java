import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		double salesTax = 10.0/100;
		System.out.print(" Enter the tax-inclusive price in dollars : ");
		double taxInPrice = input.nextDouble();
		
		//Calculations
		double accPrice = taxInPrice*(100.0/110);
		double taxCal = accPrice*(10.0/100);
		accPrice = (int)(accPrice*100)/100.0;
		taxCal = (int)(taxCal*100)/100.0;
	
		
				
		System.out.println("Actual Price is: "+accPrice);	
		System.out.println("Sales Tax is: "+taxCal);	
	}
}

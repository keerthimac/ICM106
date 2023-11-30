import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the number of days: ");
		int days = input.nextInt();
		
	
	
		//Months Calculation
		int month = days/30;
	
		//Days Calculation
		int monthBal = month%30;
				
		System.out.println(" "+month+" Months and "+monthBal+" Days");			
	}
}

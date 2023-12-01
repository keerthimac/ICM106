import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" How many eggs do you have : ");
		int eags = input.nextInt();
		
		//gross Calculation
		int gross = eags/144;
		int grossBal = eags%144;
	
		//Dozen Calculation
		int dozen = grossBal/12;
		
		//second Calculation
		int balEags = grossBal%12;
				
		System.out.println("Your number of eggs is "+gross+" gross, "+dozen+" dozen, and "+balEags);			
	}
}

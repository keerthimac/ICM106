import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Input seconds: ");
		int seconds = input.nextInt();
		
	
	
		//hours Calculation
		int hours = seconds/3600;
		int hoursBal = seconds%3600;
	
		//minutes Calculation
		int minutes = hoursBal/60;
		
		//minute Calculation
		int second = minutes%30;
				
		System.out.println(hours+":"+minutes+":"+second);			
	}
}

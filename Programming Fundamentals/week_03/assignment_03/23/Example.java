import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter first Devidend : ");
		int num1 = input.nextInt();
		
		System.out.print(" Enter second Devisor : ");
		int num2 = input.nextInt();
			
		//Reminder Calculation
		int result = num1-((num1/num2)*num2);
		
				
		System.out.println(" Reminder of "+num1+"/"+num2+" = "+result);			
	}
}

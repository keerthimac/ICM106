import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter basic salary : ");
		double salary = input.nextDouble();
		
		//Calculations
		double employee = salary*(12.0/100);
		employee = (int) (employee * 100) / 100.0;		
		
		double employer = salary*(3.5/100);
		employer = (int) (employer * 100) / 100.0;	
		
		double pension = salary*(8.3/100);
		pension = (int) (pension * 100) / 100.0;	
		
				
		System.out.println("Employee Fund = "+employee);	
		System.out.println("Employer Fund = "+employer);
		System.out.println("Pension Fund = "+pension);		
	}
}

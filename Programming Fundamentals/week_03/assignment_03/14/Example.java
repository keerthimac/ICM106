import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		double p = input.nextInt();
		System.out.print("Enter Second Number: ");
		double q = input.nextInt();
		
		//Addition Calculation
		double r = p+q;
		System.out.println(" X + Y = "+r);
		
		//Multification Calculation
		double s = p*q;
		System.out.println(" X * Y = "+s);
		
		//Subtraction Calculation
		double t = p-q;
		System.out.println(" X - Y = "+t);
		
		//Division Calculation
		double u = p/q;
		System.out.println(" X / Y = "+u);
		
		//Reminder Calculation
		double v = p%q;
		System.out.println(" X % Y = "+v);
	}
}

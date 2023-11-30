import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter dividend X: ");
		int p = input.nextInt();
		System.out.print("Enter divisor Y: ");
		int q = input.nextInt();
		
		//Quotient Calculation
		int r = p/q;
		System.out.println("Quotient of X / Y is "+r);
		
		//Remainder Calculation
		int s = p%q;
		System.out.println("Remainder of X / Y is "+s);
	}
}

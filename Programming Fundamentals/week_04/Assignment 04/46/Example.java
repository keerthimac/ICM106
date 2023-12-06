import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length a: ");	
		int a = input.nextInt();
		System.out.print("Enter length b: ");	
		int b = input.nextInt();
		System.out.print("Enter length c: ");	
		int c = input.nextInt();
		
		System.out.println((a*a)+(b*b)==(c*c)?"Pythagorean triple":"not in Pythagorean triple");
	}
}

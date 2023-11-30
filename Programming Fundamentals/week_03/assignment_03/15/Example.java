import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		double pi = 3.141;

		System.out.print(" Enter redius of the circle: ");
		double redius = input.nextInt();
		
		//Addition Calculation
		double area = pi*(redius*redius);
		System.out.println(" Area of the circle = "+area);
		
		//Multification Calculation
		double perimeter = 2*pi*redius;
		System.out.println(" perimeter of the circle = "+perimeter);
		
	}
}

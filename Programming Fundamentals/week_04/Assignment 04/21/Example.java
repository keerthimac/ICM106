import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter first number : ");
		double number1 = input.nextDouble();
		System.out.print(" Enter second number : ");
		double number2 = input.nextDouble();

		//calculation
		double diffrance = number1-number2;
		
		if(diffrance<0){
			diffrance*=-1;
		}
		System.out.println(" Absolute difference between two numbers is "+diffrance);
	}
}

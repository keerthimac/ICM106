import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter first number : ");
		double number1 = input.nextDouble();
		System.out.print(" Enter second number : ");
		double number2 = input.nextDouble();

	
		if(number1<number2){
			System.out.println(" The first number is less than the second number");
		}else if(number1>number2){
			System.out.println(" The first number is greater than the second number");
		}else if(number1==number2){
			System.out.println(" Both are equal");
		}
	}
}

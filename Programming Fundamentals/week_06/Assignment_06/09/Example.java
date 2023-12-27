import java.util.*;
class Example {
	public static void decimalRoundTwo(double num1){
		System.out.printf(" %1.2f",num1);
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter decimal number : ");
		double num = input.nextDouble();
		decimalRoundTwo(num);
	}
}

import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number one: ");
		int num1 = input.nextInt();
		System.out.print("Enter number two: ");
		int num2 = input.nextInt();

		boolean result = false;
		if((num1>0 && num2>0)||(num1<0 && num2<0)){
			result = true;
		}
		System.out.println(result);
	}
}

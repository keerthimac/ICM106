import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter number one: ");
		int num1 = input.nextInt();
		System.out.print(" Enter number two: ");
		int num2 = input.nextInt();
		System.out.print(" Enter number three: ");
		int num3 = input.nextInt();

		if((num1<num2 && num2<num3)){
			System.out.println(" Increasing");
		}else if((num1>num2 && num2>num3)){
			System.out.println(" Decreasing");
		}else{
			System.out.println(" Neither increasing nor decreasing order");
		}
	}
}

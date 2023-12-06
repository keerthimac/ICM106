import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter first Integer number : ");
		int num1 = input.nextInt();
		System.out.print(" Enter second Integer number : ");
		int num2 = input.nextInt();
		System.out.print(" Enter thrid Integer number : ");
		int num3 = input.nextInt();
		
		boolean result = false;
        if (num1 > (num2 - num3) || num2 > (num1 - num3) || num3 > (num1 - num2)) {
            result = true;
        }
        System.out.println(result);
	}
}

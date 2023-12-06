import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter first Integer number : ");
		int number1 = input.nextInt();
		System.out.print(" Enter second Integer number : ");
		int number2 = input.nextInt();
		System.out.print(" Enter thrid Integer number : ");
		int number3 = input.nextInt();
		
		//rightmost digit of 3 numbers
		int num1 = number1%10;
		int num2 = number2%10;
		int num3 = number3%10; 
		
		boolean result = false;
		if(num1==num2 || num1==num3|| num2==num3){
			result = true;
			System.out.println(result);
		}else{
			System.out.println(result);
		}
	}
}

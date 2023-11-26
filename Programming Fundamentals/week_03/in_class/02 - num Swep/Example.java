import java.util.*;

class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input No 01: ");
		int num1 = input.nextInt();
		System.out.print("Input No 02: ");
		int num2 = input.nextInt();
		System.out.println(num1+" "+num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		
		num1 = num1-num2;

		System.out.println(num1+" "+num2);		
		
	}
}
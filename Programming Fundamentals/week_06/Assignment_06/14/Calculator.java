import java.util.*;
class Calculator {
	public static void add(int a ,int b){
		System.out.println(" "+a+" + "+b+" : "+(a+b));
	}
	public static void subtraction(int a ,int b){
		System.out.println(" "+a+" - "+b+" : "+(a-b));
	}
	public static void multiplication(int a ,int b){
		System.out.println(" "+a+" * "+b+" : "+(a*b));
	}
	public static void dividend(int a ,int b){
		System.out.println(" "+a+" / "+b+" : "+(a/b));
	}
	public static void reminder(int a ,int b){
		System.out.println(" "+a+" % "+b+" : "+(a%b));
	}
	public static void power(int a ,int b){
		int tem = a;
		for(int i = 1 ; i<b ; i++){
			tem*=a;
		}
		System.out.println(" "+a+" ^ "+b+" : "+tem);
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the first number : ");
		int num1 = input.nextInt();
		System.out.print(" Enter the second number : ");
		int num2 = input.nextInt();
		System.out.print(" Enter the operator (+,-,*,/,%,^) : ");
		char operator = input.next().charAt(0);
		switch(operator){
			case '+': add(num1,num2);break;
			case '-': subtraction(num1,num2);break;
			case '*': multiplication(num1,num2);break;
			case '/': dividend(num1,num2);break;
			case '%': reminder(num1,num2);break;
			case '^': power(num1,num2);break;
		}
	}
}

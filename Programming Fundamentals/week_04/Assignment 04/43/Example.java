import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First number          : ");	
		int num1 = input.nextInt();
		System.out.print("Enter Second number         : ");	
		int num2 = input.nextInt();
		System.out.print("Enter Operator (+,-,*,/,%,^): ");	
		char sign = input.next().charAt(0);
		
		switch(sign){
			case '+':System.out.println(num1+" "+sign+" "+num2+" = "+(num1+num2));break;
			case '-':System.out.println(num1+" "+sign+" "+num2+" = "+(num1-num2));break;
			case '*':System.out.println(num1+" "+sign+" "+num2+" = "+(num1*num2));break;
			case '/':System.out.println(num1+" "+sign+" "+num2+" = "+(num1/num2));break;
			case '%':System.out.println(num1+" "+sign+" "+num2+" = "+(num1%num2));break;
			case '^':System.out.println(num1+" "+sign+" "+num2+" = "+Math.pow(num1,num2));break;
		}
	}
}

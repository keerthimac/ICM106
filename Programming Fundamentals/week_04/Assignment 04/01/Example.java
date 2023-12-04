import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1 = input.nextInt();
		
		System.out.print("Enter Second Number : ");
		int num2 = input.nextInt();
		
		int result = 0;
		if(num1>num2){
			result = num1+num2;
			System.out.println(num1+" is Greater Than "+num2+". So addition of two numbers is "+result+".");
		}else{
			System.out.println(num1+" is Less Than "+num2+".");
		}
	}
}

import java.util.*;
class Example {
	public static void swapNumbers(int x ,int y){
		System.out.println(" You Entered x:"+x+" & y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(" After swep x:"+x+" & y:"+y);
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter x : ");
		int num1 = input.nextInt();
		System.out.print(" Please enter y : ");
		int num2 = input.nextInt();
		swapNumbers(num1,num2);
	}
}

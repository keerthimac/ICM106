import java.util.*;
class Example {
	public static void compareNumbers(int a, int b){
		char symbol ='=';
		if(a<b){
			symbol = '<';
		}else if(a>b){
			symbol = '>';
		}
		System.out.print(" "+a+" "+symbol+" "+b);	
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter number 01 : ");
		int num1 = input.nextInt();
		System.out.print(" Please enter number 02 : ");
		int num2 = input.nextInt();
		compareNumbers(num1,num2);
	}
}

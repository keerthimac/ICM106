import java.util.*;

class Example{
	public static void printTotal(){
		Scanner input = new Scanner(System.in);
		//----------Input--------------------------
		System.out.print("Enter Integer 01 : ");
		int num1 = input.nextInt();
		System.out.print("Enter Integer 02 : ");
		int num2 = input.nextInt();
		
		//----------Process------------------------
		int total = num1+num2;
		
		//----------Output-------------------------
		System.out.println("Total is :"+total);
	}
	
	
	public static void main(String args[]){
		printTotal();
	}
}

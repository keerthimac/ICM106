import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter Integer Number : ");
		int number = input.nextInt();

		
		//Total calculation
		
		if(number<0){
			System.out.println(" "+number+" is negative number");
		}else if(number==0){
			System.out.println(" You Entered "+number);
		}else{
			System.out.println(" "+number+" is positive number");
		}
	}
}

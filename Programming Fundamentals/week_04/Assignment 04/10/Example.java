import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter Integer Number : ");
		int number = input.nextInt();

		
		//Total calculation
		
		if(number%2==0){
			System.out.println(" "+number+" is even number");
		}else{
			System.out.println(" "+number+" is odd number");
		}
	}
}

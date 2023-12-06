import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num1 = input.nextInt();
		
        //get rightmost digit
        int digit = num1%10;

		if(num1%7==0 || digit==7){
			System.out.println("you Entered Buzz Number");
		}else{
			System.out.println("you did not Entered Buzz Number");
		}
	}
}

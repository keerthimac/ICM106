import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = input.nextInt();
		int lDigit = num%10;
		int fDigit = 0;
		while(num>0){
			fDigit = num%10;
			num/=10;
		}
		if(lDigit==fDigit){
			System.out.println("You Entered palindrome Number");
		}else{
			System.out.println("You did not Entered palindrome Number");
		}
	}
}



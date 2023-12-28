import java.util.*;

class Example{
	public static int reverse(int num){
		int rev=0;
		while(num!=0){
			rev*=10;
			rev+=num%10;
			num/=10;
		}
		return rev;
	}
	
	public static boolean isPalindrome(int num){
		return num==reverse(num);
	}
	public static void main(String args[]){
		for (int i = 0; i < 1000; i++){
			if(isPalindrome(i)){
				System.out.println(i);
			}
		}
		
	}
}

/*

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

	

*/




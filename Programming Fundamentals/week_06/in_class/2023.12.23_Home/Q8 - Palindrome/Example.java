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
	public static boolean isPalindrome(int i){
		return reverse(i)==i;
	}

	public static void main(String args[]){
		for (int i = 0; i < 1000; i++){
			if(isPalindrome(i)){
				System.out.println(i);
			}
		}
		
	}
}








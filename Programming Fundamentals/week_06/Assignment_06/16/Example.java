import java.util.*;
class Example {
	public static boolean checkPerfect(int a){
		int tem = a;
		int sum = 0;
		for(int i = a-1 ; i>0 ; i--){
			if(tem%i==0){
				sum+=i;
			}
		}
		return sum==a;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter x : ");
		int num = input.nextInt();
		System.out.print(checkPerfect(num)?" You Entered Perfect Number":"You Did Not Entered Perfect Number");
	}
}

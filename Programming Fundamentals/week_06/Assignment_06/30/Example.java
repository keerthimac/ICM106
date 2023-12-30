import java.util.*;
class Example{
	public static void digitReturn(int num){
		int tem = num;
		int evenDigits = 0;
        int oddDigits = 0;
		do{
			int digit=tem%10;
			if(digit%2==0){
				evenDigits = evenDigits * 10 + digit;
			}else if(digit%2!=0){
				oddDigits = oddDigits * 10 + digit;
			}
		}while((tem/=10) != 0);
		System.out.print(" "+oddDigits+" "+evenDigits);
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print(" Please Enter positive Integer :");
		int num = input.nextInt();
		digitReturn(num);
	}
}

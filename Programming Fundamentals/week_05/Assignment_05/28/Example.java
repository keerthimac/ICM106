import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Integer :");
		int num1 = input.nextInt();
		int num2 = num1;
		int count = 0;
		int total = 0;
		while(num2>0){
			count++;
			num2/=10;
			int num3 =num1%10;
			num1/=10;
			total += num3;
			System.out.print(num3);
		}
	}
}

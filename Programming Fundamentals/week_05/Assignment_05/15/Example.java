import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Integer :");
		int num1 = input.nextInt();
		int num2 = num1;
		int count = 0;
		int total = 0;
		for(;num2>0;){
			num2/=10;
			count++;
			int num3 =num1%10;
			num1/=10;
			total += num3;
		}
		System.out.println("Total = "+total);
	}
}



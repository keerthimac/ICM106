import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Integer :");
		int num1 = input.nextInt();
		int num2 = num1;
		int count = 0;
		for(;num2>0;){
			num2/=10;
			count++;
			}
		System.out.println(count);
		int total = 0;
		for(int i=0;i<count;i++){
			num1%=10;
			total += num1/10;
			System.out.println(num1);
		}
		System.out.println(total);
	}
}



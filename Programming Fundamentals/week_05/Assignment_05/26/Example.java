import java.util.*;

class Example {
	public static void main(String args[]) {
		Random number = new Random();
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter your desired number :");
		int dis = input.nextInt();
		int num = 0;
		int count = 0;
		while(dis!=num){
			num = number.nextInt(6)+1;
			System.out.println(num);
			count++;
		}
		System.out.println();
		System.out.println("You have Rolled "+count+" times for get desired number");
	}
}

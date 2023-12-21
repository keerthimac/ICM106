import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers 01 :");
		int integer1 = input.nextInt();
		System.out.print("Enter integers 02 :");
		int integer2 = input.nextInt();
		while (integer2 != 0) {
			int temp = integer2;
			integer2 = integer1 % integer2;
			integer1 = temp;
		}
		System.out.println("Greatest common deviser is :"+integer1);
	}
}




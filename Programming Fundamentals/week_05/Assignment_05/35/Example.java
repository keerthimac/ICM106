import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base number :");
		int base = input.nextInt();
		System.out.print("Enter exponent :");
		int expo = input.nextInt();
		int answer = 1;
		for(int i=0;i<expo;i++){
				answer*=base;
		}
		System.out.println("Answe is : "+answer);
	}
}



import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter person age: ");
		int age = input.nextInt();
		System.out.print(" Enter number weight in kg: ");
		int weight = input.nextInt();

		if( age>=18 && weight>=50){
			System.out.println(" You are eligible to donate blood");
		}else{
			System.out.println(" You are not eligible to donate blood");
		}
	}
}

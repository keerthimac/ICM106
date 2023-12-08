import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter lower limit : ");	
		int lower = input.nextInt();
		System.out.print("Enter higher limit : ");	
		int higher = input.nextInt();
		System.out.print("Enter your number : ");	
		int number = input.nextInt();		
		if(lower>higher){
			System.out.println("your number range is wrong");
		}else if(number>higher){
			System.out.println("your number is upper bound in the given range ");
		}else if(number<lower){
			System.out.println("your number is lower bound in the given range ");
		}else if(number>=lower && number<=higher){
			System.out.println("your number is in the range ");
		}
	}
}


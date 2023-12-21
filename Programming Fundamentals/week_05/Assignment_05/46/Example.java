import java.util.*;

class Example {
	public static void main(String [] args) {
		Random number = new Random();
		Scanner input = new Scanner(System.in);
		final int RanNum = number.nextInt(10)+1;
		int num = 0;
		while(num!=RanNum){
			System.out.print("Guess the number (1-10): ");
			num = input.nextInt();
			if(num>RanNum){
				System.out.println("Too high, try again");
			}else if(num<RanNum){
				System.out.println("Too Low, try again");
			}
		}
		System.out.println();
		System.out.println("Your Guess is Coerrect. Number is "+RanNum);	
	}
}





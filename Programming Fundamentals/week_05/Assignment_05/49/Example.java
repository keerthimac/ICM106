import java.util.*;

class Example {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int inputNum = input.nextInt();
		int num = inputNum;
		int count = 0;
		int total = 0;
		while(num>0){
			int digit = num%10;
			int cal = digit*digit*digit;
			total+=cal;
			num/=10;
		}
		if(inputNum==total){
			System.out.println("You Entered Armstrong number");
		}else{
			System.out.println("You did not Entered Armstrong number");
		}
	}
}






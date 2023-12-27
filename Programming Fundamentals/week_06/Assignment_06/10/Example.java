import java.util.*;
class Example {
	public static void howMuchMoneyDeposit(double sum){
		double monthIntrest = 20.0/12;
		System.out.printf(" amount you Need To deposit : %,.2f",(sum*100/(20.0/12)));
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter your desired monthly income : ");
		int amount = input.nextInt();
		howMuchMoneyDeposit(amount);
	}
}

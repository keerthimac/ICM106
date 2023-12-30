import java.util.*;

class Example {
	public static void rollDice(){
		Random input = new Random();
		int num1 = 0;
		int num2 = 0;
		int count = 0;
		do{
			count++;
			num1 = input.nextInt(6)+1;
			num2 = input.nextInt(6)+1;
			System.out.print(num1+" "+num2);
			System.out.println();
		}while(num1!=num2);
		System.out.println("Dice roll - "+count+" times");
	}
	
	
	
	public static void main(String args[]) {
		rollDice();
	}
}


import java.util.*;

class Example{
public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an Integer: ");
		int j = input.nextInt();
		System.out.print("[ ");
		for (int i = 0; i < j; i++){
			System.out.print((i)+", ");
		}
		System.out.println("\b\b ]");

	}
} 



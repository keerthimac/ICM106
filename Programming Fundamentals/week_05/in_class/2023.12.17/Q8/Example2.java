import java.util.*;

class Example2{
public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an Integer: ");
		int j = input.nextInt();
		System.out.print("[ ");
		for (int i = j; i > 0; i--){
			System.out.print(i+", ");
		}
		System.out.println(j<=0?"empty ]":"\b\b ]");
	}
} 



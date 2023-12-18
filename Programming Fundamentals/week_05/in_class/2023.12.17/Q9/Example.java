import java.util.*;

class Example{
public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input Lower bound: ");
		int lower = input.nextInt();
		System.out.print("Input Upper bound: ");
		int upper = input.nextInt();
		System.out.print("[ ");
		if(lower>upper){
		int tem = lower;
		lower = upper;
		upper = tem;	
		}
		for (int i = lower; i <= upper; i++){
		System.out.print(i+", ");
		}
		System.out.println("\b\b ]");
	}
} 



import java.util.*;

class Example{
public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an Integer: ");
		int num = input.nextInt();
		int sum = 1;
		System.out.print("[ ");
		for (int i = num; i >= 1; i--){
		System.out.print(i+" * ");
		sum*=i;
		}
		System.out.println(num<=0?"1 ]":"\b\b = "+sum+" ]");
	}
} 



import java.util.*;

class Example{
public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an Integer: ");
		int num = input.nextInt();
		int sum = 0;
		System.out.print("[ ");
		for (int i = 1; i <= num; i++){
		System.out.print(i+" + ");
		sum+=i;
		}
		System.out.println(num<=0?"0 ]":"\b\b = "+sum+" ]");
	}
} 



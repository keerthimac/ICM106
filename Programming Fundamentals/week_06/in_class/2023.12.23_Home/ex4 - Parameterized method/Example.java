import java.util.*;

class Example{
	public static void printSumOfDigits(int a){
		//---Process------------
		int sum=0;
		int temp=a;
		while(temp!=0){
			sum+=temp%10;
			temp/=10;
		}
		//---Output-------------
		System.out.println("Sum of digits for "+a+" : "+sum);
	}
	public static void main(String args[]){
		//---Input--------------
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		
	
		printSumOfDigits(num);
	}
}



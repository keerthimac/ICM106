import java.util.*;

class Example{
	public static void PrintSumOfDigits(){
		Scanner input = new Scanner(System.in);
		//----------Input--------------------------
		System.out.print("Enter Number : ");
		int num = input.nextInt();
		
		//----------Process------------------------
		int sum=0;
		int tem = num;
		while(tem>0){
			//int digit = tem%10;
			//sum+=digit;
			sum+=tem%10;
			tem/=10;
		}
		
		//----------Output-------------------------
		System.out.println("Sum of digits for "+num+" is :"+sum);
	}
	
	
	public static void main(String args[]){
		PrintSumOfDigits();
	}
}

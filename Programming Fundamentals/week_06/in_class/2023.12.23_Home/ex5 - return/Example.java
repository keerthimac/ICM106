import java.util.*;


class Example{
	public static int  calTotal(int a, int b){
		//---Process------------
		int total=a+b;
		return total;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1=input.nextInt();
		System.out.print("Input number 2 : ");
		int num2=input.nextInt();
		
		int total;
		total=calTotal(num1,num2);

		//---Output-------------
		System.out.println(num1+" + "+num2+" = "+total);
		
	}
} 




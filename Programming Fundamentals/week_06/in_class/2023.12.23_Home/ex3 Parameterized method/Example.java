import java.util.*;

class Example{
	//-------------------Method Declaration--------------------
	public static void printTotal(int a, int b){//Method Parameters
		//---Process------------
		int total=a+b;
		//---Output-------------
		System.out.println(a+" + "+b+" = "+total);
	}
	//---------------------------------------------------------
	public static void main(String args[]){
		//---Input--------------
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1=input.nextInt();
		System.out.print("Input number 2 : ");
		int num2=input.nextInt();
		
		printTotal(num1,num2);//Method arguments
		printTotal(10,20);//Method arguments
	}
}


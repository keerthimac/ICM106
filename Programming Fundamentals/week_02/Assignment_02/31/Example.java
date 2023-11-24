import java.util.*;
	class Example{
		public static void main(String[] args){
		
		//a)
		int x,y;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter X Value :");
		x=input.nextInt();
		System.out.print("Enter Y Value :");
		y=input.nextInt();
		
		//b).
		System.out.println("1st input-"+x);
		System.out.println("2nd input-"+y);
		
		//c).
		int z;
		z=x+y;
		System.out.println(x+" "+y+" = "+z);
		
	}
}
import java.util.*;
	class Example{
		public static void main(String[] args){
		int p,q,r;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Green Value :");
		p=input.nextInt();
		System.out.print("Enter Red Value :");
		q=input.nextInt();
		System.out.print("Enter Blue Value :");
		r=input.nextInt();
		System.out.println("Inversion of given color -["+(255-p)+","+(255-q)+","+(255-r)+"]");	
	}
}
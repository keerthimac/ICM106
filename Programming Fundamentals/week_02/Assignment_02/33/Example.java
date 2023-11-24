import java.util.*;
	class Example{
		public static void main(String[] args){
		int p,q,r,s,t;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your Marks");
		System.out.print("Combined Maths :");
		p=input.nextInt();
		System.out.print("Chemistry :");
		q=input.nextInt();
		System.out.print("Physics :");
		r=input.nextInt();
		System.out.print("English :");
		s=input.nextInt();
		t=p+q+r+s;
		System.out.println("\n\n");
		System.out.println("Combined Maths-"+p);
		System.out.println("Chemistry     -"+q);
		System.out.println("Physics       -"+r);
		System.out.println("English       -"+s);
		System.out.println("Total         -"+t);
		
	}
}
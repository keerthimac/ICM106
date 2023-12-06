import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" First number A : ");
		int a = input.nextInt();
		System.out.print(" Second number B : ");
		int b = input.nextInt();
		System.out.print(" Third number C : ");
		int c = input.nextInt();
		
		//Total calculation
		
		if(a>b & a>c){
			System.out.println(" Maximum number is A = "+a);
		}else if(b>a & b>c ){
			System.out.println(" Maximum number is B = "+b);
		}else{
			System.out.println(" Maximum number is C = "+c);
		}
	}
}

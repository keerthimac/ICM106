import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter Chemistry Marks : ");
		double chemistry = input.nextDouble();
		System.out.print(" Enter Physics Marks : ");
		double physics = input.nextDouble();
		System.out.print(" Enter Combined MathsMarks : ");
		double maths = input.nextDouble();
		
		//Avarage calculation
		double result = (chemistry + physics + maths)/3 ;
		
		
		if(result>=75.00){
			System.out.println(" Pass");
		}else{
			System.out.println(" Fail");
		}
	}
}

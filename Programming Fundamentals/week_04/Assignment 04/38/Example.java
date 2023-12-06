import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter attendance presentage %: ");	
		double attendance = input.nextDouble();
		
		System.out.print(" Enter avarage Marks %: ");	
		double marks = input.nextDouble();
		
		System.out.print(attendance>=80 && marks>=50?" You are eligible to sit O/L exam":" You are not eligible to sit O/L exam");
	}
}

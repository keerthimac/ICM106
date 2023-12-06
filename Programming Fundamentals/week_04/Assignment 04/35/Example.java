import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Temperature: ");
		double temp= input.nextDouble();
		
		System.out.println(temp>=80 ? "Swimming":temp>=60 && temp<80?"Tennis":temp>=40 && temp<60?"Golf":"Skiing");
		//:temp=60 && temp<80?"Tennis":temp>=40 && temp<60?"Golf":"Skiing");
	
	}
}

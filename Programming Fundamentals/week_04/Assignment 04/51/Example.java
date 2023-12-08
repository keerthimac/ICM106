import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");	
		int age = input.nextInt();

		System.out.println(age>65?"Senior":age>20&&age<=65?"Adult":age>13&&age<=20?"Teenager":age>1&&age<=13?"child":"Infant");	
	}
}


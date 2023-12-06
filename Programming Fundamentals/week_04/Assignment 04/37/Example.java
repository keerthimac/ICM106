import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter current annual salary: ");	
		double salary = input.nextDouble();
		
		System.out.print(" Enter Performance rating (1=excellent, 2=good, and 3=poor).: ");	
		int rating = input.nextInt();
		
		switch(rating){		
			case 1 :System.out.printf(" your perfomance raise is : %1.2f and your new salary is %1.2f",salary*6/100,salary*1.06);break;
			case 2 :System.out.printf(" your perfomance raise is : %1.2f and your new salary is %1.2f",salary*4/100,salary*1.04);break;
			case 3 :System.out.printf(" your perfomance raise is : %1.2f and your new salary is %1.2f",salary*1.5/100,salary*1.015);break;
		}
	}
}

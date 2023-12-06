import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Basic Salary: ");	
		double salary = input.nextDouble();
		
		double ha = 0;
		double ta = 0;
		if(salary<=10000){
			ha=salary*0.2;
			ta=salary*0.6;
		}else if(salary<=20000){
			ha=salary*0.25;
			ta=salary*0.7;
		}else if(salary>20000){
			ha=salary*0.3;
			ta=salary*0.75;
		}
		System.out.println("Gross Salary :"+(salary+ha+ta));
	}
}


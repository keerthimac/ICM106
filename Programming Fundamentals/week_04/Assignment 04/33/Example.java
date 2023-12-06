import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Salary: ");
		int salary= input.nextInt();
		System.out.print("Enter Years of Service: ");
		int years = input.nextInt();
		
        //calculate presentage
        if(years<5){
			salary *= 1.1;
		}else if(years>=5 && years<10){
			salary *=1.15;
		}else if(years>=10){
			salary *=1.25;
		}
		System.out.println("Total salary with bonus is "+salary);	
	}
}

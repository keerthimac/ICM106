import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Date");
		System.out.println("\n");
		System.out.print("Enter year : ");	
		int year1 = input.nextInt();
		System.out.print("Enter month : ");	
		int month1 = input.nextInt();
		System.out.print("Enter day : ");	
		int day1 = input.nextInt();
		
		System.out.println("\n\n");
		System.out.println("Second Date");
		System.out.println("\n");
		System.out.print("Enter year : ");	
		int year2 = input.nextInt();
		System.out.print("Enter month : ");		
		int month2 = input.nextInt();
		System.out.print("Enter day : ");	
		int day2 = input.nextInt();
		System.out.println("\n\n");
		
		if(year1>year2){
			System.out.print("Second Date came first");	
		}else if(year1<year2){
			System.out.print("First Date came first");	
		}else if(year1==year2 && month1>month2){
			System.out.print("Second Date came first");	
		}else if(year1==year2 && month1<month2){
			System.out.print("First Date came first");	
		}else if(year1==year2 && month1==month2 && day1>day2){
			System.out.print("Second Date came first");	
		}else if(year1==year2 && month1==month2 && day1<day2){
			System.out.print("First Date came first");	
		}
	}
}


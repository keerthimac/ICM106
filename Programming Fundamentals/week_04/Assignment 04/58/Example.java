import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Date");
		System.out.println("\n");
		System.out.print("Enter year : ");	
		int year = input.nextInt();
		System.out.print("Enter month : ");	
		int month = input.nextInt();
		System.out.print("Enter day : ");	
		int day = input.nextInt();
		
		System.out.println("\n\n");
		
		int year0 = year-(14-month)/12;
		int x = year0+(year0/4)-(year0/100)+(year0/400);
		int month0 = month+12*((14-month)/12)-2;
		int day0 = (day+x+(31*month0)/12)%7;
		
		String date = " ";
		switch(day0){
		case 0 : date ="Sunday";break;
		case 1 : date ="Monday";break;
		case 2 : date ="Tuesday";break;
		case 3 : date ="Wednesday";break;
		case 4 : date ="Thursday";break;
		case 5 : date ="Friday";break;
		case 6 : date ="Saturday";break;
		}
		System.out.print("Day of the Week : "+date);
	}
}


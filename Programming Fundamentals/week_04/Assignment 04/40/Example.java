import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter Year: ");	
		int year = input.nextInt();
		boolean leapOrNot = (year%4==0 && year%100!=0) || (year%400==0)?true:false;
		System.out.print(" Enter month (1-12): ");	
		int month = input.nextInt();
		
		switch(month){
			case 1 : System.out.print(" 31 Days");break;
			case 2 : System.out.print(leapOrNot?" 29 Days":" 28 Days");break;
			case 3 : System.out.print(" 31 Days");break;
			case 4 : System.out.print(" 30 Days");break;
			case 5 : System.out.print(" 31 Days");break;
			case 6 : System.out.print(" 30 Days");break;
			case 7 : System.out.print(" 31 Days");break;
			case 8 : System.out.print(" 31 Days");break;
			case 9 : System.out.print(" 30 Days");break;
			case 10 : System.out.print(" 31 Days");break;
			case 11 : System.out.print(" 30 Days");break;
			case 12 : System.out.print(" 31 Days");break;
		}
	}
}

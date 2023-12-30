import java.util.*;
class Example{
	public static void checkMonth(String month){
		boolean status = false;
		boolean isFebruary = false;
		boolean isNothing = false;
		
		switch(month.toLowerCase()){
			case "january" : status=true;break;
			case "february" : status=false; isFebruary=true;break; 
			case "march" : status=true;break; 
			case "april" : status=false;break; 
			case "may" : status=true;break;
			case "june" : status=false;break; 
			case "july" : status=true;break; 
			case "august" : status=true;break; 
			case "september" : status=false;break; 
			case "october" : status=true;break; 
			case "november" : status=false;break; 
			case "dececmber" : status=true;break;
			default : status=true;isNothing=true;break; 
		}
		System.out.println(isFebruary?" Days 28":isNothing?" Please enter correct month":status?" Days 31":" Days 30");
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print(" Please Enter Month :");
		String month = input.nextLine();
		checkMonth(month);
	}
}

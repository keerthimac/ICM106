import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter number of copies: ");	
		int copies = input.nextInt();
		
		if(copies>0 && copies<100){
			System.out.print(" Rs.30.00 per copy & your total amount is "+copies*30);
		}else if(copies>=100 && copies<500){
			System.out.print(" Rs.28.00 per copy & your total amount is "+copies*28);
		}else if(copies>=500 && copies<800){
			System.out.print(" Rs.27.00 per copy & your total amount is "+copies*27);
		}else if(copies>=800 && copies<=1000){
			System.out.print(" Rs.26.00 per copy & your total amount is "+copies*26);
		}else{
			System.out.print(" Rs.25.00 per copy & your total amount is "+copies*25);
		}
	}
}

import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter Negative or Positive Integer : ");
		int number = input.nextInt();
		
		
		if(number<0){
			System.out.println(" You Entered "+number+". absolute number of "+number+" is +"+-number+".");
		}else{
			System.out.println(" You Entered "+number+". absolute number of "+number+" is +"+number+".");
		}
	}
}

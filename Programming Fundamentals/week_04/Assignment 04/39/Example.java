import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter time in 00:00 24h format: ");	
		String time = input.nextLine();
		
		// Extract the hour from the input string
        int hour = Integer.parseInt(time.split(":")[0]);
        
		System.out.println(hour>=0 && hour<12?" Good morning":hour>=12&&hour<16?" Good afternoon":hour>=16&&hour<19?"Good evening":hour>=19&&hour<=24?"Good night":" Enter Correct Time");
	}
}

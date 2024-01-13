import java.util.*;
class Example {
	public static void main(String args[]) {
		//i days array
		String[] days ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};

		
		//ii Print Days Array
		System.out.println(Arrays.toString(days));
		
		System.out.println();
		
		//iii Print Reverse
		System.out.print("[");
		for (int i = days.length-1; i >=0; i--){
			System.out.print(days[i]+", ");
		}
		System.out.print("\b\b]");
	}	
}

import java.util.*;

class Example {
	public static void main(String args[]) {
		for(int i=0 ; i<10 ; i++){
			Random input = new Random();
			int num = input.nextInt(100);
			System.out.println(num);
		}
	}
}


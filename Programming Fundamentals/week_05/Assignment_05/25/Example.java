import java.util.*;

class Example {
	public static void main(String args[]) {
		Random input = new Random();
		for(int i= 0;i<5;i++){
			int num = input.nextInt(6)+1;
			System.out.print(num+" ");
		}
	}
}

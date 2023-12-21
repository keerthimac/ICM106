import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Anything :");
		String word = input.nextLine();
		int length = word.length();
		for(int i = length; i>0; i--){
			System.out.print(word.charAt(i-1));
		}
	}
}


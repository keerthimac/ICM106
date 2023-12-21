import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Word :");
		String wordInput = input.next();
		String word = wordInput.toLowerCase();
		System.out.print("Enter character :");
		char charInput = input.next().charAt(0);
		int length = word.length();
		int charCount =0;
		int count =0;
		for(int i=0;i<length;i++){
			char letter = word.charAt(i);
			if(charInput==letter){
				count++;
			}
		}
		System.out.println("You Entered "+charInput+" character "+count+" times");
	}
}



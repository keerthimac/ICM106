import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Word :");
		String wordInput = input.next();
		String word = wordInput.toLowerCase();
		int length = word.length();
		int count =0;
		for(int i=0,j=(length-1);j>=0;i++,j--){
			char letterl = word.charAt(i);
			char letter2 = word.charAt(j);
			if(letterl==letter2){
				count++;
			}
		}
		if(count==length){
			System.out.println("You Entered palindrome Word");
		}else{
			System.out.println("You did not Entered palindrome Word");
		}
	}
}



import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Word :");
		String wordInput = input.next();
		String word = wordInput.toLowerCase();
		int length = word.length();
		int voCount =0;
		int count =0;
		for(int i=0;i<length;i++){
			char letter = word.charAt(i);
			if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
				count++;
			}
		}
		System.out.println("number of vowels :"+count);
		System.out.println("number of consonants :"+(length-count));
	}
}




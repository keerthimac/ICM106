import java.util.*;
class Example {
	public static boolean compareFirstLetter(String word1, String word2){
		char letter1 = word1.toLowerCase().charAt(0);
		char letter2 = word2.toLowerCase().charAt(0);
		return letter1==letter2;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter Word 01 : ");
		String w1 = input.nextLine();
		System.out.print(" Please enter Word 02 : ");
		String w2 = input.nextLine();
		System.out.println(" "+compareFirstLetter(w1,w2));
	}
}

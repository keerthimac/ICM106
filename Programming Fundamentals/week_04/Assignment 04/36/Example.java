import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the English Letter: ");
		
		//capture letter as a String
		String inputLetter = input.nextLine();
		//Capture letter from String
        char letter = inputLetter.charAt(0);
        //casting to integer
        int conLetter = (int)letter;
        //Check user entered English Letter
        if(conLetter <65 || conLetter >122){
			System.out.println(" you did not enter English Letter");
		}
		
		if(conLetter==97||conLetter==101||conLetter==105||conLetter==111||conLetter==117||conLetter==65||conLetter==69||conLetter==73||conLetter==79||conLetter==85){
			System.out.println(" you Entered vowel");
		}else{
			System.out.println(" you Entered consonant");
		}
	}
}

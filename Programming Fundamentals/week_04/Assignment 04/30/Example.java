import java.util.*;

class Example {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character: ");

		//capture letter as a String
        String inputString = input.nextLine();
        //capture letter from String
        char letter = inputString.charAt(0);
        //casting to interger
        int conLetter = (int)letter;
 
		if(conLetter >=65 && conLetter <=90){
			System.out.println("you Entered uppercase Letter");
		}else if(conLetter >=97 && conLetter <=122){
			System.out.println("you Entered lowercase Letter");
		}else{
			System.out.println("Please Enter English Letter");
		}
    }
}

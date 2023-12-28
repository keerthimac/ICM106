import java.util.*;
class Example{
	public static void vowelChecker(String word){
		int count = 0;
		for(int i = 0; i<word.length() ; i++){
			char letter = word.toLowerCase().charAt(i);
			if(letter == 'a'||letter =='e'|| letter=='i'|| letter=='o'|| letter=='u'){
				count++;
			}
		}
		System.out.print("Number of vowels : "+count);
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print(" Please Enter Word :");
		String word = input.nextLine();
		vowelChecker(word);
	}
}

import java.util.*;
class Example {
	public static void printAlphabet(){
		for(char i = 65, j=97 ; i<91 ; i++,j++){
			System.out.print(i+""+j+" ");
		}
	}
	
	public static void main(String args[]) {
		printAlphabet();
	}
}

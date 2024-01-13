import java.util.*;
class Example {
	public static void main(String args[]) {
		//i Array to store Block letters
		char[] letters ={65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
		
		//ii Print that array as follows[ A, B, C, D, …………….]
		System.out.print("[");
		for (int i = 0; i < letters.length; i++){
			System.out.print(letters[i]+", ");
		}
		System.out.print("\b\b]");
		
		System.out.println();	
		
		//iii Print the block letters in the even index of an array.
		System.out.print("[");
		for (int i = 0; i < letters.length; i+=2){
			System.out.print(letters[i]+", ");
		}
		System.out.print("\b\b]");
		
		System.out.println();
		
		//iv Print the block letters in the odd index of an array.
		System.out.print("[");
		for (int i = 1; i < letters.length; i+=2){
			System.out.print(letters[i]+", ");
		}
		System.out.print("\b\b]");	
						
		System.out.println();
		
		//v Print the array in reverse order..
		System.out.print("[");
		for (int i = letters.length-1; i >=0; i--){
			System.out.print(letters[i]+", ");
		}
		System.out.print("\b\b]");		
		
	}	
}

import java.util.*;
class Example {
	public static void printStringInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter String : ");
		String stringInput = input.next();
		System.out.println(stringInput);
	}
	
	public static void main(String args[]) {
		printStringInput();
	}
}

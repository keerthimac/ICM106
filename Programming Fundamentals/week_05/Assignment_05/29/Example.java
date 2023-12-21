import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many bottles of beer are on the wall :");
		int bottle = input.nextInt();
		System.out.println();
		for(int i = bottle; i>0 ; i--){
			System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer.");
			System.out.println("Take one down, pass it around, "+((i-1)==0?"no":(i-1))+" bottles of beer on the wall.");
			System.out.println();
		}
	}
}

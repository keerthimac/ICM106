import java.util.*;

class Example {
	public static boolean checkValidTriangle(int x, int y, int z) {
		return x + y > z||x + z > y||y + z > x;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Distance x: ");	
		int x = input.nextInt();
		System.out.print("Enter Distance y: ");	
		int y = input.nextInt();
		System.out.print("Enter Distance z: ");	
		int z = input.nextInt();
		System.out.print("Valid Triangle ?: "+checkValidTriangle(x,y,z));
	}
}


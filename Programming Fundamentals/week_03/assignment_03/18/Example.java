import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the Kilobyte Value: ");
		double kByte = input.nextInt();
		
	
		//Megabyte Calculation
		double mByte = kByte/1024;
		System.out.println(mByte+" Megabytes");
				
		//Gigabyte Calculation
		double gByte = mByte/1024;
		System.out.println(gByte+" Gigabytes");		
		
	}
}

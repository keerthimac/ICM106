import java.util.*;

class Example {
	public static void main(String asrg[]) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter Price of the Product : ");
		double price = input.nextInt();
		
		System.out.print(" Enter Discount of the Product : ");
		double discount = input.nextInt();
		
		//Discount Calculation
		double disCal = price * (discount/100);
		System.out.println(" Discount is : "+disCal);
		
		
	}
}

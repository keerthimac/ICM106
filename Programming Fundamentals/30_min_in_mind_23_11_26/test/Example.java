import java.util.*;

class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter Kilometers: ");
		int km = input.nextInt();
		double hecto = km/10;
		double hectoBal = km%10;
		double deca = hectoBal/10;
		double decaBal = hectoBal%10;
		double meter = decaBal/10;
		double meterBal = decaBal%10;
		double desi = meterBal/10;
		double desiBal = meterBal%10;
		double centi = desiBal/10;
		double centiBal = desiBal%10;
		double mili = centiBal/10;
		
		System.out.println("Entered Km Value : "+km+"\n");
		System.out.println("Hectometre Value : "+hecto);
		System.out.println("Decametre Value : "+deca);
		System.out.println("Metre Value : "+meter);
		System.out.println("Decimetre Value : "+desi);
		System.out.println("Centimetre Value : "+centi);
		System.out.println("Millimeter Value : "+mili);

		
	}
}
		
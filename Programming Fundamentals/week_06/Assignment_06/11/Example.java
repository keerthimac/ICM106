import java.util.*;
class Example {
	public static void convertFahernKelvin(double tem){
		System.out.printf(" Fahrenheit Tempeture : %1.2f %n",(tem*9)/5+32);
		System.out.printf(" Kelvin Tempeture : %1.2f",tem+273.15);
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter Celsius Value : ");
		double temp = input.nextDouble();
		convertFahernKelvin(temp);
	}
}

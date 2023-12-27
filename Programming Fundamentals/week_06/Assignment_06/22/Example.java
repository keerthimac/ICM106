import java.util.*;
class Example{
	public static void speedConvertor(double speed){
		double convertedSpeed = speed*1000/3600;
		System.out.printf(" %1.4f mps",convertedSpeed);
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print(" Please Enter Speed (kmph) :");
		double speed = input.nextDouble();
		speedConvertor(speed);
	}
}

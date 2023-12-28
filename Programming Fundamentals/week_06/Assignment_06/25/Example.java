import java.util.*;
class Example{
	public static void sphereVolume(double x){
		double reduis = x/2;
		double vol =(4.0/3)*(22.0/7)*reduis*reduis*reduis;
		System.out.printf(" Volume of the cylinder : %1.2f ",vol);
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print(" Please Enter length of the cube :");
		double length = input.nextDouble();
		sphereVolume(length);
	}
}

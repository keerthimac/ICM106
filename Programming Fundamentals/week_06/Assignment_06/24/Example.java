import java.util.*;
class Example{
	public static void findcylinderVolume(int red , int high){
		double vol = (22.0/7)*red*red*high;
		System.out.printf(" Volume of the cylinder : %1.2f ",vol);
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print(" Please Enter Radius of the  cylinder :");
		int radius = input.nextInt();
		System.out.print(" Please Enter Height of the  cylinder :");
		int height = input.nextInt();
		findcylinderVolume(radius,height);
	}
}

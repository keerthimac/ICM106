import java.util.*;
class Example {
	public static void calPeriAndArea(double angle ,double radius){
		System.out.println(" perimeter is : "+(angle/360)*2*(22/7)*radius);
		System.out.println(" area is : "+(angle/360)*(22/7)*radius*radius);
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter angle : ");
		double angle = input.nextInt();
		System.out.print(" Please enter radius : ");
		double radius = input.nextInt();
		calPeriAndArea(angle,radius);
	}
}

import java.util.*;

class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side length of the cube filed (in meters)-> ");
		double length = input.nextInt();
		double volume = length*length*length;
		System.out.println("The volume of the cube filed is: "+volume);
		System.out.print("Enter the redius of the cone (in meters)-> ");
		double radius = input.nextInt();
		System.out.print("Enter the height of the cone (in meters)-> ");
		double height = input.nextInt();	
		double conVolume = (3.142*radius*radius*height)/3;
		
		System.out.println("The volume of the cone is: "+conVolume+" meters");
		
		double cones = volume/conVolume;
		int answer = (int)cones;
		System.out.print("The Number of cones that can be fit in the cube field is: "+answer);
	}
}

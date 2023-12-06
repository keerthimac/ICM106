import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter waist size : ");	
		int size = input.nextInt();
		if(size<28 || size>42){
			System.out.println(" Enter Correct size ");
		}
		
		if(size>=28 && size<30){
			System.out.println(" X-small");
		}else if(size>=30 && size<32){
			System.out.println(" Small");
		}else if(size>=32 && size<35){
			System.out.println(" Medium");
		}else if(size>=36 && size<39){
			System.out.println(" Large");
		}else if(size>=40 && size<43){
			System.out.println(" X-Large");
		}
	}
}

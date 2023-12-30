import java.util.*;

class Example {
	public static void findOrigin(int x, int y) {
		String origin = "";
		if(x>0&&y>0){
			origin = "Quadrant I";
		}else if(x<0&&y>0){
			origin = "Quadrant II";
		}else if(x<0&&y<0){
			origin = "Quadrant III";
		}else if(x>0&&y<0){
			origin = "Quadrant IV";
		}
		System.out.println("point lies in "+origin);	
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter X coordinate: ");	
		int x = input.nextInt();
		System.out.print("Enter Y coordinate: ");	
		int y = input.nextInt();
		findOrigin(x,y);
	}
}


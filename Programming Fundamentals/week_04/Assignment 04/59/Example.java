import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("R Value : ");	
		int r = input.nextInt();
		System.out.print("G Value : ");	
		int g = input.nextInt();
		System.out.print("B Value : ");	
		int b = input.nextInt();
		
		double c,m,y,k;
		if(r==0 && g==0 && b==0){
			c=0;
			m=0;
			y=0;
			k=1;
		}else{
		
		double w =  Math.max(r / 255.0, Math.max(g / 255.0, b / 255.0));		
		
		c = (w-(r/255))/w;
		m = (w-(g/255))/w;
		y = (w-(b/255))/w;
		k = 1-w;
		}

		System.out.printf("CMYK Value is : %1.2f %1.2f %1.2f %1.2f",c,m,y,k);
	}
}


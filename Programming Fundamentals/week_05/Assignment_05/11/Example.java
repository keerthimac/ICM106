import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int totHeight = 0;
		int totWeight = 0;
		for(int i=0 ; i<100 ; i++){
			System.out.print("Enter Student "+(i+1)+" Height :");
			int height = input.nextInt();
			totHeight +=height;
			System.out.print("Enter subject "+(i+1)+" Weight :");
			int weight = input.nextInt();
			totWeight +=weight;
			System.out.println();
		}
		double avgHeight = (double)totHeight/100;
		double avgWeight = (double)totWeight/100;
		
		System.out.println();
		System.out.println("Avarage Height of Students  :  "+avgHeight);
		System.out.println("Avarage Weight of Students  :  "+avgWeight);
	}
}


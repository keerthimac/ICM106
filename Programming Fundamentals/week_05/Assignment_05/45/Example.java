import java.util.*;

class Example {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int num = input.nextInt();
		for(int i=0 ; i<1 ; i++){
		System.out.print(" * |");
			for(int j=1 ; j<=num ; j++){
				System.out.print(" "+j+" ");
			}
		System.out.println();
		}
		System.out.println("----------------------------------");
		for(int i=1 ; i<=num ; i++){
		System.out.print(" "+i+" |");
			for(int j=1 ; j<=num ; j++){
				System.out.print(" "+(j*i)+"");
			}
		System.out.println();
		}
	}
}





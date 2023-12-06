import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Raw Number (1-8): ");	
		int raw = input.nextInt();
		System.out.print("Enter Column Number (1-8): ");	
		int col = input.nextInt();
		
		if((raw%2==0&&col%2==0)||(raw%2!=0&&col%2!=0)){
			System.out.print("White");
		}else{
			System.out.print("Black");
		}
	}
}

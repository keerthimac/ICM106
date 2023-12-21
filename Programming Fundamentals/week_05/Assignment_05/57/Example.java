import java.util.*;

class Example {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = input.nextInt();
				System.out.println();
		for(int i = num ; i>0 ; i--){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
		
	}
}






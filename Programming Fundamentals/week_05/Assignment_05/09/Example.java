import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		for(int i=0 ; i<5 ; i++){
			System.out.print("Please enter Number :");
			int num = input.nextInt();
			if(num>100){
				count++;
			}
		}
		System.out.print(count+" entered more than 100");
	}
}


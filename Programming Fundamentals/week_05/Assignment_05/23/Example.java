import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int countLess = 0;
		int countMore = 0;
		int num = 0;
		while (num!=-1){
			System.out.print("Enter Integer Number (Press -1 to exit) : ");
			num = input.nextInt();
			if(num<1000){
				countLess++;
			}else if(num>1000){
				countMore++;
			}
		}
		System.out.println();
		System.out.println("There are "+countLess+" numbers are less than 1000");
		System.out.println("There are "+countMore+" numbers are less more 1000");
	}
}

import java.util.*;
class Example {
	public static void checkMultipliers(int num, int upper, int lower){
		int tem = upper;
		int count = 0;
		for(int i = tem ; i>lower ; i-- ){
			if(i%num==0){
				count++;
			}
		}
		System.out.print("Multiples of "+num+" between "+lower+" and "+upper+" - "+count);
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number : ");
		int num = input.nextInt();
		System.out.print("The lower bound of the range : ");
		int lower = input.nextInt();
		System.out.print("The upper bound of the range : ");
		int upper = input.nextInt();
		checkMultipliers(num,upper,lower);
	}
}

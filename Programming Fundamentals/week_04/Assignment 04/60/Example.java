import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Parcel Weight : ");	
		double weight = input.nextDouble();
		
		double fee = 0;
		if(weight<=5){
			fee = 500;
		}else if(weight>5){
			double addWeight = weight - 5;
			fee = 500 + addWeight*100;
		}
		System.out.printf("courier charge is : %1.2f",fee);
	}
}


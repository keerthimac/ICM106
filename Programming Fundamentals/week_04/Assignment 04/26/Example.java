import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter selling price : ");
		double sell = input.nextDouble();
		System.out.print(" Enter cost of product : ");
		double cost = input.nextDouble();

		if((sell-cost)>0){
			System.out.println(" Profit");
		}else if((cost-sell)>0){
			System.out.println(" Loss");
		}else if(cost==sell){
			System.out.println(" No Profit No Loss");
		}
	}
}

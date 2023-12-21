import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student 1 Marks :");
		int marks = input.nextInt();
		int total = 0;
		int min = marks;
		int max = marks;
		int count = 0;
		while(marks != -1){
			total+=marks;
			if(marks>max){
				max = marks;
			}else if(marks<min){
				min = marks;
			}
			System.out.print("Enter subject "+(count+2)+" Marks :");
			marks = input.nextInt();
			count++;
		}
		double avarage = (double)total/count;
		
		System.out.println();
		System.out.println("Total  :  "+total);
		System.out.println("Max    :  "+max);
		System.out.println("Min    :  "+min);
		System.out.println("avarage:  "+avarage);
	}
}


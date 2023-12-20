import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter subject 1 Marks :");
		int marks = input.nextInt();
		int total = 0;
		total += marks;
		int min = marks;
		int max = marks;
		for(int i=1 ; i<10 ; i++){
			System.out.print("Enter subject "+(i+1)+" Marks :");
			marks = input.nextInt();
			total+=marks;
			if(marks>max){
				max = marks;
			}else if(marks<min){
				min = marks;
			}
		}
		double avarage = (double)total/10;
		
		System.out.println();
		System.out.println("Total  :  "+total);
		System.out.println("Max    :  "+max);
		System.out.println("Min    :  "+min);
		System.out.println("avarage:  "+avarage);
	}
}


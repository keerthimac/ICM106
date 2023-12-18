import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of Students   : ");
		final int students = input.nextInt();
		int total=0;
		for (int i = 1; i<=students; i++){
			System.out.print("Input Student "+i+" marks : ");
			int num=input.nextInt();
			total+=num;
		}
		double avarage = students<=0?0.0:(double)total/students;
		System.out.println("Total : "+total);
		System.out.println("Avarage : "+avarage);
	}
}
 



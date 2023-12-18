import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int marks=0;
		int count=0;
		int total=0;
		while(marks!=-1){
			count++;
			total+=marks;
			System.out.print("Enter student "+count+" marks (Enter -1 to exit): ");
			marks=input.nextInt();
		}
		double avarage = (double)total/(count-1);
		System.out.println("Total Marks : "+total);
		System.out.println("Avarage Marks : "+avarage);
	}
}

 



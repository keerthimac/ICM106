import java.util.*;
class Example{
	public static double average(int total, int n){
		double avg = total/n;
		return avg;
	}
	

	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input total marks : ");
		int total=input.nextInt();
		System.out.print("Input no of subjects : ");
		int n=input.nextInt();
		 
		double avg;
		avg=average(total,n);
		
		System.out.println("Average marks : "+avg);
		
	}

}

//Method Name :average
//Parameter:s int total , int n 
//Return Type : double
//body:  total/n





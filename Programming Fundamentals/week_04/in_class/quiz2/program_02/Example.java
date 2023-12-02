import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input average marks : ");
		double avg=input.nextDouble();
		
		if(avg>=50.0){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input average marks : ");
		double avg=input.nextDouble();
		if(avg>=75){
			System.out.println("Grade A");
		}else if(avg>=65){
			System.out.println("Grade B");
		}else if(avg>=45){
			System.out.println("Grade C");
		}else if(avg>=25){
			System.out.println("Grade D");
		}else{
			System.out.println("Grade E");
		}
	}
}



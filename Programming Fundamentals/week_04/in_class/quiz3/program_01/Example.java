import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input Salary : ");
		double salary=input.nextDouble();
		
		if(salary<25000){
			salary*=1.2;
			System.out.println("your Salary with bonus is :"+salary);
		}else{
			salary*=1.1;
			System.out.println("your Salary with bonus is :"+salary);
		}
	}
}


import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input Salary : ");
		double salary=input.nextDouble();
		if(salary<49999){
			System.out.print("Please Enter Presentage : ");
			double presentage=input.nextDouble();
			salary=salary+salary*presentage/100;
			System.out.println("net Salary : "+salary);
		}else if(salary<99999){
			System.out.print("Please Enter Presentage : ");
			double presentage=input.nextDouble();
			salary=salary+salary*presentage/100;
			System.out.println("net Salary : "+salary);
		}else if(salary<199000){
			System.out.print("Please Enter Presentage : ");
			double presentage=input.nextDouble();
			salary=salary+salary*presentage/100;
			System.out.println("net Salary : "+salary);
		}else if(salary>=200000){
			System.out.print("Please Enter Presentage : ");
			double presentage=input.nextDouble();
			salary=salary+salary*presentage/100;
			System.out.println("net Salary : "+salary);
		}

	}
}



import java.util.*;
class Example{
	public static boolean isPass(double avarage){
		//return avarage>=50?true:false;
		return avarage>=50;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input average marks : ");
		double avg=input.nextDouble();
		
		if(isPass(avg)){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}

}
//Pass Mark-->50


/*
  
 */






import java.util.*;
class Example{
	public static void main(String args[]){
		//Scanner input=new Scanner(System.in);
		Random input=new Random();
		for(int i=0;i<100;i++){
			int num=input.nextInt(100)+1;
			System.out.println("Number "+(i+1)+" : "+num);
		}
	}
}

 



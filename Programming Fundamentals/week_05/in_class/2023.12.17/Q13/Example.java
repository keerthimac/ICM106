import java.util.*;
class Example{
	public static void main(String args[]){
		//Scanner input=new Scanner(System.in);
		Random input=new Random();
		for(int i=0;i<10;i++){
			int num=input.nextInt(10)+11;
			System.out.println("Number "+(i+1)+" : "+num);
		}
	}
}

 



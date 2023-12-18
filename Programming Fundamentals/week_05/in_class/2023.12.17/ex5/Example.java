import java.util.*;
class Example{
	public static void main(String args[]){
		//Scanner input=new Scanner(System.in);
		Random input=new Random();
		int num=0;
		int count = 0;
		while(num!=100){
			count++;
			num=input.nextInt(101);
			System.out.println("Number "+count+" : "+num);
			num=input.nextInt(101);

		}
	}
}

 



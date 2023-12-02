import java.util.*;

class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int a= input.nextInt();
		
		System.out.print("Input number 2 : ");
		int b= input.nextInt();
		
		System.out.print("Input number 3 : ");
		int c= input.nextInt();
		
		System.out.print("Input number 4 : ");
		int d= input.nextInt();
		
		int max = a;
		
		if(b>max){
			max=b;
		}
		if(c>max){
			max=c;
		}
		if(d>max){
			max=d;
		}
				
		System.out.println("Maximun : "+max);
	}
}

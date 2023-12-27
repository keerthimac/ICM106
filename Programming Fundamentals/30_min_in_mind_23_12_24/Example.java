import java.util.*;
class Example{
	public static boolean isAssOrDes(int a, int b,int c){
		if(a>b && b>c || a<b && b<c){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer 1 : ");
		int num1=input.nextInt();
		System.out.print("Input an integer 2: ");
		int num2=input.nextInt();
		System.out.print("Input an integer 3: ");
		int num3=input.nextInt(); 	 		
		
		System.out.print(isAssOrDes(num1,num2,num3));
	}
}








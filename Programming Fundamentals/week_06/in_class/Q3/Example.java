import java.util.*;
class Example{
	public static int reverse(int num){
		int rev=0;
		while(num!=0){
			rev*=10;
			rev+=num%10;
			num/=10;
		}
		return rev;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt(); //Eg->100
		 
		int revNo=reverse(num);
		System.out.println("Reverse number of "+num+" : "+revNo);//1
	}
}





 



import java.util.*;
class Example{
	public static int reverse(int a){
		int rev=0;
		int count=0;
		while(a!=0){
			count++;
			rev*=10;
			System.out.println(count+"st it - "+rev);
			rev+=a%10;
			System.out.println(count+"st it - "+rev);
			a/=10;
		}
		return rev;
	}
	

	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt(); //Eg->12345
		 
		int revNo=reverse(num);
		System.out.println("Reverse number of "+num+" : "+revNo);//54321
	}
}





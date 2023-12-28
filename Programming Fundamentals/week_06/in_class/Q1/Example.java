import java.util.*;
class Example{
public static int noOfDigits(int num){
		int count=0;
		do{
			count++;
		}while((num/=10)!=0);
		return count;	
	}
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		
		int count;
		count=noOfDigits(num);
		
		System.out.println("No of digits for "+num+" : "+count);
	}
}



 



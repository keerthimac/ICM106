import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input an integer : ");
		int	num=input.nextInt();
		int count=0;
		while(num!=0){
			num/=10;
			count++;
		}
		System.out.println("No of digits  : "+count);
	}
}












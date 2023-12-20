import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input an integer : ");
		int	num=input.nextInt();
		int lastDigit = num%10;
		num/=10;
		
		boolean accending = false;
		boolean decending = false;
		
		
		while(num>0){
		int currentDigit = num%10;
			if(currentDigit>lastDigit){
			accending = false;
			num/=10;
			}else{
			lastDigit = currentDigit;
			num/=10;
			accending = true;
			}
		}
		System.out.println(accending);
	}
}


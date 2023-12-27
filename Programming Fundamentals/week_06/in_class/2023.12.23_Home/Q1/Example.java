import java.util.*;


class Example{
	public static int numerOfDigits(int a){
		//---Process------------
		int count=0;
		/*while(a>0){
			int digit = a%10;
			count++;
			a/=10;
		}*/
		do{
			count++;
		}while((a/=10)!=0);
		return count;
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an Integer : ");
		int num=input.nextInt();

		int count;
		count=numerOfDigits(num);

		//---Output-------------
		System.out.println(num+" = "+count);
		
	}
} 




import java.util.*;
class Example{
	public static void printNumberReverse(int num){
		do{
			System.out.print(num%10);
		}while((num/=10)!=0);
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt(); //Eg->12345
		 
		printNumberReverse(num); //54321
	}
}




 



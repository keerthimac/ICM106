import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your age - ");
		int age=input.nextInt();
		if(age<18){
			System.out.println("age is not valid to vote");
		}else{
			System.out.println("Welcome to vote");
		}
	}
}
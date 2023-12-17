import java.util.*;

class Example{
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age = input.nextInt();
	
	if(age>=18){
		System.out.println("You are older than 18");	
	}else if(age<18){
		System.out.println("You are younger than 18");
	}
	
	}
}

import java.util.*;

class Example{
	public static void main(String asrg[]){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter your friend`s name: ");
		String name=input.next();
		System.out.print("Enter your friend`s age: ");
		int age=input.nextInt();
		System.out.print("Enter your friend`s living place: ");
		String place=input.next();
		System.out.println(name+" is my best friend. He is "+age+" years old and lives in the beautiful town of "+place+".");	 
	}
}

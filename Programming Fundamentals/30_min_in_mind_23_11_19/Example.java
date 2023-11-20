import java.util.*;
class Example{
	public static void main(String args[]){
		System.out.println("     +--------------------------------+");
		System.out.println("     |       Exam Year Calculator     |");
		System.out.println("     +--------------------------------+");
		System.out.println("\n\n");
		
		Scanner input=new Scanner(System.in);
		System.out.print("     Enter your Birth Year: ");
		
		int age=input.nextInt();
		int currentAge=2023-age;
		int olYear = age + 16;
		int alYear = olYear + 3;
		System.out.println("\n");
		System.out.println("     Hello, User!");
		System.out.println("     You are "+currentAge+" years old.");
		System.out.println("\n");
		System.out.println("     Your OL Year is : "+olYear);
		System.out.println("     Your AL Year is : "+alYear);
		System.out.println("\n");
		System.out.println("     Thank you for Participating!");
		System.out.println("     Have a great Day!");
			
	}
}
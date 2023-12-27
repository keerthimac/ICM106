import java.util.*;
class Example{
	public static void printName(String name1, String name2){
		System.out.println(name1+" "+name2);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Input first name : ");
		String name1=input.nextLine();
		System.out.print("Input secound name : ");
		String name2=input.nextLine();
		printName(); // Line Y
	}
}

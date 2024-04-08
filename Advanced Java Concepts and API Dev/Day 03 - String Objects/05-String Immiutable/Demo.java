import java.util.*;
class Demo{
	public static void main(String args[]){
		String name=" Ukwatta ";
		System.out.println("size : "+name.length()); //9
		
		name=name.trim(); //
		System.out.println("size : "+name.length()); //7
		
		System.out.println(" Ukwatta ".length()); //9
		System.out.println("Ukwatta".trim().length()); //7
	}
}



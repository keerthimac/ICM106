import java.util.*;
class Demo{
	public static void main(String args[]){
		String s1=new String("abc"); //"String" is a class
		
		String s2="abc"; //String literals, Objects
		
		System.out.println(s2.toString()); //"abc"
		System.out.println(s2.length()); //3
		
		System.out.println("xyz".length()); //3
		
		int x=100;
		//System.out.println(x.length());//Illegal
		System.out.println((x+"").length());//legal
	}
}

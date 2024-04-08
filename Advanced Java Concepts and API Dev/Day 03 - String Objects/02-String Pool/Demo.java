import java.util.*;
class Demo{
	public static void main(String args[]){
		String s1=new String("abc"); //creates in heap
		String s2="abc"; //creates in string pool
		String s3="abc";
		String s4="aBc"; 
		String s5="ab"; 
		String s6="c"; 
		String s7=s5+s6; 
		final String s8="ab"; 
		final String s9="c"; 
		String s10=s8+s9;
		
		
		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("s2==s3 "+(s2==s3));
		System.out.println("s2==s4 "+(s2==s4));
		System.out.println("s2==s7 "+(s2==s7));//false
		System.out.println("s2==s7 "+(s2==s10));//true
	}
}


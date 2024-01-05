import java.util.*;
class Example{
	
	public static String toString(int[] ar){
		String list = "[";
		for(int a : ar){
			list+=a+", ";
		}
			
		return ar.length==0?"[empty]":list+"\b\b]";
		
	}
	
	public static void main(String args[]){
		int[] ar={45,12,67,34,57,68,91,21,42,45,89};
		String list=toString(ar);
		System.out.println(list); //[45,12,67,34,57,68,91,21,42,45,89]
	}
}






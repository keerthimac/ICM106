import java.util.*;
class Example{
	
	public static void reversePrint(int[] ar){
		String list = "[";
		for (int i = ar.length-1; i > 0 ; i--){
			list+=ar[i]+", ";
		}
		System.out.println(ar.length==0?"[empty]":list+"\b\b]");
		
	}

	public static void main(String args[]){
		int[] ar={45,12,67,34,57,68,91,21,42,45,89};
		reversePrint(ar);//[89, 45, 42, 21, 91, 68, 57, 34, 67, 12, 45]
	}


}





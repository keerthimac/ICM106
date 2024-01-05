import java.util.*;
class Example{
	public static void main(String args[]){
		int[] ar={40,10,50,60,20,30};
		String list=Arrays.toString(ar);
		System.out.println(list); //[40,10,50,60,20,30]
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar)); //[10,20,30,40,50,60]
		
	}
}




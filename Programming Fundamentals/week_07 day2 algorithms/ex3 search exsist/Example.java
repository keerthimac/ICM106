import java.util.*;
class Example{
	
	public static boolean search(int a,int[] ar){
		for(int i = 0 ; i<ar.length ; i++){
			if(a==ar[i]){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		int[] ar={40,10,80,50,20,60,30,90,0,70};
		System.out.println(Arrays.toString(ar));
		
		if(search(50, ar)){
			System.out.println("Element 50 is exist..");
		}
		System.out.println("Element 90 is exist.."+search(90,ar));
		System.out.println("Element 99 is exist.."+search(99,ar));
	}
	


}





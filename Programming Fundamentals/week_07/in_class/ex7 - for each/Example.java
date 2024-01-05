import java.util.*;
class Example{
	public static void main(String args[]){
		int[] ar={40,10,50,60,20,30};
		
		for(int i=0; i<ar.length; i++){
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		//----------------------------
		for(int a : ar){
			System.out.print(a+" ");
		}
	}
}





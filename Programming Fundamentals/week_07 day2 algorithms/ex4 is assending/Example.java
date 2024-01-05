import java.util.*;
class Example{
	
	public static boolean isAscending(int[] ar){
		for(int i = 1 ; i<ar.length ; i++){
			if(ar[i-1]>ar[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		int[] ar={10,20,30,40,50};
		int[] br={50,40,30,20,10};
		int[] cr={10,20,30,50,40};
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(br));
		System.out.println(Arrays.toString(cr));
		System.out.println();
		System.out.println("ar is ascending order : "+isAscending(ar)); //true
		System.out.println("br is ascending order : "+isAscending(br)); //false
		System.out.println("cr is ascending order : "+isAscending(cr)); //false
		
	}
}





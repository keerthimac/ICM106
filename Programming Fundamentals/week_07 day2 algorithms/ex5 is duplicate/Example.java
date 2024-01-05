import java.util.*;
class Example{
	
	public static boolean isDuplicate(int[] ar){
		for(int i = 0 ; i<ar.length ; i++){
			int b4 = ar[i];
			for (int j = i+1; j < ar.length; j++){
				if(b4==ar[j]){
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		int[] ar={10,20,30,40,50};
		int[] br={50,10,20,30,40};
		int[] cr={50,40,30,20,30};
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(br));
		System.out.println(Arrays.toString(cr));
		System.out.println();
		System.out.println("ar is a duplicate array : "+isDuplicate(ar)); //false
		System.out.println("br is a duplicate array : "+isDuplicate(br)); //false
		System.out.println("cr is a duplicate array : "+isDuplicate(cr)); //true
	}

}





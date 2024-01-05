import java.util.*;
class Example{
	public static void main(String args[]){
		int[] ar={100,200,300,400};
		
		System.out.println(Arrays.toString(ar));//[100,200,300,400]
		
		for(int a : ar){
			a++;
		}
		System.out.println(Arrays.toString(ar));//[]
		
		for(int i=0; i<ar.length; i++){
			ar[i]++;
		}
		System.out.println(Arrays.toString(ar));//[]
	}
}


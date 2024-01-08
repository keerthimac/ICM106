import java.util.*;
class Example{
	public static void sort(int[] ar){
		for (int i = ar.length-1; i>0; i--){
			for(int j = 0 ; j<i ; j++){
				if(ar[j]>ar[j+1]){
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
	public static void main(String args[]){
		int[] ar={90,80,70,60,50,40,30,20,10,0};
		System.out.println(Arrays.toString(ar));//[]
		
		sort(ar);
		
		System.out.println(Arrays.toString(ar));//[0,10,20,30,40,50,60,70,80,90]
	}
}
















import java.util.*;
class Example{
	public static void sort(int[] ar){ //Selection Sort
		for (int i = 0; i < ar.length-1; i++){
			int min = ar[ar.length-1];
			int index = ar.length-1;
			for(int j=ar.length-1 ; j>=i ; j--){
				if(min>ar[j]){
					min=ar[j];
					index=j;
				}		
			}
			ar[index]=ar[i];
			ar[i]=min;
			System.out.println(Arrays.toString(ar));
			try{Thread.sleep(500);}catch(Exception ex){}					
		}			
			//System.out.println(Arrays.toString(ar));
			//try{Thread.sleep(500);}catch(Exception ex){}												
	}
	public static void main(String args[]){
		int[] ar={70,60,50,10,90,40,20,80,0,30};
		System.out.println(Arrays.toString(ar));//[70,60,50,10,90,40,20,80,0,30]
		sort(ar);
		
		System.out.println(Arrays.toString(ar));//[0,10,20,30,40,50,60,70,80,90]
	}
}

















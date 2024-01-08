import java.util.*;
class Example{
	public static void sort(int[] ar){ //insertion Sort
		for (int i = 1; i < ar.length; i++){
			for (int j = 0; j <i ; j++){
				if(ar[i]<ar[j]){
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}				
		System.out.println(Arrays.toString(ar));
		try{Thread.sleep(500);}catch(Exception ex){}
		}	
	}
	public static void main(String args[]){
		int[] ar={70,60,50,10,90,40,20,80,0,30};
		System.out.println(Arrays.toString(ar));//[70,60,50,10,90,40,20,80,0,30]
		
		sort(ar);
		
		//System.out.println(Arrays.toString(ar));//[0,10,20,30,40,50,60,70,80,90]
	}
}


















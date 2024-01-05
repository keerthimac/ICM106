import java.util.*;
class Example{
	public static void sort(int[] ar){ //Selection Sort
		for(int i = 0; i<ar.length ; i++){
			for(int j = 0; j<ar.length ; j++){
				
			}
		}
		
		int max=ar[0];
		int index=0;
		for(int j=1; j<ar.length; j++){
			if(ar[j]>max){
				max=ar[j];
				index=j;
			}
		}
		ar[index]=ar[ar.length-1];
		ar[ar.length-1]=max;
		//
		//
		max=ar[0];
		index=0;
		for(int j=1; j<ar.length-1; j++){
			if(ar[j]>max){
				max=ar[j];
				index=j;
			}
		}
		ar[index]=ar[ar.length-2];
		ar[ar.length-2]=max;		
	}
	public static void main(String args[]){
		int[] ar={70,60,50,10,90,40,20,80,0,30};
		System.out.println(Arrays.toString(ar));//[70,60,50,10,90,40,20,80,0,30]
		
		sort(ar);
		
		System.out.println(Arrays.toString(ar));//[0,10,20,30,40,50,60,70,80,90]
	}
}

















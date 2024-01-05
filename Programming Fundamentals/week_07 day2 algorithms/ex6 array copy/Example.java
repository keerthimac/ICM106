import java.util.*;
class Example{
	public static void main(String args[]){
		int[] ar={10,20,30,40,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50]
		//
		//Insert code here to add new element "60" to the array
		int[] tempAr = new int[ar.length+1];
		for (int i = 0; i < ar.length; i++){
			tempAr[i]=ar[i];
		}
		tempAr[tempAr.length-1]=60;
		ar=tempAr;
		
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60]
		
	}
}






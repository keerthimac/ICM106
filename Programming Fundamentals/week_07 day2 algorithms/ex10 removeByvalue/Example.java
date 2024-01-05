import java.util.*;
class Example{	
	public static int[] removeByValue(int val, int[] ar){
		int[] temp = new int[ar.length -1];
		for(int i = 0; i<ar.length ;i++ ){
			if(ar[i]<val){
				temp[i] = ar[i];
			}else if(ar[i]>val){
				temp[i-1] = ar[i];
			}
		}
		return temp;
	}
	
	public static void main(String args[]){
		int[] ar={10,20,30,40,50,60,70,80};
		
		//-----------removeByValue-------------
		ar = removeByValue(20,ar);
		//-------------------------------------
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,70,80]
		
	}
}









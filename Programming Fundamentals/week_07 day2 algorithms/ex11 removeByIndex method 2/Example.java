import java.util.*;
class Example{	
	public static int[] removeByIndex(int index, int[] ar){
		int[] temp = new int[ar.length -1];
		for(int i = index; i<ar.length-1 ;i++ ){
			ar[i] = ar[i+1];
		}
		for(int i = 0; i<temp.length ;i++ ){
			temp[i] = ar[i];
		}
		return temp;
	}
	
	public static void main(String args[]){
		int[] ar={10,20,30,40,50,60,70,80};
		
		//-----------removeByIndex-------------
		ar = removeByIndex(5,ar);
		//-------------------------------------
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,70,80]
		
	}
}









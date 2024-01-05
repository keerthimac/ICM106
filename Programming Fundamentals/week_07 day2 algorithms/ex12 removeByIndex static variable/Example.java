import java.util.*;
class Example{	
	public static int[] ar={10,20,30,40,50,60,70,80};
	
	public static void removeByIndex(int index){
		for(int i=index; i<ar.length-1; i++){
			ar[i]=ar[i+1];
		}
		int[] tempArr=new int[ar.length-1];
		for (int i = 0; i < tempArr.length; i++){
			tempArr[i]=ar[i];
		}
		ar=tempArr;
	}
	//
	
	public static void main(String args[]){
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60,70,80]
		//-----------removeByIndex-------------
		removeByIndex(5);
		//-------------------------------------
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,70,80]
		
	}
}










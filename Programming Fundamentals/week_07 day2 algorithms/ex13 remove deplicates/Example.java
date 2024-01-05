import java.util.*;
class Example{
	public static boolean search(int value, int[] ar){
		for (int i = 0; i < ar.length; i++){
			if(value==ar[i]){
				return true;
			}
		}
		return false;
	}
		
	public static void main(String args[]){
		int[] ar={10,50,10,40,20,30,70,40,50,60,70,80};
		System.out.println(Arrays.toString(ar));
		int[] br=new int[0];
		
		for (int i = 0; i < ar.length; i++){
			if(!search(ar[i],br)){
				int[] tempBr=new int[br.length+1];
				for(int j=0; j<br.length; j++){
					tempBr[j]=br[j];
				}
				tempBr[tempBr.length-1]=ar[i];
				br=tempBr;
			}
		}
		ar=br;
		System.out.println(Arrays.toString(ar));
	}
}












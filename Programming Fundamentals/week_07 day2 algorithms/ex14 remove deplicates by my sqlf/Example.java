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

	public static int[] extendsArray(int[] br){
		int[] tempBr=new int[br.length+1];
		for(int j=0; j<br.length; j++){
			tempBr[j]=br[j];
		}		
		return tempBr;
	}	
	public static void main(String args[]){
		int[] ar={10,50,10,40,20,30,70,40,50,60,70,80};
		System.out.println(Arrays.toString(ar));
		int[] br=new int[0];
		
		for (int i = 0; i < ar.length; i++){
			if(!search(ar[i],br)){
				br=extendsArray(br);
				br[br.length-1]=ar[i];
			}
		}
		ar=br;
		System.out.println(Arrays.toString(ar));
	}
}














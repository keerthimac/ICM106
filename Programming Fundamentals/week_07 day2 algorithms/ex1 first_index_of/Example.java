import java.util.*;
class Example{
	
	public static int search(int a,int[] ar){
		for(int i = 0 ; i<ar.length ; i++){
			if(a==ar[i]){
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]){
		int[] ar={40,10,80,50,20,60,30,90,0,70};
		System.out.println(Arrays.toString(ar));
		
		int index = search(50, ar);
		System.out.println("Index of 50 : "+index);//3
		
		index= search(99, ar);
		System.out.println("Index of 99 :"+index);//-1
	}
	


}





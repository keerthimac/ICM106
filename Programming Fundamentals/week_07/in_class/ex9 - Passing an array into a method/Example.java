import java.util.*;
class Example{
	public static void printArrayElements(int[] xr){
		System.out.print("[");
		for (int i = 0; i < xr.length; i++)
		{
			System.out.print(xr[i]+", ");
		}
		System.out.print("\b\b]");
	}
	
	public static void main(String args[]){
		int[] ar={100,200,300,400};	
		System.out.println(Arrays.toString(ar));//[100,200,300,400]
		printArrayElements(ar);
	}
}


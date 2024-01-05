import java.util.*;
class Example{
	public static void printArray(int ar[]){
		System.out.print("[");
		for (int i = 0; i < ar.length; i++)	{
			System.out.print(ar[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void main(String args[]){
		int[] ar={45,12,67,34,57,68,91,21,42,45,89};
		printArray(ar); //[45,12,67,34,57,68,91,21,42,45,89]
	}
}


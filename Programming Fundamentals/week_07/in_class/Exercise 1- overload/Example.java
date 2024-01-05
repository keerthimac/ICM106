import java.util.*;
class Example{
	public static void increment(int a, int b, int c){
		a++;
		b++;
		c++;
	}
	public static void increment(int[] ar){
		ar[0]++;
		ar[1]++;
		ar[2]++;
	}
	public static void main(String args[]){
		int[] ar={100,200,300};
		System.out.println(Arrays.toString(ar));
		increment(ar[0],ar[1],ar[2]);
		System.out.println(Arrays.toString(ar));
		increment(ar);
		System.out.println(Arrays.toString(ar));
	}
}


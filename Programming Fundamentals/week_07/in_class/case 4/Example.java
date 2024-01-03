import java.util.*;
class Example{
	public static void main(String args[]){
		//------------Method 1-----------------
		int[] a = new int[5];
		int[] b;
		b=new int[5];
		//int[] c = new int[];// illigal
		
		
		//------------Method 2-----------------
		int[] d = {10,20,30,40,50};
		int[] e;
		e={10,20,30,40,50};//iligal
		 
		
		//------------Method 3-----------------
		int[] f = new int[]{10,20,30,40,50};
		int[] g;
		g = new int[]{10,20,30,40,50};
		
		//int[] h = new int[5]{10,20,30,40,50};//iligal because array size define

	}
}




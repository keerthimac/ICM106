import java.util.*;

class Example{
	public static int fact(int num){
		int f=1;
		for (int i = num; i >0; i--){
			f*=i;
		}
		return f;
	}
	public static void main(String args[]){
		for (int i = 0; i < 10; i++){
			System.out.println(i+" ! : "+fact(i));
		}	
	}
}
/*

import java.util.*;
class Example{
	public static int fact(int num){
		return num<=0 ? 1 :num*fact(num-1);
	}
	public static void main(String args[]){
		for (int i = 0; i < 10; i++){
			int f=fact(i);
			System.out.println(i+" ! : "+f);
		}
		
	}
}

class Example {
	public static void main(String args[]) {
		int num = 4;
		int fact = 1;
		for(int i=num ; i>0 ; i--){
			fact *= i;
			System.out.print(i+" * ");
		}
		System.out.print(num<=0? "0! : 1" : "\b\b = "+fact);
	}
}


	

*/




import java.util.*;

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


 import java.util.*;
class Example{
	public static void printPrimeNumbersUpTo(int num){
		for(int i = 1; i<=num ; i++){
			int count = 0;
			for(int j = 2 ; j<i ; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==0){
				System.out.println(i);
			}
		}
	}	
		/*
		
		L1:for (int i = 2; i < num; i++){
			for (int j = 2; j < i/2 ; j++){
				if(i%j==0){
					continue L1;
				}
			}
			System.out.println(i);
		}
	}

		*/
		


	public static void main(String args[]){
		printPrimeNumbersUpTo(1000);		
	}

}








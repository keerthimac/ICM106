import java.util.*;

class Example{
	public static boolean isPrime(int num){
		boolean isPrime = false;
			int count = 0;
			for(int j = 2 ; j<num ; j++){
				if(num%j==0){
					count++;
				}
			}
			if(count==0){
				isPrime = true;
			}
		return isPrime;
	}
	
	public static void main(String args[]){
			for (int i = 2; i < 1000; i++){
				if(isPrime(i)){
					System.out.println(i);
				}
			}
			
		}
	}



/*

import java.util.*;

class Example {
	public static void main(String [] args) {
		for(int i = 1; i<=100 ; i++){
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
}

import java.util.*;
class Example{
	public static boolean isPrime(int num){
		boolean isPrime=true;
		for (int i = 2; i < num; i++){ //num-1
			if(num%i==0){
				isPrime=false;
				break;
			}		
		}
		return isPrime;
	}
	public static void main(String args[]){
		for (int i = 2; i < 1000; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
		
	}
}


	

*/




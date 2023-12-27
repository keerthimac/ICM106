 import java.util.*;
class Example{
	public static boolean isPrime(int num){
		int count = 0;
		for(int j = 2 ; j<num ; j++){
			if(numccv%j==0){
				count++;
			}
		}
		if(count==0){
			return true;
		}
		return false;
	}

	public static void main(String args[]){
		for (int i = 2; i < 1000; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}
}








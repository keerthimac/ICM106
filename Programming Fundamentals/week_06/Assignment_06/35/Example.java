import java.util.*;

class Example {
	public static void checkNumber() {
		boolean status = true;
		long num = 1;
		while(status){
			int count = 0;
			for(int i = 1 ; i<=20 ; i+=20){
				if(num%i==0){
					count++;
					if(count==20){
						status = false;
						System.out.println(num+" smallest positive number that is evenly divisible by all of the numbers from 1 to 20 ");
					}
				}
			}
			num++;
		}
	}
	
	public static void main(String args[]) {
		checkNumber();
	}
}


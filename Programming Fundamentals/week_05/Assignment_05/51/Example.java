import java.util.*;

class Example {
	public static void main(String [] args) {
		boolean status = true;
		int num = 1;
		while(status){
			int count = 0;
			for(int i = 1 ; i<=20 ; i++){
				if(num%i==0){
					count++;
					if(count==20){
						status = false;
						System.out.println(num+" smallest positive number that is evenly divisible by all of the numbers from 1 to 10 ");
					}
				}
			}
			num++;
		}
	}
}






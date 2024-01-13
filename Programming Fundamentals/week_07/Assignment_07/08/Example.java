import java.util.*;
class Example {
	public static void main(String args[]) {
		//i Array to store the annual rainfall values
		int[] rainFall ={2376,1945,2060,1781,2365,1005,1162,1016,1512,2231,1903,12061,1005,1545,2156,2037,1583,3668};
		
		//ii Print the number of districts
		System.out.println("Number of Districts are : "+rainFall.length);
		
		System.out.println();	

		//iii Count and print the number of districts with more than 2000mm		
		int count = 0;
		for (int i = 0; i < rainFall.length; i++){
			if(rainFall[i]>2000){
				count++;
			}
		}
		System.out.println("Number of districts with more than 2000mm are : "+count);
		
		System.out.println();
		
		//iv Count and print the number of districts with less than 1000mm	
		int countLess = 0;
		for (int i = 0; i < rainFall.length; i++){
			if(rainFall[i]<1000){
				countLess++;
			}
		}
		System.out.println("Number of districts with less than 1000mm are : "+countLess);
		
		System.out.println();
		
		//v Find the average annual rainfall values of all districts.	
		int total= 0;
		for (int i = 0; i < rainFall.length; i++){
			total+=rainFall[i];
		}
		System.out.println("average annual rainfall values : "+(total/rainFall.length));
		
	}	
}

import java.util.*;
class Example {
	public static void main(String args[]) {
		
		//I. Create an array to store results.
		int[] diceResult = {6,3,3,2,4,1,6,6,2,4};
		
		//II. Find the number of times ‘3’ and ‘6’ is rolled.
		int count = 0;
		for (int i = 0; i < diceResult.length; i++){
			if(diceResult[i]==3 || diceResult[i]==6){
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println();
		
		//III. Find the number of times odd numbers are rolled.
		int countOdd = 0;
		for (int i = 0; i < diceResult.length; i++){
			if((diceResult[i]%2)!=0){
				countOdd++;				
			}
		}
		System.out.println(countOdd);
		
		//IV. Search whether the number ‘5’ are rolled.
		int countFive = 0;
		for (int i = 0; i < diceResult.length; i++){
			if(diceResult[i]==5){
				countFive++;
			}
		}
		System.out.println(); 
		System.out.println("number 5 " + ((countFive > 0 ? "rolled " + countFive +" times" : "did not roll")));

	}
}

import java.util.*;
class Example {
	public static void main(String args[]) {
		double[] avgMarks = {85.66,78.00,67.33,57.66,81,91,53.66,61.66,74.33,79.33};
		
		for (int i = 0; i < avgMarks.length; i++){
			if (i==2 || i==6){
				System.out.println((i+1)+(i==2?"rd ":"th ")+"Student Avarage :"+avgMarks[i]);
			}
		}	
	}
}

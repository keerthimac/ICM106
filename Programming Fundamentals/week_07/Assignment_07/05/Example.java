import java.util.*;
class Example {
	public static void main(String args[]) {
		//i Marks array
		int[] marks ={56,81,43,69,93,54,48,47,51,79,82,96,57,61,66};
		
		//ii How many marks are input into the array
		System.out.println(marks.length);
		
		System.out.println();
		
		//iii Marks array Print
		for(int i=0; i<5; i++){
			System.out.println(marks[i]);
		}
		//output :- print index 1 to 5 variables in array
		//56
		//81
		//43
		//69
		//93
		
		//iv print all marks of an array using for loop
		for(int i=0; i<marks.length; i++){
			System.out.println(marks[i]);
		}

		System.out.println();

		//v print the 10th element to the last element
		for(int i=9; i<marks.length; i++){
			System.out.println(marks[i]);
		}
	}	
}

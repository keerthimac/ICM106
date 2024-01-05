import java.util.*;
class Example{
	public static int[] createAnArray(int size){
		int[] temp = new int[size];
		return temp;
	}
	public static void readMarks(int[] marks){
		Random r = new Random();
		for (int i = 0; i < marks.length; i++){
			marks[i]=r.nextInt(101);
		}
	}
	public static int findTotal(int[] marks){
		int total = 0;
		for (int i = 0; i < marks.length; i++){
			total+=marks[i];
		}
		return total;
	}
	
	public static int findMax(int[] marks){
		int max=marks[0];
		for (int i = 1; i < marks.length; i++){
			if(marks[i]>max){
				max=marks[i];
			}
		}
		return max;
	}
	
	public static int findMin(int[] marks){
		int min=marks[0];
		for (int i = 1; i < marks.length; i++){
			if(marks[i]<min){
				min=marks[i];
			}
		}
		return min;
	}

	public static void printMarks(int[] marks){
		System.out.print("[");
		for (int i = 0; i < marks.length; i++){
			System.out.print(marks[i]+", ");
		}
		System.out.println("\b\b]");
	}	
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input no of students : ");
		final int N=input.nextInt();
				
		//----------------Create an array size N, type int to store marks
		int[] marks=createAnArray(N);
		
		//----------------Input marks----------
		//Random numbers 0 to 100
		readMarks(marks);

		//----------------Find Total-----------
		int total=0;
		total=findTotal(marks);
		
		//----------------Find Max-------------
		int max=findMax(marks);
		
		//----------------Find Min-------------
		int min=findMin(marks);
		
		//----------------Print Marks----------
		printMarks(marks);

		//----------------Print Total----------
		System.out.println("Total : "+total);
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
	}
}


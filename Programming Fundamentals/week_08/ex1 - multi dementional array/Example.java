import java.util.*;
class Example{
	public static void main(String args[]){
		//case:- 
		//There is 10 students & ecah have 4 subjects
		//input the marks by the loops
		int[][] marks=new int[10][4];
		
		Scanner input=new Scanner(System.in);

		for(int i=0; i<10; i++){	
			System.out.println("Input marks for student "+(i+1)+".....");
			for(int j=0; j<4; j++){
				System.out.print("\tSub "+(j+1)+" : ");
				marks[i][j]=input.nextInt();
			}
		}
	}
}




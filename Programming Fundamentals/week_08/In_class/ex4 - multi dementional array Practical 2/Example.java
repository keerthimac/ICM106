import java.util.*;
class Example{
	public static void main(String args[]){
		
		
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of students : ");
		final int N=input.nextInt();
		
		System.out.print("Input no of subjects : ");
		final int S=input.nextInt();
		
		//1. Create a twoD array to store student marks "marks"
		int[][] marks=new int[N][S];
		
		//2. Read marks (Random numbers)
		Random r=new Random();
		for (int i = 0; i < N; i++){
			for(int j=0; j<S; j++){
				marks[i][j]=r.nextInt(101);
			}
		}
		
		//3. Print marks (Row and column)
		System.out.print("StuNo"+"\t");
		for (int i = 0; i < S; i++){
			System.out.print("Sub"+(i+1)+"\t");
		}
		System.out.println();
		
		for (int i = 0; i < N; i++){
			System.out.print((1000+i)+"\t");
			for(int j=0; j<S; j++){
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println();
		}
	}
}






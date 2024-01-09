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
		
		//Find total marks
		int[] stTot=new int[N];
		
		for(int i=0; i<N; i++){
			int total=0;
			for(int j=0; j<S; j++){
				total+=marks[i][j];
			}
			stTot[i]=total;
		}
		

		//Find max
		int[] stMax=new int[N];
		for(int i=0; i<N; i++){
			int max=marks[i][0];
			for(int j=1; j<S; j++){
				if(marks[i][j]>max){
					max=marks[i][j];
				}
			}
			stMax[i]=max;
		}
		
		//Find min
		int[] stMin=new int[N];
		for(int i=0; i<N; i++){
			int min=marks[i][0];
			for(int j=1; j<S; j++){
				if(marks[i][j]<min){
					min=marks[i][j];
				}
			}
			stMin[i]=min;
		}
		
		//3. Print marks (Row and Columns)
		System.out.print("StNo\t");
		for(int j=0; j<S; j++){
			System.out.print("Sub"+(j+1)+"\t");
		}
		System.out.println("Total\tMax\tMin");
		for (int i = 0; i < N; i++){
			System.out.print(1000+i+"\t");
			for(int j=0; j<S; j++){
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println(stTot[i]+"\t"+stMax[i]+"\t"+stMin[i]);
		}
	}
}








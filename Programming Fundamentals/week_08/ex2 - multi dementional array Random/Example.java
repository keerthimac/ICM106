import java.util.*;
class Example{
	public static void main(String args[]){
		
		int[][] marks=new int[10][4];		
		Random input=new Random();
		for(int i=0; i<10; i++){	
			for(int j=0; j<4; j++){
				marks[i][j]=input.nextInt(101);
			}
		}
		for(int j=0; j<10; j++){
			for(int i=0; i<4; i++){
				System.out.print(marks[j][i]+"\t");
			}
		System.out.println();				
		}
	
	}
}




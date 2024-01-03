import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number of students  : ");
		final int N = input.nextInt();	
		
		int[] ar=new int[N];
		
		//2. Read Marks
		Random r = new Random();
		for(int i = 0 ; i<N ; i++){
			ar[i]=r.nextInt(101);
		}
		
		//------------------------------------

		int total=0;
		for(int i = 0 ; i<N ; i++){
			total += ar[i];
		}
		
		System.out.println("Total : "+total);		
		//---------------------------------
		int max = ar[0];
		for(int i =1 ; i<N;i++){
			if(ar[i]>max){
				max=ar[i];
			}
		}
		System.out.println("Max : "+max);
		
		//---------------------------------
		int min = ar[0];
		for(int i =1 ; i<N;i++){
			if(ar[i]<min){
				min=ar[i];
			}
		}
		System.out.println("Min : "+min);
		
		//---------------------------------
		System.out.print("[");
		for(int i =0 ; i<N;i++){
			System.out.print(ar[i]+", ");
		}
		System.out.print("\b\b]");
	}
}

import java.util.*;
class Example{
	public static void main(String args[]){
		int[] ar=new int[10]; //int a,b,c,d,e,f,g,h,i,j;
		Scanner input=new Scanner(System.in);
		
		for(int i = 0 ; i<10 ; i++){
			System.out.print("Input number"+(i+1)+" : ");
			ar[i]=input.nextInt();
		}
		
		//------------------------------------

		int total=0;
		for(int i = 0 ; i<10 ; i++){
			total += ar[i];
		}
		
		//---------------------------------
		System.out.println("Total : "+total);

	}
}

import java.util.*;
class Example{
	public static void main(String args[]){
		int[] ar=new int[10]; //int a,b,c,d,e,f,g,h,i,j;
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		ar[0]=input.nextInt();
		
		System.out.print("Input number 2 : ");
		ar[1]=input.nextInt();
		
		System.out.print("Input number 3 : ");
		ar[2]=input.nextInt();
		
		System.out.print("Input number 4 : ");
		ar[3]=input.nextInt();
		
		System.out.print("Input number 5 : ");
		ar[4]=input.nextInt();
		
		System.out.print("Input number 6 : ");
		ar[5]=input.nextInt();
		
		System.out.print("Input number 7 : ");
		ar[6]=input.nextInt();
		
		System.out.print("Input number 8 : ");
		ar[7]=input.nextInt();
		
		System.out.print("Input number 9 : ");
		ar[8]=input.nextInt();
		
		System.out.print("Input number 10: ");
		ar[9]=input.nextInt();
		//------------------------------------
		
		int total=0;
		total+=ar[0];
		total+=ar[1];
		total+=ar[2];
		total+=ar[3];
		total+=ar[4];
		total+=ar[5];
		total+=ar[6];
		total+=ar[7];
		total+=ar[8];
		total+=ar[9];
		
		//---------------------------------
		System.out.println("Total : "+total);

	}
}

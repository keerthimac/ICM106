import java.util.*;
class Example{
	public static void union (int[] ar1, int[] ar2){
		int[] interArr = new int[10];
		System.out.print("Union of sets: { ");
		for(int i = 0; i<5;i++){
			int num1= ar1[i];
			int num2= ar2[i];
			if(num1!=num2){
				System.out.print(num1+", "+num2+", ");
			}
			else if(num1==num2){
				System.out.print(num1+", ");
			}
		}
		System.out.print("\b\b}");
		System.out.println();
	}
	
	public static void Intersect(int[] ar1, int[] ar2){
		int[] interArr = new int[5];
		System.out.print("Intersection of sets : { ");
		for(int i = 0; i<5;i++){
			int num1= ar1[i];
			for(int j =0 ; j<5 ;j++){
				int num2= ar2[j];
				//System.out.print("current "+num1+", ");
				if(num1==num2){
					interArr[i]=num1;
				}				
			}
		}
		System.out.print("\b\b}");
		System.out.println();
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int[] ar1=new int[5];
		int[] ar2=new int[5];
		for(int i = 0; i<5;i++){
			System.out.print("Input number set 01 number "+(i+1)+" : ");
			ar1[i]=input.nextInt();
		}
		System.out.println("\n\n");
		for(int i = 0; i<5;i++){
			System.out.print("Input number set 02 number "+(i+1)+" : ");
			ar2[i]=input.nextInt();
		}
		
		union(ar1,ar2);
		Intersect(ar1,ar2);

	}
}








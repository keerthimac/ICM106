import java.util.*;
class Example{
	public static boolean isExist(int num,int[] ar){
		for (int i = 0; i < ar.length; i++){
			if (ar[i]==num){
				return true;
			}
		}
		return false;
	}
	
	public static int[] extendArray(int[] ar){
		int[] temp = new int[ar.length+1];
		for (int i = 0; i < ar.length; i++){
			temp[i] = ar[i];
		}
		return temp;
	}
	
	public static void main(String args[]){
		int[] ar=new int[0];
		System.out.println(Arrays.toString(ar));//[]
		
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer(press -1 to terminate the program) : ");
		int num=input.nextInt();
		while(num!=-1){
			if(!isExist(num,ar)){
				ar = extendArray(ar);
				ar[ar.length-1] = num;
			}else{
				System.out.println(num+" is a Duplicate Value..");
			}
			System.out.print("Input an integer(press -1 to terminate the program) : ");
			num=input.nextInt();
		}
		
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60]
		
	}
}








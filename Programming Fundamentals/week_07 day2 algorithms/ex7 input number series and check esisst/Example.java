import java.util.*;
class Example{
	public static void main(String args[]){
		int[] ar=new int[0];
		System.out.println(Arrays.toString(ar));//[]
		
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer(press -1 to terminate the program) : ");
		int num=input.nextInt();
				
		while(num!=-1){	
			boolean isExsist = false;
			
			for(int i = 0 ; i<ar.length ; i++){
				if(num==ar[i]){
					isExsist = true;
					System.out.println(num+" is a Duplicate Value..");
				}
			}					
	
			if(!isExsist){
				int[] tempAr1 = new int[ar.length+1];
				for (int i = 0; i < ar.length; i++){
					tempAr1[i]=ar[i];
				}
				ar=tempAr1;					
				ar[ar.length-1] = num;
			}
			
			System.out.print("Input an integer(press -1 to terminate the program) : ");
			num=input.nextInt();
		}
		
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60]
		
	}
}







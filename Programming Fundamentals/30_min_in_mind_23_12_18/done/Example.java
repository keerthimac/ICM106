import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an Integer : ");
		int x=input.nextInt();
		int x1=x;
		int x2=x;
		int x3=x;
		int y,y1;
		int z,z1;
		int count1=0;
		int count2=0;
		int count3=0;
		while(x1!=0){
			x1/=10;
			count1++;
		}
		do{
			y=(x2%10);
			x2=(x2/10);
			z=(x2%10);
			count2++;
		}while(y>z);
		
		do{
			y1=(x3%10);
			x3=(x3/10);
			z1=(x3%10);
			count3++;
		}while(y1<z1);
		if(count1==(count2-1)){
			System.out.println(x+" is a Ascending Order");
		}else if(count1==(count3)){
			System.out.println(x+" is on Descending Order");
		}else{
			System.out.println(x+" not in an Order");
		}
	}
}

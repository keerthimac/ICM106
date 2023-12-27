import java.util.*;
class Example{
	public static char grade(int total, int n){
		double avg = (double)total/n;
		if(avg>=75){
			return 'A';
		}else if(avg>=65){
			return 'B';
		}else if(avg>=45){
			return 'C';
		}else if(avg>=25){
			return 'D';
		}else{
			return 'E';
		}
		//return avg>=75?'A':avg>=65?'B':avg>=45?'C':avg>=25?'D':'E'
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input total marks : ");
		int total=input.nextInt();
		System.out.print("Input no of subjects : ");
		int n=input.nextInt();
		 
		char grade=grade(total,n); //300,4
		
		System.out.println("Grade : "+grade); //A
		
	}
}
//avg>=75 ->A
//avg>=65 ->B
//45>= C
//25>= D
//else E

/*
  
 */






import java.util.*;
class Example{
	public static int fact(int num){
		int fact =1;
		for(int i = num ; i>0 ; i--){
			fact*=i;
		}
		return fact;
		
		/*
		 while(num>0){
			f*=num--;
		  }
		*/
		/*
		return num<=0 ? 1 :num*fact(num-1);
		*/
		
	}

	public static void main(String args[]){
		for (int i = 0; i < 10; i++){
			System.out.println(i+" ! : "+fact(i));
		}
		
	}
}
/*
	0 ! : 0
	1 ! : 1
	2 ! : 2
	3 ! : 6
	4 ! : 24
	5 ! : 120
	6 ! : 720
	

*/







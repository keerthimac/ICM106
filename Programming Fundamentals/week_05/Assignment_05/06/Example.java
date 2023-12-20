import java.util.*;

class Example {
	public static void main(String args[]) {
		for(int i=0 ; i<50 ; i++){
			Random input = new Random();
			int num = input.nextInt(100);
			if(num%2==0){
				System.out.println(num+1);
			}else{
				System.out.println(num);
			}
		}
	}
}


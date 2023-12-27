import java.util.*;

class Example2 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		L1:for (int i = 20; i < Integer.MAX_VALUE; i+=20){
			int count = 0;
			for (int j = 11; j <= 20; j++){ //1,2,3,4,5,6,7,8,9,10
				if (i%j==0){
					count++;
				}
			}
			if (count==10){
				System.out.println(i);
				break L1;
			}
			
		}
		
		
	}
}

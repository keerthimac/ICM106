import java.util.*;

class Example {
	public static void main(String args[]) {
		Random input = new Random();
		int headCount = 0;
		int tailCount = 0;
		for(int i= 0;i<10;i++){
			int num = input.nextInt(2);
			if(num == 0){
				System.out.println("HEAD");
				headCount++;
			}else if(num == 1){
				System.out.println("TAIL");
				tailCount++;
			}
		}
		System.out.println();
		System.out.println("Statics: "+headCount+" Heads and "+tailCount+" Tails");		
	}
}

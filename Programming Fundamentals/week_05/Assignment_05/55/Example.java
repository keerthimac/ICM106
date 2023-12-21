import java.util.*;

class Example {
	public static void main(String[] args) {
		double answer = 0.5;
		int count = 0;	
		while(answer<=1){
			double xCode = Math.random();
			double yCode = Math.random();
			answer = Math.sqrt(xCode*xCode+yCode*yCode);
			System.out.println(xCode+" , "+yCode);
		}
	}
}






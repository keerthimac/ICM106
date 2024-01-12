import java.util.*;
class Example {
	public static void main(String args[]) {
		
		//Enter Data using single Statement
		long[] reserves = {2362,2311,1917,1912,1887,1854,1717,1717,1779,1705,1806,1896};
		
		//Print array using foreach method
		for(long a : reserves){
			System.out.println(a*1000000);
		
		//Correct Incorrect Data
		reserves[3] = 1812;
		reserves[6] = 1817;
		}
		
		//Print Corrected Data
		System.out.println();
		for (int i = 0; i < reserves.length; i++){
			if(i==3 ||i==6){
				System.out.println((i==3?"April":"July")+" - "+reserves[i]);				
			}
		}
		
	}
}

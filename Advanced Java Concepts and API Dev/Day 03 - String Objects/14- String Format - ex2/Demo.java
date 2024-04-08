import java.util.*;
class Demo{
	public static void main(String args[]){
		String[] name={"Pala","Niroth Samarawickrama","Lakmal"};
		int[] age={10,45,20};
		double[] salary={123400.1234,-45000.678,679.00};
		
		for (int i = 0; i < 3; i++){
			String fs=String.format("%2$-30s%1$-6d%3$20f",age[i],name[i],salary[i]);
			System.out.println(fs); 
		}
	}
}

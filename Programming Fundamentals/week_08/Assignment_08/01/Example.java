import java.util.*;
class Example{
	public static void main(String args[]){
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
		"September", "October", "November", "December"};
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
	

		//Create multidimensional array with Month count
		int[][] patientCounts = new int[12][];
		for (int i = 0; i < 12; i++){
			patientCounts[i] = new int[daysInMonth[i]];
		}

		//Input Paitent count via Random numbers
		Random r = new Random();
		for (int i = 0; i < months.length; i++){
			for (int j = 0; j < daysInMonth[i]; j++){
				patientCounts[i][j]=r.nextInt(501);
			}
		}
		
		//Print for Given Dates
		for (int i = 0; i < months.length; i++){
			for (int j = 0; j < daysInMonth[i]; j++){
				if((i==0&&j==16)||(i==2&&j==25)||(i==4&&j==0)||(i==6&&j==20)||(i==10&&j==29))
				System.out.println("2021-"+(i+1)+"-"+(j+1)+" : "+patientCounts[i][j]);
			}
		}
	}	
}

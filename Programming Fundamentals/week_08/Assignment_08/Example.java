import java.util.*;
class Example{
	public static void main(String args[]){
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
		"September", "October", "November", "December"};
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int[][] patientCounts = new int[months.length][];
		
		Random r = new Random();
		
		for (int i = 0; i < months.length; i++){
			patientCounts[i] = new int[daysInMonth[i]];
		}
		for (int i = 0; i < months.length; i++){
			for (int j = 0; j < daysInMonth[i]; j++){
				patientCounts[i][j]=r.nextInt(501);
			}
		}

		for (int i = 0; i < months.length; i++){
			System.out.printf("  %-10s",months[i]);
		}
		System.out.println();

		
		for (int i = 0; i <31 ; i++){
			System.out.print(i+1+" ");
			for (int j = 0; j <12; j++){
				System.out.print(patientCounts[i][j]+" ");
			}
		System.out.println();
		}
	}
}




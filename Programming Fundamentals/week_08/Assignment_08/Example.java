import java.util.*;
class Example{
	public static void main(String args[]){
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
		"September", "October", "November", "December"};
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int[][] patientCounts = new int[12][];
		
		Random r = new Random();
		
		for (int i = 0; i < 12; i++){
			patientCounts[i] = new int[daysInMonth[i]];
		}

		for (int i = 0; i < months.length; i++){
			for (int j = 0; j < daysInMonth[i]; j++){
				patientCounts[i][j]=r.nextInt(501);
			}
		}

		for (int i = 0; i < months.length; i++){
			for (int j = 0; j < daysInMonth[i]; j++){
				System.out.print(patientCounts[i][j]+" ");
			}
		System.out.println();
		}

		System.out.println();
		System.out.println();


		for (int i = 0; i <31 ; i++){
			System.out.print(i+1+"   ");
			for (int j = 0; j <12 ; j++){
				System.out.print(patientCounts[j][i]+"\t");
			}
		System.out.println();
		}

/*

		for (int i = 0; i < months.length; i++){
			//System.out.printf("%-5s"," ",months[i]);
			System.out.printf("    %-5s",months[i]);
		}
		System.out.println();

		

		for (int i = 0; i <31 ; i++){
			System.out.printf("%-5s",i+1);
			//System.out.print(i+1+"   ");
			for (int j = 0; j <12; j++){
				System.out.printf("%-10s",patientCounts[i].length);
			}
		System.out.println();
		}
*/

	}
}




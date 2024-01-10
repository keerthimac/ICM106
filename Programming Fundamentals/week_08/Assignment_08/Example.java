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
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\tCOVID-19 patient in 2021");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\n\n");
		
		System.out.printf("%-5s","");
		for (int i = 0; i < months.length; i++){
			System.out.printf("%-10s",months[i]);
		}
		System.out.println();

		for (int i = 0; i <31 ; i++){			
			System.out.printf("%-5d",i+1);			
			for (int j = 0; j <12 ; j++){	
				if ((i==28&&j==1)||(i==29&&j==1)||(i==30&&j==1)||(i==30&&j==3)||(i==30&&j==5)||(i==30&&j==8)||(i==30&&j==10)){
					System.out.printf("%-10s","");
				}else{
					System.out.printf("%-10s",patientCounts[j][i]);
				}
			}
		System.out.println();
		}

	}
}




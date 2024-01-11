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
		
		//Print Paitent count for each month
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\tCOVID-19 patient in 2021");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\n\n");
		
		System.out.printf("%-8s","");
		for (int i = 0; i < months.length; i++){
			System.out.printf("%-10s",months[i]);
		}
		System.out.println();
		
		//Print Table
		for (int i = 0; i <31 ; i++){			
			System.out.printf("%-8d",i+1);			
			for (int j = 0; j <12 ; j++){
				for (int i = 28; i < 31; i++){
					
				}
				if ((i==28&&j==1)||(i==29&&j==1)||(i==30&&j==1)||(i==30&&j==3)||(i==30&&j==5)||(i==30&&j==8)||(i==30&&j==10)){
					System.out.printf("%-10s","");
				}else{
					System.out.printf("%-10s",patientCounts[j][i]);
				}
			}
		System.out.println();
		}		
		
		//Find Total
		System.out.println();
		int[] ptTotal = new int[12];
		for (int i = 0; i <months.length ; i++){
			int total = 0;				
			for (int j = 0; j <daysInMonth[i] ; j++){	
				total+=patientCounts[i][j];
			};
			ptTotal[i]=total;
		}

		//Print Total
		System.out.println();
		System.out.printf("%-8s","Total");
		for (int i = 0; i <ptTotal.length ; i++){
			System.out.printf("%-10s",ptTotal[i]);			
		}
		
		//Find Avarage
		System.out.println();
		int[] ptAvarage = new int[12];
		for (int i = 0; i <months.length ; i++){
			int total = 0;				
			for (int j = 0; j <daysInMonth[i] ; j++){	
				total+=patientCounts[i][j];
			};
			ptAvarage[i]=total/daysInMonth[i];
		}

		//Print Avarage
		System.out.printf("%-8s","Avarage");
		for (int i = 0; i <ptAvarage.length ; i++){
			System.out.printf("%-10s",ptAvarage[i]);			
		}				
	}
}




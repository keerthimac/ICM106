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
		
		//Update for Given Dates ant Test
		for (int i = 0; i <months.length; i++){
			for (int j = 0; j < daysInMonth[i]; j++){
				if(i==1&&j==15){
					patientCounts[i][j]=78;
					System.out.println(patientCounts[i][j]);
				}else if(i==5&&j==4){
					patientCounts[i][j]=202;
					System.out.println(patientCounts[i][j]);					
				}else if(i==8&&j==8){
					patientCounts[i][j]=181;
					System.out.println(patientCounts[i][j]);
				}else if(i==9&&j==9){
					patientCounts[i][j]=178;
					System.out.println(patientCounts[i][j]);
				}else if(i==11&&j==24){
					patientCounts[i][j]=84;
					System.out.println(patientCounts[i][j]);
				}
			}
		}
	}	
}

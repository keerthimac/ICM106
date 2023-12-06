import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the Year: ");
		int year = input.nextInt();

		
		//Leap year check
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					System.out.println(" "+year+" is leap year");
				}else{
					System.out.println(" "+year+" is not a leap year");
				}
			}else{
				System.out.println(" "+year+" is leap year");
			}			
		}else{
			System.out.println(" "+year+" is not a leap year");
		}
	}
}

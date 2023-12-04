import java.util.*;

class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Distance in Miles-> ");
		double distance = input.nextDouble();
		System.out.print("Enter the Time in Hours-> ");
		double time = input.nextDouble();
		
		double speed = distance/time;
				
		
		if(speed<=30){
		System.out.printf("Your Speed is %-1.2f mph. You Have No Fine",speed);
		}else if(speed>31 && speed<=40){
		System.out.printf("Your Speed is %-1.2f mph. Your fine is 5000/=",speed);
		}else if(speed>41 && speed<=50){
		System.out.printf("Your Speed is %-1.2f mph. Your fine is 7500/=",speed);
		}else if(speed>50){
		System.out.printf("Your Speed is %-1.2f mph. Your fine is 10000/=",speed);
		}
	}
}

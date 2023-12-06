import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Month (1-12): ");	
		int month = input.nextInt();
		System.out.print("Enter day (1-30): ");	
		int day = input.nextInt();
		
		if((month==12 && day>=21 || month <=3 && day<=19)){
			System.out.println("Winter");
		}else if((month>=3 && day>=20 || month <=6 && day<=20)){
			System.out.println("Spring");
		}else if((month>=6 && day>=21 || month <=9 && day<=21)){
			System.out.println("Summer");
		}else if((month>=9 && day>=22 || month <=12 && day<=20)){
			System.out.println("Autumn");
		}
	}
}

import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Birth Month (1-12): ");	
		int month = input.nextInt();
		System.out.print("Enter Birth day (1-30): ");	
		int day = input.nextInt();
		
		if((month==12&&day>=22)||(month==1&&day<=19)){
			System.out.println("Capricornus");
		}else if((month==1&&day>=20)||(month==2&&day<=18)){
			System.out.println("Aquarius");
		}else if((month==2&&day>=19)||(month==3&&day<=20)){
			System.out.println("Pisces");
		}else if((month==3&&day>=21)||(month==4&&day<=19)){
			System.out.println("Aries (Ram)");
		}else if((month==4&&day>=20)||(month==5&&day<=20)){
			System.out.println("Taurus");
		}else if((month==5&&day>=21)||(month==6&&day<=21)){
			System.out.println("Gemini");
		}else if((month==6&&day>=22)||(month==7&&day<=22)){
			System.out.println("Cancer");
		}else if((month==7&&day>=23)||(month==8&&day<=22)){
			System.out.println("Leo");
		}else if((month==8&&day>=23)||(month==9&&day<=22)){
			System.out.println("Virgo");
		}else if((month==9&&day>=23)||(month==10&&day<=23)){
			System.out.println("Libra");
		}else if((month==10&&day>=24)||(month==11&&day<=21)){
			System.out.println("Scorpius");
		}else if((month==11&&day>=22)||(month==12&&day<=21)){
			System.out.println("Sagittarius");
		
	}
}


import java.util.*;
class Example {
	public static void main(String args[]) {
		System.out.println("\n");
		System.out.println("\t==================================================================================================");
		System.out.println("\t||\t\t\t\t\t\t\t\t\t\t\t\t||");
		System.out.println("\t||\t\t\t\t\t\t\t\t\t\t\t\t||");
		System.out.println("\t||\t\t\t                       =*%@@%*=\t\t\t\t\t\t||");
		System.out.println("\t||\t\t\t                     =@@@@@@@@@@=\t\t\t\t\t||");
		System.out.println("\t||\t\t\t      .+#@@#+.      =@@@@@@@@@@@@=\t\t\t\t\t||");
		System.out.println("\t||\t\t\t     :@@@@@@@@-     @@@@@@@@@@@@@%\t\t\t\t\t||");
		System.out.println("\t||\t\t\t     @@@@@@@@@@     =@@@@@@@@@@@@=\t\t\t\t\t||");
		System.out.println("\t||\t\t\t     :@@@@@@@@-      +@@@@@@@@@@=\t\t\t\t\t||");
		System.out.println("\t||\t\t\t      .+#@@#+.         =*%@@%*=\t\t\t\t\t\t||");
		System.out.println("\t||\t\t\t    =#@@@@@@@@@@@@@@@@@@@@@@@@@@@#=\t\t\t\t\t||");
		System.out.println("\t||\t\t\t   *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*       -+%@#\t\t\t||");
		System.out.println("\t||\t\t\t  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  :+#@@@@@@@\t\t\t||");
		System.out.println("\t||\t\t\t  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\t\t\t||");
		System.out.println("\t||\t\t\t  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\t\t\t||");
		System.out.println("\t||\t\t\t  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\t\t\t||");
		System.out.println("\t||\t\t\t  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\t\t\t||");
		System.out.println("\t||\t\t\t  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  :+#@@@@@@@\t\t\t||");
		System.out.println("\t||\t\t\t   *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*       -+%@#\t\t\t||");
		System.out.println("\t||\t\t\t    =#@@@@@@@@@@@@@@@@@@@@@@@@@@@#=\t\t\t\t\t||");
		System.out.println("\t||\t\t\t             .%@@@++@@@%:          \t\t\t\t\t||");
		System.out.println("\t||\t\t\t            =@@@%.  .%@@@=         \t\t\t\t\t||");
		System.out.println("\t||\t\t\t            =%%=      =%%=         \t\t\t\t\t||");
		System.out.println("\t||\t\t\t\t\t\t\t\t\t\t\t\t||");
		System.out.println("\t||\t\t\t   ___  ___________  ___________  ________  ______\t\t\t||");
		System.out.println("\t||\t\t\t  / _ \\/_  __/  __/ / ___/   _/ \\/ / __/  \\/  / _ |\t\t\t||");
		System.out.println("\t||\t\t\t / , _/ / / _\\ \\   / /____/ //    / _// /\\_/ / __ |\t\t\t||");
		System.out.println("\t||\t\t\t/_/\\_\\ /_/ /___/   \\____/___/_/\\_/___/_/  /_/_/ |_|\t\t\t||");
		System.out.println("\t||\t\t\t\t\t\t\t\t\t\t\t\t||");
		System.out.println("\t==================================================================================================");
		
		/*Date & Location Saved to Variable*/
		System.out.println("\n");
		Scanner input=new Scanner(System.in);
		System.out.print("\tEnter Date: ");
		String date=input.nextLine();
		System.out.println("\n");
		System.out.print("\tEnter Location: ");
		String location=input.nextLine();
		
		
		
		System.out.println("\n\n\n\n");
		System.out.println("\t\t\t\t    _            _ _      _    _       ___ _ _ ");
		System.out.println("\t\t\t\t   /_\\__ _____ _(_) |__ _|_|__|_|___  | __(_) |_ __  ___");
		System.out.println("\t\t\t\t  / _ \\ v /  _' | | / _' | '_ \\_/ -_) | _|| | | '  \\(_-<");
		System.out.println("\t\t\t\t /_/ \\_\\_/ \\__,_|_|_\\__,_|_.__/_\\___| |_|_|_|_|_|_|_/__/");
		System.out.println("\n");
		System.out.println("\t\t\t\t========================================================");
		System.out.println("\n\n");
		
		
		System.out.println("\t\t\t01) Movie 01 - Hall 01\t\t\t\t02) Movie 02 - Hall 02");
		System.out.println("\n");
		System.out.println("\t\t\t03) Movie 03 - Hall 03\t\t\t\t04) Movie 04 - Hall 04");
		System.out.println("\n\n");
		
		/*Movie variable saved with if else condition*/
		System.out.print("\tEnter Movie Number: ");
		int movie=input.nextInt();
		String selected_movie = "None";
		if(movie == 1){
			selected_movie = "1 Hall";
		}else if(movie == 2){
			selected_movie = "2 Hall";
		}
		else if(movie == 3){
			selected_movie = "3 Hall";
		}else if(movie == 4){
			selected_movie = "4 Hall";
		}else{
			selected_movie = "Error: Please Select Available Movie";
		};
		input.nextLine();
		
		
		System.out.println("\n\n");
		System.out.println("\t\t\t\t\t _______");
		System.out.println("\t\t\t\t\t|__   __|_");
		System.out.println("\t\t\t\t\t   | |  (_)_ __ ___   ___");
		System.out.println("\t\t\t\t\t   | |  | | `_  '_ \\ / _ \\");
		System.out.println("\t\t\t\t\t   | |  | | | | | | |  __/");
		System.out.println("\t\t\t\t\t   |_|  |_|_| |_| |_|\\___|");
		System.out.println("\t\t\t\t========================================================");
		System.out.println("\n\n");
		
		/*Time Saved to Variable*/
		System.out.println("\t\t\t\t\t\t01) 9.00 A.M ");
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t02) 2.00 P.M ");
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t03) 7.00 P.M ");
		System.out.println("\n");
		System.out.print("\tEnter Time: ");
		String time=input.nextLine();
		
		
		/*Name,Phone,Type,Number of tickets Saved to Variables*/
		System.out.println("\n\n");
		System.out.println("\t\t\t\t\t _____           _");
		System.out.println("\t\t\t\t\t/  __ \\         | |");
		System.out.println("\t\t\t\t\t| /  \\/_   _ ___| |_ ___  _ __ ___   ___ _ __");
		System.out.println("\t\t\t\t\t| |   | | | / __| __/ _ \\| '_  `_ \\ / _ \\ '__|");
		System.out.println("\t\t\t\t\t| \\__/\\ |_| \\__ \\ || (_) | | | | | |  __/ |");
		System.out.println("\t\t\t\t\t\\_____/\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|");
		System.out.println("\n");
		System.out.println("\t\t\t\t\t==============================================");
		System.out.println("\n\n");
		System.out.print("\tName : ");
		String name=input.nextLine();
		System.out.println("\n");
		System.out.print("\tPhone Number : ");
		String phone=input.nextLine();
		System.out.println("\n");
		System.out.print("\tChild OR Patent : ");
		String type=input.nextLine();
		System.out.println("\n");
		System.out.print("\tNumber of Tickets : ");
		int tickets=input.nextInt();
		
		/*Claculation*/
		int calculate_amount  = 90*tickets;
		int calculate_tax  = calculate_amount*20/100;
		int total_amount = calculate_amount+calculate_tax;
		
		System.out.println("\n\n");
		System.out.println("\t\t\t+================================================================+");
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\t   ___  ___________  ___________  ________  ______\t||");
		System.out.println("\t\t\t||\t  / _ \\/_  __/  __/ / ___/   _/ \\/ / __/  \\/  / _ |\t||");
		System.out.println("\t\t\t||\t / , _/ / / _\\ \\   / /___ / //    / _// /\\_/ / __ |\t||");
		System.out.println("\t\t\t||\t/_/\\_\\ /_/ /___/   \\____/___/_/\\_/___/_/  /_/_/ |_|\t||");
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||");
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||");
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||");
		System.out.printf("\t\t\t|| Date : %-31s Location : %-10s ||%n",date,location);/*date and location*/
		System.out.printf("\t\t\t|| %-60s || %n","");
		System.out.printf("\t\t\t|| %-60s || %n","");
		System.out.println("\t\t\t||--------------------------------------------------------------||\t\t");
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.printf("\t\t\t||\tName : %-48s ||%n",name);/*Name*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.printf("\t\t\t||\tPhone Number : %-40s ||%n",phone);/*Phone Number*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.printf("\t\t\t||\tTickets : %-45s ||%n",tickets);/*Tickets*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.printf("\t\t\t||\tType : %-48s ||%n",type);/*Type*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.printf("\t\t\t||\tTime : %-48s ||%n",time);/*Time*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.printf("\t\t\t||\tHall : %-48s ||%n",selected_movie);/*Hall*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.printf("\t\t\t||\tTax : %-49s ||%n",calculate_tax);/*Tax*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.printf("\t\t\t||\t%-40s Total :%-6s  ||%n","",total_amount);/*Total*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t+================================================================+");

        
	}
}

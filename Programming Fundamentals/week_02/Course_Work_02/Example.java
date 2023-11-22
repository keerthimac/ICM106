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
		System.out.println("\t||\t\t\t / , _/ / / _\\ \\   / /___ / //    / _// /\\_/ / __ |\t\t\t||");
		System.out.println("\t||\t\t\t/_/\\_\\ /_/ /___/   \\____/___/_/\\_/___/_/  /_/_/ |_|\t\t\t||");
		System.out.println("\t||\t\t\t\t\t\t\t\t\t\t\t\t||");
		System.out.println("\t==================================================================================================");
		System.out.println("\n");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Date: ");
		String date=input.next();
		System.out.println("\n");
		System.out.print("Enter Location: ");
		String location=input.next();
		System.out.println("\t\t\t\t    _            _ _      _    _       ___ _ _ ");
		System.out.println("\t\t\t\t   /_\\__ _____ _(_) |__ _|_|__|_|___  | __(_) |_ __  ___");
		System.out.println("\t\t\t\t  / _ \\ v /  _' | | / _' | '_ \\_/ -_) | _|| | | '  \\(_-<");
		System.out.println("\t\t\t\t /_/ \\_\\_/ \\__,_|_|_\\__,_|_.__/_\\___| |_|_|_|_|_|_|_/__/");
		System.out.println("\n");
		System.out.println("\t\t\t\t========================================================");
		System.out.println("\n\n");
		System.out.print("Enter Movie Number: ");
		int movie=input.nextInt();
		String selected_movie = "None";
		if(movie == 1){
			selected_movie = "Hall 1";
		}else if(movie == 2){
			selected_movie = "Hall 2";
		}
		else if(movie == 3){
			selected_movie = "Hall 3";
		}else if(movie == 4){
			selected_movie = "Hall 4";
		}else{
			selected_movie = "Error: Please Select Available Movie";
		};
		/*System.out.println(selected_movie);*/
		System.out.println("\n\n");
		System.out.println("\t\t\t\t\t _______");
		System.out.println("\t\t\t\t\t|__   __|_");
		System.out.println("\t\t\t\t\t   | |  (_)_ __ ___   ___");
		System.out.println("\t\t\t\t\t   | |  | | `_  '_ \\ / _ \\");
		System.out.println("\t\t\t\t\t   | |  | | | | | | |  __/");
		System.out.println("\t\t\t\t\t   |_|  |_|_| |_| |_|\\___|");
		System.out.println("\t\t\t\t========================================================");
		System.out.println("\n");
		System.out.print("Enter Time: ");
		String time=input.next();
		String selected_time = "None";
		if(time == "9.00 A.M"){
			selected_time = "9.00 A.M";
		}else if(time == "2.00 P.M"){
			selected_time = "2.00 P.M";
		}
		else if(time == "7.00 P.M"){
			selected_time = "Hall 3";
		}
		else{
			selected_time = "Error: Please Select Available Time";
		};
		System.out.println("\n");
		System.out.println("\t\t\t\t\t _____           _");
		System.out.println("\t\t\t\t\t/  __ \\         | |");
		System.out.println("\t\t\t\t\t| /  \\/_   _ ___| |_ ___  _ __ ___   ___ _ __");
		System.out.println("\t\t\t\t\t| |   | | | / __| __/ _ \\| '_  `_ \\ / _ \\ '__|");
		System.out.println("\t\t\t\t\t| \\__/\\ |_| \\__ \\ || (_) | | | | | |  __/ |");
		System.out.println("\t\t\t\t\t\\_____/\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|");
		System.out.println("\n");
		System.out.println("\t\t\t\t\t==============================================");
		System.out.println("\n\n");
		System.out.print("Name : ");
		String name=input.next();
		System.out.println("\n");
		System.out.print("Phone Number : ");
		String phone=input.next();
		System.out.println("\n");
		System.out.print("Child OR Patent : ");
		String who=input.next();
		System.out.println("\n");
		System.out.print("Number of Tickets : ");
		int tickets=input.nextInt();
		
		/*Claculation*/
		int calculate_amount  = 90*tickets;
		int calculate_tax  = calculate_amount*20/100;
		int total_amount = calculate_amount+calculate_tax;
		
		System.out.println(total_amount);
		
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
		System.out.println("\t\t\t|| Date : "+date+ "\t\t\t\t\tLocation : "+location+"    ||");/*date and location*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||");
		System.out.println("\t\t\t||--------------------------------------------------------------||\t\t");
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\tName\t\t\t\t\t||\t\t");/*Name*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\tPhone Number\t\t\t\t\t||\t\t");/*Phone Number*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\tTickets\t\t\t\t\t\t||\t\t");/*Tickets*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\tType\t\t\t\t\t\t||\t\t");/*Type*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\tTime\t\t\t\t\t\t||\t\t");/*Time*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\tHall\t\t\t\t\t\t||\t\t");/*Hall*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\tTax\t\t\t\t\t\t||\t\t");/*Tax*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");/*Total*/
		System.out.println("\t\t\t||\t\t\t\t\t\t\t\t||\t\t");
		System.out.println("\t\t\t+================================================================+");
		System.out.printf("||%-12s ||%n",date);
        
	}
}

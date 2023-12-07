import java.util.*;

class Example {
    public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	
    System.out.println("\t\t ____              _       _____           _                 ");
    System.out.println("\t\t|  _ \\            | |     / ____|         | |                ");
    System.out.println("\t\t| |_) | __ _ _ __ | | __ | (___  _   _ ___| |_ ___ _ __ ___  ");
    System.out.println("\t\t|  _ < / _` | '_ \\| |/ /  \\___ \\| | | / __| __/ _ \\ '_ ` _ \\ ");
    System.out.println("\t\t| |_) | (_| | | | |   <   ____) | |_| \\__ \\ ||  __/ | | | | |");
    System.out.println("\t\t|____/ \\__,_|_| |_|_|\\_\\ |_____/ \\__, |___/\\__\\___|_| |_| |_|");
    System.out.println("\t\t                                 |___/                       ");
    System.out.println("\t\t=============================================================");
    System.out.println("\n");
    System.out.printf("\t\t\t\t %-15s %-15s %n","[1] Deposit","[2] Loans");
    System.out.println("\n");
    System.out.printf("\t\t\t\t %-15s %-15s %n","[3] Tax","[4] Share Market");
    System.out.println("\n");
    System.out.printf("\t\t\t\t %-15s %n","[5] Exit");
    System.out.println("\n");
    System.out.print("Enter an option to continue -> ");
    int num = input.nextInt();
    System.out.println("\n\n");
    
    if(num==1){
		System.out.println("\t\t\t _____                       _ _   ");
		System.out.println("\t\t\t|  __ \\                     (_) |  ");
		System.out.println("\t\t\t| |  | | ___ _ __   ___  ___ _| |_");
		System.out.println("\t\t\t| |  | |/ _ \\ '_ \\ / _ \\/ __| | __|");
		System.out.println("\t\t\t| |__| |  __/ |_) | (_) \\__ \\ | |_");
		System.out.println("\t\t\t|_____/ \\___| .__/ \\___/|___/_|\\__|");
		System.out.println("\t\t\t            | |                    ");
		System.out.println("\t\t\t            |_|                    ");
		System.out.println("\t\t\t====================================");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[1] Savings Account");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[2] Fixed Deposit");
		
		System.out.print("Enter an option to continue -> ");
		int depoNum = input.nextInt();
		
		if(depoNum==1){
			System.out.println("\t\t   _____             _                                                 _   ");
			System.out.println("\t\t  / ____|           (_)                 /\\                            | |  ");
			System.out.println("\t\t | (___   __ ___   ___ _ __   __ _     /  \\   ___ ___ ___  _   _ _ __ | |_ ");
			System.out.println("\t\t  \\___ \\ / _` \\ \\ / / | '_ \\ / _` |   / /\\ \\ / __/ __/ _ \\| | | | '_ \\| __|");
			System.out.println("\t\t  ____) | (_| |\\ V /| | | | | (_| |  / ____ \\ (_| (_| (_) | |_| | | | | |_ ");
			System.out.println("\t\t |_____/ \\__,_| \\_/ |_|_| |_|\\__, | /_/    \\_\\___\\___\\___/ \\__,_|_| |_|\\__|");
			System.out.println("\t\t                              __/ |                                        ");
			System.out.println("\t\t                             |___/                                         ");
			System.out.println("\t\t============================================================================");
		}else if(depoNum==2){
			System.out.println("\t\t  ______ _              _       _                      _ _   ");
			System.out.println("\t\t |  ____(_)            | |     | |                    (_) |  ");
			System.out.println("\t\t | |__   ___  _____  __| |   __| | ___ _ __   ___  ___ _| |_ ");
			System.out.println("\t\t |  __| | \\ \\/ / _ \\/ _` |  / _` |/ _ \\ '_ \\ / _ \\/ __| | __|");
			System.out.println("\t\t | |    | |>  <  __/ (_| | | (_| |  __/ |_) | (_) \\__ \\ | |_ ");
			System.out.println("\t\t |_|    |_/_/\\_\\___|\\__,_|  \\__,_|\\___| .__/ \\___/|___/_|\\__|");
			System.out.println("\t\t                                      | |                    ");
			System.out.println("\t\t                                      |_|                    ");
			System.out.println("\t\t================================================================");
		}	
		
	}else if(num==2){
		System.out.println("\t\t  _                       ");
		System.out.println("\t\t | |                      ");
		System.out.println("\t\t | |     ___   __ _ _ __  ");
		System.out.println("\t\t | |    / _ \\ / _` | '_ \\ ");
		System.out.println("\t\t | |___| (_) | (_| | | | |");
		System.out.println("\t\t |______\\___/ \\__,_|_| |_|");
		System.out.println("\t\t                          ");
		System.out.println("\t\t==========================");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[1] Personal Loan");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[2] Business Loan");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[3] Home equity Loan");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[4] Car Finance");
		
		System.out.print("Enter an option to continue -> ");
		int loanNum = input.nextInt();
		
		if(num==1){
			System.out.println("\t\t  _____                                _   _                       ");
			System.out.println("\t\t |  __ \\                              | | | |                      ");
			System.out.println("\t\t | |__) |__ _ __ ___  ___  _ __   __ _| | | |     ___   __ _ _ __  ");
			System.out.println("\t\t |  ___/ _ \\ '__/ __|/ _ \\| '_ \\ / _` | | | |    / _ \\ / _` | '_ \\ ");
			System.out.println("\t\t | |  |  __/ |  \\__ \\ (_) | | | | (_| | | | |___| (_) | (_| | | | |");
			System.out.println("\t\t |_|   \\___|_|  |___/\\___/|_| |_|\\__,_|_| |______\\___/ \\__,_|_| |_|");
			System.out.println("\t\t                                                                    ");
			System.out.println("\t\t====================================================================");
		}else if(loanNum==2){
			System.out.println("\t\t  ____            _                       _                       ");
			System.out.println("\t\t |  _ \\          (_)                     | |                      ");
			System.out.println("\t\t | |_) |_   _ ___ _ _ __   ___  ___ ___  | |     ___   __ _ _ __  ");
			System.out.println("\t\t |  _ <| | | / __| | '_ \\ / _ \\/ __/ __| | |    / _ \\ / _` | '_ \\ ");
			System.out.println("\t\t | |_) | |_| \\__ \\ | | | |  __/\\__ \\__ \\ | |___| (_) | (_| | | | |");
			System.out.println("\t\t |____/ \\__,_|___/_|_| |_|\\___||___/___/ |______\\___/ \\__,_|_| |_|");
			System.out.println("\t\t                                                                   ");
			System.out.println("\t\t===================================================================");
		}else if(loanNum==3){
			System.out.println("\t\t  _    _                                         _ _           _                       ");
			System.out.println("\t\t | |  | |                                       (_) |         | |                      ");
			System.out.println("\t\t | |__| | ___  _ __ ___   ___    ___  __ _ _   _ _| |_ _   _  | |     ___   __ _ _ __  ");
			System.out.println("\t\t |  __  |/ _ \\| '_ ` _ \\ / _ \\  / _ \\/ _` | | | | | __| | | | | |    / _ \\ / _` | '_ \\ ");
			System.out.println("\t\t | |  | | (_) | | | | | |  __/ |  __/ (_| | |_| | | |_| |_| | | |___| (_) | (_| | | | |");
			System.out.println("\t\t |_|  |_|\\___/|_| |_| |_|\\___|  \\___|\\__, |\\__,_|_|\\__|\\__, | |______\\___/ \\__,_|_| |_|");
			System.out.println("\t\t                                        | |             __/ |                          ");
			System.out.println("\t\t                                        |_|            |___/                           ");
			System.out.println("\t\t=========================================================================================");
		}else if(loanNum==4){
			System.out.println("\t\t  ______ _                              _                       ");
			System.out.println("\t\t |  ____(_)                            | |                      ");
			System.out.println("\t\t | |__   _ _ __   __ _ _ __   ___ ___  | |     ___   __ _ _ __  ");
			System.out.println("\t\t |  __| | | '_ \\ / _` | '_ \\ / __/ _ \\ | |    / _ \\ / _` | '_ \\ ");
			System.out.println("\t\t | |    | | | | | (_| | | | | (_|  __/ | |___| (_) | (_| | | | |");
			System.out.println("\t\t |_|    |_|_| |_|\\__,_|_| |_|\\___\\___| |______\\___/ \\__,_|_| |_|");
			System.out.println("\t\t==================================================================");
		}
		
	}else if(num==3){
		System.out.println("\t\t  _______         ");
		System.out.println("\t\t |__   __|        ");
		System.out.println("\t\t    | | __ ___  __");
		System.out.println("\t\t    | |/ _` \\ \\/ /");
		System.out.println("\t\t    | | (_| |>  < ");
		System.out.println("\t\t    |_|\\__,_/_/\\_\\");
		System.out.println("\t\t===================");
		
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[1] Personal Loan");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[2] Business Loan");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[3] Home equity Loan");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[4] Car Finance");
		
		System.out.print("Enter an option to continue -> ");
		int taxNum = input.nextInt();
		
		if(taxNum==1){
			System.out.println("\t\t  _____            _     _______         ");
			System.out.println("\t\t |  __ \\          | |   |__   __|        ");
			System.out.println("\t\t | |__) |___ _ __ | |_     | | __ ___  __");
			System.out.println("\t\t |  _  // _ \\ '_ \\| __|    | |/ _` \\ \\/ /");
			System.out.println("\t\t | | \\ \\  __/ | | | |_     | | (_| |>  < ");
			System.out.println("\t\t |_|  \\_\\___|_| |_|\\__|    |_|\\__,_/_/\\_\\");
			System.out.println("\t\t==========================================");
		}else if(taxNum==2){
			System.out.println("\t\t  _____                                  _______         ");
			System.out.println("\t\t |_   _|                                |__   __|        ");
			System.out.println("\t\t   | |  _ __   ___ ___  _ __ ___   ___     | | __ ___  __");
			System.out.println("\t\t   | | | '_ \\ / __/ _ \\| '_ ` _ \\ / _ \\    | |/ _` \\ \\/ /");
			System.out.println("\t\t  _| |_| | | | (_| (_) | | | | | |  __/    | | (_| |>  < ");
			System.out.println("\t\t |_____|_| |_|\\___\\___/|_| |_| |_|\\___|    |_|\\__,_/_/\\_\\");
			System.out.println("\t\t===========================================================");
		}else if(taxNum==3){
			System.out.println("\t\t  _____                  _     _        _______         ");
			System.out.println("\t\t |  __ \\                | |   | |      |__   __|        ");
			System.out.println("\t\t | |__) |_ _ _   _  __ _| |__ | | ___     | | __ ___  __");
			System.out.println("\t\t |  ___/ _` | | | |/ _` | '_ \\| |/ _ \\    | |/ _` \\ \\/ /");
			System.out.println("\t\t | |  | (_| | |_| | (_| | |_) | |  __/    | | (_| |>  < ");
			System.out.println("\t\t |_|   \\__,_|\\__, |\\__,_|_.__/|_|\\___|    |_|\\__,_/_/\\_\\");
			System.out.println("\t\t              __/ |                                      ");
			System.out.println("\t\t             |___/                                       ");
			System.out.println("\t\t===========================================================");
		}else if(taxNum==4)
			System.out.println("\t\t  _                    _             ");
			System.out.println("\t\t | |                  (_)            ");
			System.out.println("\t\t | |     ___  __ _ ___ _ _ __   __ _ ");
			System.out.println("\t\t | |    / _ \\/ _` / __| | '_ \\ / _` |");
			System.out.println("\t\t | |___|  __/ (_| \\__ \\ | | | | (_| |");
			System.out.println("\t\t |______\\___|\\__,_|___/_|_| |_|\\__, |");
			System.out.println("\t\t                                __/ |");
			System.out.println("\t\t                               |___/ ");
			System.out.println("\t\t=====================================");
	}else if(num==4){
		System.out.println("\t\t   _____ _                      __  __            _        _   ");
		System.out.println("\t\t  / ____| |                    |  \\/  |          | |      | |  ");
		System.out.println("\t\t | (___ | |__   __ _ _ __ ___  | \\  / | __ _ _ __| | _____| |_ ");
		System.out.println("\t\t  \\___ \\| '_ \\ / _` | '__/ _ \\ | |\\/| |/ _` | '__| |/ / _ \\ __|");
		System.out.println("\t\t  ____) | | | | (_| | | |  __/ | |  | | (_| | |  |   <  __/ |_ ");
		System.out.println("\t\t |_____/|_| |_|\\__,_|_|  \\___| |_|  |_|\\__,_|_|  |_|\\_\\___|\\__|");
		System.out.println("\t\t================================================================");
	}else if(num==5){
		System.out.println("Good Bye!");
	}else{
		System.out.println("Please Enter Valid Input");
	}
/*   

    System.out.println("\t\t _____                       _ _   ");
    System.out.println("\t\t|  __ \\                     (_) |  ");
    System.out.println("\t\t| |  | | ___ _ __   ___  ___ _| |_");
    System.out.println("\t\t| |  | |/ _ \\ '_ \\ / _ \\/ __| | __|");
    System.out.println("\t\t| |__| |  __/ |_) | (_) \\__ \\ | |_");
    System.out.println("\t\t|_____/ \\___| .__/ \\___/|___/_|\\__|");
    System.out.println("\t\t            | |                    ");
    System.out.println("\t\t            |_|                    ");
    System.out.println("\t\t====================================");

    System.out.println("\t\t   _____             _                                                 _   ");
    System.out.println("\t\t  / ____|           (_)                 /\\                            | |  ");
    System.out.println("\t\t | (___   __ ___   ___ _ __   __ _     /  \\   ___ ___ ___  _   _ _ __ | |_ ");
    System.out.println("\t\t  \\___ \\ / _` \\ \\ / / | '_ \\ / _` |   / /\\ \\ / __/ __/ _ \\| | | | '_ \\| __|");
    System.out.println("\t\t  ____) | (_| |\\ V /| | | | | (_| |  / ____ \\ (_| (_| (_) | |_| | | | | |_ ");
    System.out.println("\t\t |_____/ \\__,_| \\_/ |_|_| |_|\\__, | /_/    \\_\\___\\___\\___/ \\__,_|_| |_|\\__|");
    System.out.println("\t\t                              __/ |                                        ");
    System.out.println("\t\t                             |___/                                         ");
    System.out.println("\t\t============================================================================");

    System.out.println("\t\t  ______ _              _       _                      _ _   ");
    System.out.println("\t\t |  ____(_)            | |     | |                    (_) |  ");
    System.out.println("\t\t | |__   ___  _____  __| |   __| | ___ _ __   ___  ___ _| |_ ");
    System.out.println("\t\t |  __| | \\ \\/ / _ \\/ _` |  / _` |/ _ \\ '_ \\ / _ \\/ __| | __|");
    System.out.println("\t\t | |    | |>  <  __/ (_| | | (_| |  __/ |_) | (_) \\__ \\ | |_ ");
    System.out.println("\t\t |_|    |_/_/\\_\\___|\\__,_|  \\__,_|\\___| .__/ \\___/|___/_|\\__|");
    System.out.println("\t\t                                      | |                    ");
    System.out.println("\t\t                                      |_|                    ");
    System.out.println("\t\t================================================================");

    System.out.println("\t\t  _                       ");
    System.out.println("\t\t | |                      ");
    System.out.println("\t\t | |     ___   __ _ _ __  ");
    System.out.println("\t\t | |    / _ \\ / _` | '_ \\ ");
    System.out.println("\t\t | |___| (_) | (_| | | | |");
    System.out.println("\t\t |______\\___/ \\__,_|_| |_|");
    System.out.println("\t\t                          ");
    System.out.println("\t\t==========================");

    System.out.println("\t\t  _____                                _   _                       ");
    System.out.println("\t\t |  __ \\                              | | | |                      ");
    System.out.println("\t\t | |__) |__ _ __ ___  ___  _ __   __ _| | | |     ___   __ _ _ __  ");
    System.out.println("\t\t |  ___/ _ \\ '__/ __|/ _ \\| '_ \\ / _` | | | |    / _ \\ / _` | '_ \\ ");
    System.out.println("\t\t | |  |  __/ |  \\__ \\ (_) | | | | (_| | | | |___| (_) | (_| | | | |");
    System.out.println("\t\t |_|   \\___|_|  |___/\\___/|_| |_|\\__,_|_| |______\\___/ \\__,_|_| |_|");
    System.out.println("\t\t                                                                    ");
    System.out.println("\t\t====================================================================");

    System.out.println("\t\t  ____            _                       _                       ");
    System.out.println("\t\t |  _ \\          (_)                     | |                      ");
    System.out.println("\t\t | |_) |_   _ ___ _ _ __   ___  ___ ___  | |     ___   __ _ _ __  ");
    System.out.println("\t\t |  _ <| | | / __| | '_ \\ / _ \\/ __/ __| | |    / _ \\ / _` | '_ \\ ");
    System.out.println("\t\t | |_) | |_| \\__ \\ | | | |  __/\\__ \\__ \\ | |___| (_) | (_| | | | |");
    System.out.println("\t\t |____/ \\__,_|___/_|_| |_|\\___||___/___/ |______\\___/ \\__,_|_| |_|");
    System.out.println("\t\t                                                                   ");
    System.out.println("\t\t===================================================================");

    System.out.println("\t\t  _    _                                         _ _           _                       ");
    System.out.println("\t\t | |  | |                                       (_) |         | |                      ");
    System.out.println("\t\t | |__| | ___  _ __ ___   ___    ___  __ _ _   _ _| |_ _   _  | |     ___   __ _ _ __  ");
    System.out.println("\t\t |  __  |/ _ \\| '_ ` _ \\ / _ \\  / _ \\/ _` | | | | | __| | | | | |    / _ \\ / _` | '_ \\ ");
    System.out.println("\t\t | |  | | (_) | | | | | |  __/ |  __/ (_| | |_| | | |_| |_| | | |___| (_) | (_| | | | |");
    System.out.println("\t\t |_|  |_|\\___/|_| |_| |_|\\___|  \\___|\\__, |\\__,_|_|\\__|\\__, | |______\\___/ \\__,_|_| |_|");
    System.out.println("\t\t                                        | |             __/ |                          ");
    System.out.println("\t\t                                        |_|            |___/                           ");
    System.out.println("\t\t=========================================================================================");

    System.out.println("\t\t  ______ _                              _                       ");
    System.out.println("\t\t |  ____(_)                            | |                      ");
    System.out.println("\t\t | |__   _ _ __   __ _ _ __   ___ ___  | |     ___   __ _ _ __  ");
    System.out.println("\t\t |  __| | | '_ \\ / _` | '_ \\ / __/ _ \\ | |    / _ \\ / _` | '_ \\ ");
    System.out.println("\t\t | |    | | | | | (_| | | | | (_|  __/ | |___| (_) | (_| | | | |");
    System.out.println("\t\t |_|    |_|_| |_|\\__,_|_| |_|\\___\\___| |______\\___/ \\__,_|_| |_|");
    System.out.println("\t\t==================================================================");

    System.out.println("\t\t  _______         ");
    System.out.println("\t\t |__   __|        ");
    System.out.println("\t\t    | | __ ___  __");
    System.out.println("\t\t    | |/ _` \\ \\/ /");
    System.out.println("\t\t    | | (_| |>  < ");
    System.out.println("\t\t    |_|\\__,_/_/\\_\\");
    System.out.println("\t\t===================");

    System.out.println("\t\t  _____            _     _______         ");
    System.out.println("\t\t |  __ \\          | |   |__   __|        ");
    System.out.println("\t\t | |__) |___ _ __ | |_     | | __ ___  __");
    System.out.println("\t\t |  _  // _ \\ '_ \\| __|    | |/ _` \\ \\/ /");
    System.out.println("\t\t | | \\ \\  __/ | | | |_     | | (_| |>  < ");
    System.out.println("\t\t |_|  \\_\\___|_| |_|\\__|    |_|\\__,_/_/\\_\\");
    System.out.println("\t\t==========================================");

    System.out.println("\t\t  _____                                  _______         ");
    System.out.println("\t\t |_   _|                                |__   __|        ");
    System.out.println("\t\t   | |  _ __   ___ ___  _ __ ___   ___     | | __ ___  __");
    System.out.println("\t\t   | | | '_ \\ / __/ _ \\| '_ ` _ \\ / _ \\    | |/ _` \\ \\/ /");
    System.out.println("\t\t  _| |_| | | | (_| (_) | | | | | |  __/    | | (_| |>  < ");
    System.out.println("\t\t |_____|_| |_|\\___\\___/|_| |_| |_|\\___|    |_|\\__,_/_/\\_\\");
    System.out.println("\t\t===========================================================");

    System.out.println("\t\t  _____                  _     _        _______         ");
    System.out.println("\t\t |  __ \\                | |   | |      |__   __|        ");
    System.out.println("\t\t | |__) |_ _ _   _  __ _| |__ | | ___     | | __ ___  __");
    System.out.println("\t\t |  ___/ _` | | | |/ _` | '_ \\| |/ _ \\    | |/ _` \\ \\/ /");
    System.out.println("\t\t | |  | (_| | |_| | (_| | |_) | |  __/    | | (_| |>  < ");
    System.out.println("\t\t |_|   \\__,_|\\__, |\\__,_|_.__/|_|\\___|    |_|\\__,_/_/\\_\\");
    System.out.println("\t\t              __/ |                                      ");
    System.out.println("\t\t             |___/                                       ");
    System.out.println("\t\t===========================================================");

    System.out.println("\t\t  _                    _             ");
    System.out.println("\t\t | |                  (_)            ");
    System.out.println("\t\t | |     ___  __ _ ___ _ _ __   __ _ ");
    System.out.println("\t\t | |    / _ \\/ _` / __| | '_ \\ / _` |");
    System.out.println("\t\t | |___|  __/ (_| \\__ \\ | | | | (_| |");
    System.out.println("\t\t |______\\___|\\__,_|___/_|_| |_|\\__, |");
    System.out.println("\t\t                                __/ |");
    System.out.println("\t\t                               |___/ ");
    System.out.println("\t\t=====================================");

    System.out.println("\t\t   _____ _                      __  __            _        _   ");
    System.out.println("\t\t  / ____| |                    |  \\/  |          | |      | |  ");
    System.out.println("\t\t | (___ | |__   __ _ _ __ ___  | \\  / | __ _ _ __| | _____| |_ ");
    System.out.println("\t\t  \\___ \\| '_ \\ / _` | '__/ _ \\ | |\\/| |/ _` | '__| |/ / _ \\ __|");
    System.out.println("\t\t  ____) | | | | (_| | | |  __/ | |  | | (_| | |  |   <  __/ |_ ");
    System.out.println("\t\t |_____/|_| |_|\\__,_|_|  \\___| |_|  |_|\\__,_|_|  |_|\\_\\___|\\__|");
    System.out.println("\t\t================================================================");

*/



  }
}

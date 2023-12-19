import java.util.*;

class Example2 {
    public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num=0;
		do{
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
			// System.out.print("\t Enter an option to continue -> ");
			// num = input.nextInt();
			// System.out.println("\n\n");
			boolean bankOp = false;
			do{
				System.out.print("\t Enter an option to continue -> ");
				char output1 = input.next().charAt(0);
				if (output1 == '1' || output1 == '2' || output1 == '3' || output1 == '4' || output1 == '5'  ) {
					num = (int)output1;
					bankOp = true;
				} else {
					bankOp = false;
					System.out.println("\t Please Enter Valid Input");
				}
			}while(bankOp==false);
	
    
			if (num == 49) {
				char answer1 = 'Y';
				do{
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
					System.out.println("\n");
					// System.out.print("\t Enter an option to continue -> ");
					// int depoNum = input.nextInt();
					// System.out.println("\n\n");
					boolean depoOp = false;
					int depoNum = 0;
					do{
						System.out.print("\t Enter an option to continue -> ");
						char output1 = input.next().charAt(0);
						if (output1 == '1' || output1 == '2' ) {
							depoNum = (int)output1;
							depoOp = true;
						} else {
							depoOp = false;
							System.out.println("\t Please Enter Valid Input");
						}
					}while(depoOp==false);
					
					if(depoNum==49){
						System.out.println("\t\t   _____             _                                                 _   ");
						System.out.println("\t\t  / ____|           (_)                 /\\                            | |  ");
						System.out.println("\t\t | (___   __ ___   ___ _ __   __ _     /  \\   ___ ___ ___  _   _ _ __ | |_ ");
						System.out.println("\t\t  \\___ \\ / _` \\ \\ / / | '_ \\ / _` |   / /\\ \\ / __/ __/ _ \\| | | | '_ \\| __|");
						System.out.println("\t\t  ____) | (_| |\\ V /| | | | | (_| |  / ____ \\ (_| (_| (_) | |_| | | | | |_ ");
						System.out.println("\t\t |_____/ \\__,_| \\_/ |_|_| |_|\\__, | /_/    \\_\\___\\___\\___/ \\__,_|_| |_|\\__|");
						System.out.println("\t\t                              __/ |                                        ");
						System.out.println("\t\t                             |___/                                         ");
						System.out.println("\t\t============================================================================");
						System.out.println("\n\n");
			
						System.out.print("\t\t\t\t Enter your amount : ");
						double savAmount = input.nextDouble();
			
						//calculation
						double intrPerMonth =  savAmount*0.05;
						double intrPeryear =  intrPerMonth*12;
						System.out.println("\n\n");
						System.out.printf("\t\t\t\t The intrest you get per month : %1.2f %n",intrPerMonth);
						System.out.println("\n");
						System.out.printf("\t\t\t\t The intrest you get per year  : %1.2f %n",intrPeryear);
			
					} else if (depoNum == 50) {
						System.out.println("\t\t  ______ _              _       _                      _ _   ");
						System.out.println("\t\t |  ____(_)            | |     | |                    (_) |  ");
						System.out.println("\t\t | |__   ___  _____  __| |   __| | ___ _ __   ___  ___ _| |_ ");
						System.out.println("\t\t |  __| | \\ \\/ / _ \\/ _` |  / _` |/ _ \\ '_ \\ / _ \\/ __| | __|");
						System.out.println("\t\t | |    | |>  <  __/ (_| | | (_| |  __/ |_) | (_) \\__ \\ | |_ ");
						System.out.println("\t\t |_|    |_/_/\\_\\___|\\__,_|  \\__,_|\\___| .__/ \\___/|___/_|\\__|");
						System.out.println("\t\t                                      | |                    ");
						System.out.println("\t\t                                      |_|                    ");
						System.out.println("\t\t================================================================");
						System.out.println("\n\n");

						System.out.print("\t\t\t\t Your Amount          : ");
						double fixAmount = input.nextDouble();
						System.out.println("\n");
						System.out.print("\t\t\t\t Enter number of year : ");
						double fixYears = input.nextDouble();
						System.out.println("\n\n");

						//calculation
						double intrPerMonth = fixAmount * 0.08;
						double intrEnd = intrPerMonth * 12 * fixYears + fixAmount;
						System.out.printf("\t\t\t\t The intrest you get per month : %1.2f %n", intrPerMonth);
						System.out.println("\n");
						System.out.printf("\t\t\t\t Total amount at the end       : %1.2f %n", intrEnd);
					}
					System.out.println("\n");
					boolean ans = false;
					do{
						System.out.print("\t Do you want to calculate another Deposit? (Y / N) -> ");
						char output1 = input.next().charAt(0);
						if (output1 == 'N' || output1 == 'Y') {
							answer1 = output1;
							ans = true;
						} else {
							System.out.println("\t Please Enter Valid Input");
							ans = false;
						}
					}while(ans!=true);
				}while(answer1=='Y');
			}
		}while(num!=53);
	}
}

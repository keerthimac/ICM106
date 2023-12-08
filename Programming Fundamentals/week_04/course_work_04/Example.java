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
    System.out.print("\t Enter an option to continue -> ");
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
		System.out.println("\n");
		System.out.print("\t Enter an option to continue -> ");
		int depoNum = input.nextInt();
		System.out.println("\n\n");
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
			System.out.println("\n\n");
			
			System.out.print("\t\t\t\t Your Amount          : ");
			double fixAmount = input.nextDouble();
			System.out.println("\n");
			System.out.print("\t\t\t\t Enter number of year : ");
			double fixYears = input.nextDouble();
			System.out.println("\n\n");
			
			//calculation
			double intrPerMonth =  fixAmount*0.08;
			double intrEnd =  intrPerMonth*12*fixYears+fixAmount;
			System.out.printf("\t\t\t\t The intrest you get per month : %1.2f %n",intrPerMonth);
			System.out.println("\n");
			System.out.printf("\t\t\t\t Total amount at the end       : %1.2f %n",intrEnd);
		}	
		
	}else if(num==2){
		System.out.println("\t\t\t\t  _                       ");
		System.out.println("\t\t\t\t | |                      ");
		System.out.println("\t\t\t\t | |     ___   __ _ _ __  ");
		System.out.println("\t\t\t\t | |    / _ \\ / _` | '_ \\ ");
		System.out.println("\t\t\t\t | |___| (_) | (_| | | | |");
		System.out.println("\t\t\t\t |______\\___/ \\__,_|_| |_|");
		System.out.println("\t\t\t\t                          ");
		System.out.println("\t\t\t======================================");
		System.out.println("\n\n");
		System.out.printf("\t\t\t\t %-15s %n","[1] Personal Loan");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[2] Business Loan");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[3] Home equity Loan");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[4] Car Finance");
		System.out.println("\n");
		System.out.print("\t Enter an option to continue -> ");
		int loanNum = input.nextInt();
		System.out.println("\n\n");
		
		if(loanNum==1){
			System.out.println("\t\t  _____                                _   _                       ");
			System.out.println("\t\t |  __ \\                              | | | |                      ");
			System.out.println("\t\t | |__) |__ _ __ ___  ___  _ __   __ _| | | |     ___   __ _ _ __  ");
			System.out.println("\t\t |  ___/ _ \\ '__/ __|/ _ \\| '_ \\ / _` | | | |    / _ \\ / _` | '_ \\ ");
			System.out.println("\t\t | |  |  __/ |  \\__ \\ (_) | | | | (_| | | | |___| (_) | (_| | | | |");
			System.out.println("\t\t |_|   \\___|_|  |___/\\___/|_| |_|\\__,_|_| |______\\___/ \\__,_|_| |_|");
			System.out.println("\t\t                                                                    ");
			System.out.println("\t============================================================================");
			System.out.println("\n\n");
			System.out.print("\t\tEnter your Salary          : ");
			double salary = input.nextDouble();
			System.out.println("\n\n");
			if(salary<50000){
				System.out.println("\t\t\t You cannot get a loan...");
			}else if(salary>=50000){
				System.out.printf("\t\tThe Maximum amount you can withdraw is %1.2f %n",salary*5);
				System.out.println("\n");
				System.out.print("\t\tEnter your amount          : ");
				double amount = input.nextDouble();
				System.out.println("\n");
				if(amount>salary*5){
					System.out.println(" You cannot have this amount");
				}
				System.out.print("\t\tEnter number of month      : ");
				double months = input.nextDouble();
				System.out.println("\n\n");
				
				if(amount>200000 && months>24){
					double amount1 = amount*1.2;
					double monIns1 = amount1/months;
					System.out.printf("\t\tyour Monthly instalment    : %1.2f",monIns1);
				}else if(amount<200000 && months<24){
					double amount2 = amount*1.15;
					double monIns2 = amount2/months;
					System.out.printf("\t\tyour Monthly instalment    : %1.2f",monIns2);
				}
			}
			
			
		}else if(loanNum==2){
			System.out.println("\t\t  ____            _                       _                       ");
			System.out.println("\t\t |  _ \\          (_)                     | |                      ");
			System.out.println("\t\t | |_) |_   _ ___ _ _ __   ___  ___ ___  | |     ___   __ _ _ __  ");
			System.out.println("\t\t |  _ <| | | / __| | '_ \\ / _ \\/ __/ __| | |    / _ \\ / _` | '_ \\ ");
			System.out.println("\t\t | |_) | |_| \\__ \\ | | | |  __/\\__ \\__ \\ | |___| (_) | (_| | | | |");
			System.out.println("\t\t |____/ \\__,_|___/_|_| |_|\\___||___/___/ |______\\___/ \\__,_|_| |_|");
			System.out.println("\t\t                                                                   ");
			System.out.println("\t\t===================================================================");
			System.out.println("\n\n");
			System.out.print("\t\tEnter your Income          : ");
			double bizIncome = input.nextDouble();
			System.out.println("\n\n");
			if(bizIncome<50000){
				System.out.println("\t\t\t You cannot get a loan...");
			}else if(bizIncome>=50000){
				System.out.printf("\t\tThe Maximum amount you can withdraw is %1.2f %n",bizIncome*5);
				System.out.println("\n");
				System.out.print("\t\tEnter your amount          : ");
				double bizAmount = input.nextDouble();
				System.out.println("\n");
				if(bizAmount>bizIncome*5){
					System.out.println(" You cannot have this amount");
				}
				System.out.print("\t\tEnter number of month      : ");
				double bizMonths = input.nextDouble();
				System.out.println("\n\n");
				
				if(bizAmount>500000 && bizMonths>36){
					double bizAmount1 = bizAmount*1.2;
					double bizMonIns1 = bizAmount1/bizMonths;
					System.out.printf("\t\tyour Monthly instalment    : %1.2f",bizMonIns1);
				}else if(bizAmount<500000 && bizMonths<36){
					double bizAmount2 = bizAmount*1.15;
					double bizMonIns2 = bizAmount2/bizMonths;
					System.out.printf("\t\tyour Monthly instalment    : %1.2f",bizMonIns2);
				}
			}
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
			System.out.println("\n\n");
			System.out.print("\t\tEnter your Income          : ");
			double homeIncome = input.nextDouble();
			System.out.println("\n\n");
			if(homeIncome<50000){
				System.out.println("\t\t\t You cannot get a loan...");
			}else if(homeIncome>=50000){
				System.out.printf("\t\tThe Maximum amount you can withdraw is %1.2f %n",homeIncome*5);
				System.out.println("\n");
				System.out.print("\t\tEnter your amount          : ");
				double homeAmount = input.nextDouble();
				System.out.println("\n");
				if(homeAmount>homeIncome*5){
					System.out.println(" You cannot have this amount");
				}
				System.out.print("\t\tEnter number of month      : ");
				double homeMonths = input.nextDouble();
				System.out.println("\n\n");
				
				if(homeAmount>500000 && homeMonths<48){
					double homeAmount1 = homeAmount*1.08;
					double homeMonIns1 = homeAmount1/homeMonths;
					System.out.printf("\t\tyour Monthly instalment    : %1.2f",homeMonIns1);
				}else if(homeAmount<500000 && homeMonths<48){
					double homeAmount2 = homeAmount*1.06;
					double homeMonIns2 = homeAmount2/homeMonths;
					System.out.printf("\t\tyour Monthly instalment    : %1.2f",homeMonIns2);
				}
			}
		}else if(loanNum==4){
			System.out.println("\t\t  ______ _                              _                       ");
			System.out.println("\t\t |  ____(_)                            | |                      ");
			System.out.println("\t\t | |__   _ _ __   __ _ _ __   ___ ___  | |     ___   __ _ _ __  ");
			System.out.println("\t\t |  __| | | '_ \\ / _` | '_ \\ / __/ _ \\ | |    / _ \\ / _` | '_ \\ ");
			System.out.println("\t\t | |    | | | | | (_| | | | | (_|  __/ | |___| (_) | (_| | | | |");
			System.out.println("\t\t |_|    |_|_| |_|\\__,_|_| |_|\\___\\___| |______\\___/ \\__,_|_| |_|");
			System.out.println("\t\t==================================================================");
			System.out.println("\n\n");
			System.out.print("\t\tEnter Value of the vehicle   : ");
			double vehValue = input.nextDouble();
			System.out.println("\n");
			System.out.print("\t\tEnter number of Month        : ");
			int vehMonth = input.nextInt();
			System.out.println("\n");

			double vehMonIns=0;
			
			if(vehMonth<12){
				vehMonIns = vehValue*1.06/vehMonth;
			}else if(vehMonth>12&&vehMonth<24){
				vehMonIns = vehValue*1.1/vehMonth;
			}else if(vehMonth>24&&vehMonth<36){
				vehMonIns = vehValue*1.14/vehMonth;
			}else if(vehMonth>36){
				vehMonIns = vehValue*1.16/vehMonth;
			}

			System.out.printf("\t\tyour Monthly instalment      : %1.2f",vehMonIns);
				
			
		}
		
	}else if(num==3){
		System.out.println("\t\t\t\t  _______         ");
		System.out.println("\t\t\t\t |__   __|        ");
		System.out.println("\t\t\t\t    | | __ ___  __");
		System.out.println("\t\t\t\t    | |/ _` \\ \\/ /");
		System.out.println("\t\t\t\t    | | (_| |>  < ");
		System.out.println("\t\t\t\t    |_|\\__,_/_/\\_\\");
		System.out.println("\t\t\t\t===================");
		System.out.println("\n\n");
		System.out.printf("\t\t\t\t %-15s %n","[1] Rent Tax");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[2] Income Tax");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[3] Payble Tax");
		System.out.println("\n");
		System.out.printf("\t\t\t\t %-15s %n","[4] Leasing");
		System.out.println("\n");
		System.out.print("\tEnter an option to continue -> ");
		int taxNum = input.nextInt();
		
		System.out.println("\n\n");
		
		if(taxNum==1){
			System.out.println("\t\t  _____            _     _______         ");
			System.out.println("\t\t |  __ \\          | |   |__   __|        ");
			System.out.println("\t\t | |__) |___ _ __ | |_     | | __ ___  __");
			System.out.println("\t\t |  _  // _ \\ '_ \\| __|    | |/ _` \\ \\/ /");
			System.out.println("\t\t | | \\ \\  __/ | | | |_     | | (_| |>  < ");
			System.out.println("\t\t |_|  \\_\\___|_| |_|\\__|    |_|\\__,_/_/\\_\\");
			System.out.println("\t\t==========================================");
			System.out.println("\n\n");
			System.out.print("\t\tEnter your Rent : ");
			double rentValue = input.nextDouble();
			System.out.println("\n");
			
			if(rentValue<100000){
				System.out.println("\t\tYou are not required to pay rent tax");
			}else if(rentValue>=100000){
				double rentTax = rentValue*0.05;
				System.out.printf("\t\tyour Monthly instalment : %1.2f",rentTax);
			}
			
		}else if(taxNum==2){
			System.out.println("\t\t  _____                                  _______         ");
			System.out.println("\t\t |_   _|                                |__   __|        ");
			System.out.println("\t\t   | |  _ __   ___ ___  _ __ ___   ___     | | __ ___  __");
			System.out.println("\t\t   | | | '_ \\ / __/ _ \\| '_ ` _ \\ / _ \\    | |/ _` \\ \\/ /");
			System.out.println("\t\t  _| |_| | | | (_| (_) | | | | | |  __/    | | (_| |>  < ");
			System.out.println("\t\t |_____|_| |_|\\___\\___/|_| |_| |_|\\___|    |_|\\__,_/_/\\_\\");
			System.out.println("\t\t===========================================================");		
			System.out.println("\n\n");
			System.out.print("\t\tEnter your total income per year : ");
			double income = input.nextDouble();
			System.out.println("\n");
			
			double incomeTax = 0;
			if(income<1200000){
				System.out.println("\t\tYou are not required to pay Income tax");
			}else if(income>=1200000 && income<1700000){
				incomeTax = (income-1200000)*0.06;
			}else if(income>=1700000 && income<2200000){
				incomeTax = 500000*0.06 + (income-1700000)*0.12;
			}else if(income>=2200000 && income<2700000){
				incomeTax = 500000*0.06 + 500000*0.12 + (income-2200000)*0.18;
			}else if(income>=2700000 && income<3200000){
				incomeTax = 500000*0.06 + 500000*0.12 + 500000*0.18 + (income-2700000)*0.24;
			}else if(income>=3200000 && income<3700000){
				incomeTax = 500000*0.06 + 500000*0.12 + 500000*0.18 + 500000*0.24 + (income-3200000)*0.30;
			}else if(income>=3700000){
				incomeTax = 500000*0.06 + 500000*0.12 + 500000*0.18 + 500000*0.24 + 500000*0.30 + (income-3700000)*0.36;
			}
			System.out.printf("\t\tYou have to pay Payable Tax per year : %1.2f",incomeTax);
			
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
			System.out.println("\n\n");
			System.out.print("\t\tEnter your employee payment per month : ");
			double income = input.nextDouble();
			System.out.println("\n");
			
			double payTax = 0;
			if(income<100000){
				System.out.println("\t\tYou are not required to pay Payable tax");
			}else if(income>=100000 && income<141667){
				payTax = (income-100000)*0.06;
			}else if(income>=141667 && income<183333){
				payTax = 2500 + (income-141667)*0.12;
			}else if(income>=183333 && income<225000){
				payTax = 7500 + (income-183333)*0.18;
			}else if(income>=225000 && income<266667){
				payTax = 15000 + (income-225000)*0.24;
			}else if(income>=266667 && income<308333){
				payTax = 25000 + (income-266667)*0.30;
			}else if(income>=308333){
				payTax = 37500 + (income-308333)*0.36;
			}
			System.out.printf("\t\tYou have to pay Income Tax per year : %1.2f",payTax);
			
			
		}else if(taxNum==4){
			System.out.println("\t\t  _                    _             ");
			System.out.println("\t\t | |                  (_)            ");
			System.out.println("\t\t | |     ___  __ _ ___ _ _ __   __ _ ");
			System.out.println("\t\t | |    / _ \\/ _` / __| | '_ \\ / _` |");
			System.out.println("\t\t | |___|  __/ (_| \\__ \\ | | | | (_| |");
			System.out.println("\t\t |______\\___|\\__,_|___/_|_| |_|\\__, |");
			System.out.println("\t\t                                __/ |");
			System.out.println("\t\t                               |___/ ");
			System.out.println("\t\t=====================================");
			System.out.println("\n\n");
			System.out.print("\tEnter the monthly lease amount you can afford : ");
			double leseAmount = input.nextDouble();
			System.out.println("\n");
			System.out.print("\tEnter number of year                          : ");
			double leseYears = input.nextDouble();
			System.out.println("\n");
			System.out.print("\tEnter annual interest rate                    : ");
			double intRate = input.nextDouble();
			System.out.println("\n\n");
			
			//calculation
			double intRateyer = intRate/100;
			double intRateMon = intRateyer/12;
			double months = leseYears*12;
					
			double lease = leseAmount*intRateMon/(1-(1/Math.pow(1+intRateMon, months)));
			
			System.out.printf("\tYou have to pay Income Tax per year : %1.2f",lease);
		}
	}else if(num==4){
		System.out.println("\t\t   _____ _                      __  __            _        _   ");
		System.out.println("\t\t  / ____| |                    |  \\/  |          | |      | |  ");
		System.out.println("\t\t | (___ | |__   __ _ _ __ ___  | \\  / | __ _ _ __| | _____| |_ ");
		System.out.println("\t\t  \\___ \\| '_ \\ / _` | '__/ _ \\ | |\\/| |/ _` | '__| |/ / _ \\ __|");
		System.out.println("\t\t  ____) | | | | (_| | | |  __/ | |  | | (_| | |  |   <  __/ |_ ");
		System.out.println("\t\t |_____/|_| |_|\\__,_|_|  \\___| |_|  |_|\\__,_|_|  |_|\\_\\___|\\__|");
		System.out.println("\t\t================================================================");
		System.out.println("\n\n");
		System.out.print("\tEnter your amount : ");
		double shareAmount = input.nextDouble();
		System.out.println("\n\n");
			
		//calculation
		double shareNum = shareAmount/80;
		double dividend = shareNum*6*12;
			
		System.out.printf("\tNumber of shares avilable : %1.0f %n",shareNum);
		System.out.printf("\tAnnual dividend           : %1.2f",dividend);
			
	}else if(num==5){
		System.out.println("\tGood Bye!");
	}else{
		System.out.println("\tPlease Enter Valid Input");
	}
  }
}

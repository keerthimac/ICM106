import java.util.*;

class Example {
        public static void main(String args[]) {
                System.out.println("\t\t\t\t\t\t\t\t______             _      _____ _                 ");
                System.out.println("\t\t\t\t\t\t\t\t| ___ \\           | |    /  ___| |                ");
                System.out.println("\t\t\t\t\t\t\t\t| |_/ / ___   ___ | | __ \\ `--.| |__   ___  _ __  ");
                System.out.println("\t\t\t\t\t\t\t\t| ___ \\/ _ \\ / _ \\| |/ /  `--. \\ '_ \\ / _ \\| '_ \\ ");
                System.out.println("\t\t\t\t\t\t\t\t| |_/ / (_) | (_) |   <  /\\__/ / | | | (_) | |_) |");
                System.out.println("\t\t\t\t\t\t\t\t\\____/ \\___/ \\___/|_|\\_\\ \\____/|_| |_|\\___/| .__/");
                System.out.println("\t\t\t\t\t\t\t\t                                           | |");
                System.out.println("\t\t\t\t\t\t\t\t                                           |_|");
                System.out.println("\t\t\t\t\t\t\t================================================================");

                // Price List
                double crBook = 80.00;
                double pen = 20.00;
                double pencil = 15.00;
                double eraser = 10.00;
                double glue = 40.00;
                double pencilBox = 100.00;
                double waterBottle = 230.00;
                double lunchBox = 250.00;
                double calculator = 250.00;
                double schoolBag = 1000.00;
                double ruler = 10.00;
                double highlighter = 50.00;
                double cardboardFile = 25.00;

                System.out.printf("\n\n");
                // Date Capture
                Scanner input = new Scanner(System.in);
                System.out.printf("\t\t\t\t\t\t\t\t%-19s : ", "Enter Date");
                String date = input.next();
                System.out.printf("\n");
                // Phone Number Capture
                System.out.printf("\t\t\t\t\t\t\t\t%-19s : ", "Customer Number");
                String cusNum = input.next();
                System.out.printf("\n");
                // Name Capture
                System.out.printf("\t\t\t\t\t\t\t\t%-19s : ", "Enter Customer Name");
                String cunName = input.next();

                System.out.printf("\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t\t  _____      _                 _   _____ _                     ");
                System.out.println("\t\t\t\t\t\t\t\t / ____|    | |               | | |_   _| |                    ");
                System.out.println("\t\t\t\t\t\t\t\t| (___   ___| |__   ___   ___ | |   | | | |_ ___ _ __ ___  ___ ");
                System.out.println("\t\t\t\t\t\t\t\t \\___ \\ / __| '_ \\ / _ \\ / _ \\| |   | | | __/ _ \\ '_ ` _ \\/ __|");
                System.out.println("\t\t\t\t\t\t\t\t ____) | (__| | | | (_) | (_) | |  _| |_| ||  __/ | | | | \\__ \\");
                System.out.println("\t\t\t\t\t\t\t\t|_____/ \\___|_| |_|\\___/ \\___/|_| |_____|\\__\\___|_| |_| |_|___/");
                System.out.println("");
                System.out.println("\t\t\t\t\t\t\t=============================================================================");
                System.out.println("\n\n");  
                // School Items Quantity Capture
                System.out.printf("\t\t\t\t\t\t\t\t%-20s : ", "CR Book (QTY)");
                double crBookQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\t\t\t\t\t\t\t\t%-20s : ", "Pen (QTY)");
                double penQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\t\t\t\t\t\t\t\t%-20s : ", "Pencil (QTY)");
                double pencilQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\t\t\t\t\t\t\t\t%-20s : ", "Eraser (QTY)");
                double eraserQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\t\t\t\t\t\t\t\t%-20s : ", "Pencil Box (QTY)");
                double pencilBoxQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\t\t\t\t\t\t\t\t%-20s : ", "Glue Bottle (QTY)");
                double glueQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\t\t\t\t\t\t\t\t%-20s : ", "Ruler-(MEDIUM) (QTY)");
                double rulerQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t\t   ____   __  __ _            _____ _                     ");
                System.out.println("\t\t\t\t\t\t\t\t  / __ \\ / _|/ _(_)          |_   _| |                    ");
                System.out.println("\t\t\t\t\t\t\t\t | |  | | |_| |_ _  ___ ___    | | | |_ ___ _ __ ___  ___ ");
                System.out.println("\t\t\t\t\t\t\t\t | |  | |  _|  _| |/ __/ _ \\   | | | __/ _ \\ '_ ` _ \\/ __|");
                System.out.println("\t\t\t\t\t\t\t\t | |__| | | | | | | (_|  __/  _| |_| ||  __/ | | | | \\__ \\");
                System.out.println("\t\t\t\t\t\t\t\t  \\____/|_| |_| |_|\\___\\___| |_____|\\__\\___|_| |_| |_|___/");
                System.out.println("");
                System.out.println("\t\t\t\t\t\t\t=============================================================================");
                System.out.println("\n\n");  
                System.out.printf("\t\t\t\t\t\t\t\t%-19s : ", "Calculator (QTY)");
                double calculatorQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\t\t\t\t\t\t\t\t%-19s : ", "Highlighters (QTY)");
                double highlighterQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\t\t\t\t\t\t\t\t%-19s : ", "Cardboard File (QTY)");
                double cardboardFileQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t\t   ____  _   _                 _____ _                     ");
                System.out.println("\t\t\t\t\t\t\t\t  / __ \\| | | |               |_   _| |                    ");
                System.out.println("\t\t\t\t\t\t\t\t | |  | | |_| |__   ___ _ __    | | | |_ ___ _ __ ___  ___ ");
                System.out.println("\t\t\t\t\t\t\t\t | |  | | __| '_ \\ / _ \\ '__|   | | | __/ _ \\ '_ ` _ \\/ __|");
                System.out.println("\t\t\t\t\t\t\t\t | |__| | |_| | | |  __/ |     _| |_| ||  __/ | | | | \\__ \\");
                System.out.println("\t\t\t\t\t\t\t\t  \\____/ \\__|_| |_|\\___|_|    |_____|\\__\\___|_| |_| |_|___/");
                System.out.println("");
                System.out.println("\t\t\t\t\t\t\t=============================================================================");
                System.out.println("\n\n");  

                // Other Items Quantity Capture
                System.out.printf("\t\t\t\t\t\t\t\t%-19s : ", "Water Bottle (QTY)");
                double waterBottleQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\t\t\t\t\t\t\t\t%-19s : ", "Lunch Box (QTY)");
                double lunchBoxQty = input.nextInt();
                System.out.printf("\n");

                System.out.printf("\t\t\t\t\t\t\t\t%-19s : ", "School Bag (QTY)");
                double schoolBagQty = input.nextInt();
                System.out.printf("\n");

                // Calculation amount of each item

                double crBookAmount = crBook * crBookQty;
                double penAmount = pen * penQty;
                double pencilAmount = pencil * pencilQty;
                double eraserAmount = eraser * eraserQty;
                double glueAmount = glue * glueQty;
                double pencilBoxAmount = pencilBox * pencilBoxQty;
                double waterBottleAmount = waterBottle * waterBottleQty;
                double lunchBoxAmount = lunchBox * lunchBoxQty;
                double calculatorAmount = calculator * calculatorQty;
                double schoolBagAmount = schoolBag * schoolBagQty;
                double rulerAmount = ruler * rulerQty;
                double highlighterAmount = highlighter * highlighterQty;
                double cardboardFileAmount = cardboardFile * cardboardFileQty;

                // Calculation of total amount
                double totalAmount = crBookAmount + penAmount + pencilAmount + eraserAmount + glueAmount
                                + pencilBoxAmount + waterBottleAmount + lunchBoxAmount + calculatorAmount
                                + schoolBagAmount + rulerAmount + highlighterAmount + cardboardFileAmount;

                // Discount calculation
                double discount = totalAmount * 10 / 100;

                // Total amount after discount
                double finalAmount = totalAmount - discount;

                System.out.println("\n\n\n\n");  
                System.out.println("\t\t\t\t\t\t+--------------------------------------------------------------------------------+");
                System.out.println("\t\t\t\t\t\t|\t\t______             _      _____ _                                |");
                System.out.println("\t\t\t\t\t\t|\t\t| ___ \\           | |    /  ___| |                               |");
                System.out.println("\t\t\t\t\t\t|\t\t| |_/ / ___   ___ | | __ \\ `--.| |__   ___  _ __                 |");
                System.out.println("\t\t\t\t\t\t|\t\t| ___ \\/ _ \\ / _ \\| |/ /  `--. \\ '_ \\ / _ \\| '_ \\                |");
                System.out.println("\t\t\t\t\t\t|\t\t| |_/ / (_) | (_) |   <  /\\__/ / | | | (_) | |_) |               |");
                System.out.println("\t\t\t\t\t\t|\t\t\\____/ \\___/ \\___/|_|\\_\\ \\____/|_| |_|\\___/| .__/                |");
                System.out.println("\t\t\t\t\t\t|\t\t                                           | |                   |");
                System.out.println("\t\t\t\t\t\t|\t\t                                           |_|                   |");
                System.out.println("\t\t\t\t\t\t+--------------------------------------------------------------------------------+");
                System.out.printf("\t\t\t\t\t\t| Tel  : %-70s  | %n", cusNum);
                System.out.printf("\t\t\t\t\t\t| Name : %-54s Date :%-10s | %n", cunName, date);
                System.out.println("\t\t\t\t\t\t+--------------------------------------------------------------------------------+");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "Items","QTY","Unit Price", "Price");
                System.out.println("\t\t\t\t\t\t+--------------------------------------------------------------------------------+");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","CR Book",crBookQty, crBook, crBookAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "", "", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","Pen",penQty, pen, penAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","Pencil",pencilQty, pencil, pencilAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","Erasers",eraserQty, eraser, eraserAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","Glue",glueQty, glue, glueAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","Pencil Box",pencilBoxQty, pencilBox, pencilBoxAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","Water Bottle",waterBottleQty, waterBottle, waterBottleAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","Lunch Box",lunchBoxQty, lunchBox, lunchBoxAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","Calculator",calculatorQty, calculator, calculatorAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","School Bag",schoolBagQty, schoolBag, schoolBagAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","Ruler",rulerQty, ruler, rulerAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","Highlighters",highlighterQty, highlighter, highlighterAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7.0f |      %-15.2f |      %-12.2f |%n","CardBoard File",cardboardFileQty, cardboardFile, cardboardFileAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s |      %-15s |      %-12s |%n", "", "","", "");
                System.out.println("\t\t\t\t\t\t+--------------------------------------------------------------------------------+");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s        %-15s |      %-12.2f |%n", "","Total","", totalAmount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|---------------------------------------------------------+%n","");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s %-15s       |       %-12.2f|%n", "","Discount","(10%)", discount);
                System.out.printf("\t\t\t\t\t\t|       %-15s|---------------------------------------------------------+%n","");
                System.out.printf("\t\t\t\t\t\t|       %-15s|      %-7s        %-15s |      %-12.2f |%n", "","Price","", finalAmount);
                System.out.println("\t\t\t\t\t\t+--------------------------------------------------------------------------------+");


                System.out.println("\n\n\n\n");  
                System.out.println("\t\t\t\t\t\t\t\t\t\t  ____        _                      ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t |  _ \\      | |                     ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t | |_) | __ _| | __ _ _ __   ___ ___ ");
                System.out.println("\t\t\t\t\t\t\t\t\t\t |  _ < / _` | |/ _` | '_ \\ / __/ _ \\");
                System.out.println("\t\t\t\t\t\t\t\t\t\t | |_) | (_| | | (_| | | | | (_|  __/");
                System.out.println("\t\t\t\t\t\t\t\t\t\t |____/ \\__,_|_|\\__,_|_| |_|\\___\\___|");
                System.out.println("\t\t\t\t\t\t\t\t\t==================================================");
                System.out.println("\n\n");                

                // Given Amount
                System.out.printf("\t\t\t\t\t\t%-19s  ", "Enter customer given amount - ");
                double givenAmount = input.nextInt();
                System.out.println("\n\n"); 

                // Balance Amount
                double changeAmount = givenAmount - finalAmount;


                // Balance paper and coins
                int changeAmountInt = (int) changeAmount;
                int fiveThousand = changeAmountInt / 5000;
                int fiveThousandbal = changeAmountInt % 5000;
                int twoThousand = fiveThousandbal / 2000;
                int twoThousandbal = fiveThousandbal % 2000;
                int thousand = twoThousandbal / 1000;
                int thousandbal = twoThousandbal % 1000;
                int fiveHundred = thousandbal / 500;
                int fiveHundredbal = thousandbal % 500;
                int twoHundred = fiveHundredbal / 200;
                int twoHundredbal = fiveHundredbal % 200;
                int hundred = twoHundredbal / 100;
                int hundredbal = twoHundredbal % 100;
                int fifty = hundredbal / 50;
                int fiftybal = hundredbal % 50;
                int twenty = fiftybal / 20;
                int twentybal = fiftybal % 20;
                int ten = twentybal / 10;
                int tenbal = twentybal % 10;
                int five = tenbal / 5;
                int fivebal = tenbal % 5;
                int one = fivebal / 1;

                System.out.println("\t\t\t\t\t\t\t\t\t\t +----------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |      %-16s  |      %-9.2f| %n", "Net Amount",finalAmount);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +----------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |      %-16s  |      %-9.2f| %n", "Cash", givenAmount);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +----------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |      %-16s  |      %-9.2f| %n", "Change",changeAmount);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +----------------------------------------+");
                System.out.printf("\n\n\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8s| %n", "Volume", "No");
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Rs.5000",fiveThousand);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Rs.2000",twoThousand);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Rs.1000",thousand);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Rs.500",fiveHundred);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Rs.200",twoHundred);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Rs.100",hundred);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Rs.50",fifty);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Rs.20",twenty);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Coin 10",ten);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Coin 5",five);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
                System.out.printf("\t\t\t\t\t\t\t\t\t\t |       %-15s  |      %-8d| %n", "Coin 1",one);
                System.out.println("\t\t\t\t\t\t\t\t\t\t +---------------------------------------+");
        }
}

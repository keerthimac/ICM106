import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Employees:");
		int emp = input.nextInt();
		int totSal = 0;
		int sal = 0;
		System.out.println();
		for (int i = 0; i < emp; i++) {
			System.out.print("Enter Employee " + (i + 1) + " Salary:");
			sal = input.nextInt();
			totSal += sal;
		}

		// Balance paper and coins
		int fiveThousand = totSal / 5000;
		int fiveThousandbal = totSal % 5000;
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
		int two = fivebal / 2;
		int twobal = fivebal % 2;
		int one = twobal / 1;

		System.out.println();
		System.out.printf("%-15s : %5d %n", "5000 Notes", fiveThousand);
		System.out.printf("%-15s : %5d %n", "2000 Notes", twoThousand);
		System.out.printf("%-15s : %5d %n", "1000 Notes", thousand);
		System.out.printf("%-15s : %5d %n", "500 Notes", fiveHundred);
		System.out.printf("%-15s : %5d %n", "200 Notes", twoHundred);
		System.out.printf("%-15s : %5d %n", "100 Notes", hundred);
		System.out.printf("%-15s : %5d %n", "50 Notes", fifty);
		System.out.printf("%-15s : %5d %n", "20 Notes", twenty);
		System.out.printf("%-15s : %5d %n", "10 Coins", ten);
		System.out.printf("%-15s : %5d %n", "5 Coins", five);
		System.out.printf("%-15s : %5d %n", "2 Coins", two);
		System.out.printf("%-15s : %5d %n", "1 Coins", one);
	}
}

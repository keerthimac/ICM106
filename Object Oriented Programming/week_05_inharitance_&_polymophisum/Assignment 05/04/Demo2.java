class Loan{
	double intrest;
	
	public void print(){
		System.out.println("Intrest:"+intrest);
	}
}

class CarLoan extends Loan{
	CarLoan (){
		intrest = 15;
	}
}

class HomeImprovementLoan extends Loan{
	HomeImprovementLoan(){
		intrest = 12.5;
	}
}

class MortgageLoan extends Loan{
	MortgageLoan(){
		intrest = 14.5;
	}
}


class Demo2{
	public static void main(String args[]){
		CarLoan c1 =new CarLoan();
		c1.print();
		HomeImprovementLoan t1 =new HomeImprovementLoan();
		t1.print();
		MortgageLoan r1 =new MortgageLoan();
		r1.print();
	}	
}

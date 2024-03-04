class BankAccount{
	double intrest;
	
	public void print(){
		System.out.println("Intrest: "+intrest);
	}
}

class CheckingAccount extends BankAccount{
	CheckingAccount(){
		intrest = 10.5;
	}
}

class SavingsAccount extends BankAccount{
	
	SavingsAccount(){
		intrest = 8.5;
	}
}


class Demo4{
	public static void main(String args[]){
		BankAccount b1 = new CheckingAccount();
		b1.print();
		BankAccount c1 = new CheckingAccount();
		c1.print();
	}	
}

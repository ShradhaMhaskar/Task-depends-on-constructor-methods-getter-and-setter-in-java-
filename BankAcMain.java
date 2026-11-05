package practiceQuestions;

public class BankAcMain {
	public static void main(String[] args) {
		BankAccount ac=new BankAccount(123213,"Priya Sharma",54000.0);
		ac.deposite(50000);
		ac.withdraw(10000);
		ac.displayBalance();
	}

}

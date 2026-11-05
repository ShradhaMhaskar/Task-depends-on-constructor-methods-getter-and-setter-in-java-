package practiceQuestions;

public class ATMMain {
	public static void main(String[] args) {
		ATM a=new ATM(13213,3422,40000.0);
		a.withdraw(3422, 22000);
		a.checkBalance(3422);
	}

}

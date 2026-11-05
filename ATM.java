package practiceQuestions;

public class ATM {
	private int accountNumber;
	private int pin;
	private double balance;

	ATM(int accountNumber, int pin, double balance) {
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = balance;
	}

	boolean validatePin(int enteredPin) {
		return pin == enteredPin;
	}

	void withdraw(int enteredPin, double amount) {
		if (!validatePin(enteredPin)) {
			System.out.println("Incorrect Pin..!");
		} else if (amount <= 0) {
			System.out.println("Invalid withdrawal amount..!");
		} else if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful..!");
			System.out.println("Remaining balance : " + balance);

		} else {
			System.out.println("Insuficient balance...!");
		}
	}

	void checkBalance(int enteredPin) {
		if (validatePin(enteredPin)) {
			System.out.println("Account number : " + accountNumber);
			System.out.println("Available balance : " + balance);
		} else {
			System.out.println("Incorrect Pin..!");
		}

	}

}

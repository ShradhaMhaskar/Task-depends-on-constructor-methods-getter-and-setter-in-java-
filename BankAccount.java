package practiceQuestions;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	BankAccount(int accountNumber,String accountHolderName,double balance){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	public void deposite(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Amount deposite successfully...!");
		}else {
			System.out.println("Invalid deposite amount..!");
		}
		
	}
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdrawal amount..!");
		}else if(amount<=balance) {
			balance-=amount;
			System.out.println("Amount withdraw successfully..!");
			}
		else {
			System.out.println("Insuficient balance..!");
		}
	}
	public void displayBalance() {
		System.out.println("Account Number : " +accountNumber);
		System.out.println("Account Holder Name : " +accountHolderName);
		System.out.println("Balance : " +balance);
	}

}

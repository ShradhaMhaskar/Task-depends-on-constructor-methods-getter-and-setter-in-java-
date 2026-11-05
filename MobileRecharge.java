package practiceQuestions;

public class MobileRecharge {
	int mobileNumber;
	String customerName;
	double balance;

	MobileRecharge(int mobileNumber, String customerName, double balance) {
		this.mobileNumber = mobileNumber;
		this.customerName = customerName;
		this.balance = balance;

	}
	void recharge(double amount) {
		if(amount>0) {
			balance+=amount;
		System.out.println("Recharge successfull..!" + amount);
		}else {
			System.out.println("Invalid recharge amount..!");
		}
	}
	void makeCall(double callCost) {
		if(callCost<=0) {
			System.out.println("Invalid call cost..!");
		}else if(balance>=callCost) {
			balance-=callCost;
			System.out.println("Call succeessful..!");
		}else {
			System.out.println("Insuficient balance..!");
		}
	}
	void checkBalance() {
		System.out.println("Mobile Number : " +mobileNumber);
		System.out.println("Customer Name : " +customerName);
		System.out.println("Available balance : " +balance);
		
	}

}

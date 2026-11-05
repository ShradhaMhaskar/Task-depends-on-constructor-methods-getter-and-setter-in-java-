package practiceQuestions;

public class ElectricityBill {
	String customerName;
	int units;

	ElectricityBill(String customerName, int units) {
		this.customerName = customerName;
		this.units = units;
	}

	double calculateBill() {
		double bill = 0;
		if (units <= 100) {
			bill = units * 2;
		} else if (units <= 200) {
			bill = units * 3;
		} else {
			bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
		}
		return bill;
	}

	void displayBill() {
		System.out.println("Customer Name : " + customerName);
		System.out.println("units : " + units);
		System.out.println("Electricity bill Rs. : " + calculateBill());
	}

}

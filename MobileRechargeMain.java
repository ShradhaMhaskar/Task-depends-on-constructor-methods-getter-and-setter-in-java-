package practiceQuestions;

public class MobileRechargeMain {
	public static void main(String[] args) {
		MobileRecharge m=new MobileRecharge(21343154,"Ram",100.0);
		m.recharge(200);
		m.makeCall(0);
		m.checkBalance();
	}

}

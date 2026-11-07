package practiceQuestions;

public class ShoppingCart {
	private String customerName;
	private String productName;
	private double price;
	private int quantity;
	
	ShoppingCart(String customerName,String productName,double price,int quantity){
		this.customerName=customerName;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	double calculateTotalAmount() {
		return price*quantity;
	}
	void displayFinalBill() {
		double total=calculateTotalAmount();
		double discount=0;
		if(total>5000) {
			discount=total*0.10;
		}else if (total>2000){
			discount=total*0.05;
			
			
		}
		double finalAmount=total-discount;
		System.out.println("Customer Name : "+customerName);
		System.out.println("Product Name : " +productName);
		System.out.println("Price : "+price);
		System.out.println("Quantity : "+quantity);
		System.out.println("Total Amount : "+total);
		System.out.println("Discount : "+discount);
		System.out.println("Final Amount : "+finalAmount);
	}

}

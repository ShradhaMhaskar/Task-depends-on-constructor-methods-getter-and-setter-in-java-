package practiceQuestions;

public class Product {
	private int productId;
	private String name;
	private double price;
	private int quantity;
	Product(int productId,String name,double price,int quantity){
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	double calculateTotalPrice() {
		return price*quantity;
	}
	void displayBill() {
		double total=calculateTotalPrice();
		double discount=0;
		if(total>5000) {
			discount=total*0.10;
		}
		double finalAmount=total-discount;
		System.out.println("Product ID : " +productId);
		System.out.println("Product Name : " +name);
		System.out.println("Product Price : " +price) ;
		System.out.println("Quantity : " +quantity);
		System.out.println("Total price : " +total);
		System.out.println("Discount : " +discount);
		System.out.println("Final Bill : " +finalAmount);
		
	}

}

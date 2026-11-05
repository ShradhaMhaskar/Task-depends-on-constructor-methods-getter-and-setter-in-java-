package practiceQuestions;

public class Rectangle {
	private double length;
	private double breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double calculateArea() {
		return length*breadth;
	}
	double calculatePerimeter() {
		return 2*(length+breadth);
	}
	boolean isSquare() {
		return length == breadth;
	}
	void displayResults() {
		System.out.println("Length : " +length);
		System.out.println("Breadth : " +breadth);
		System.out.println("Area : " +calculateArea());
		System.out.println("Perimeter : " +calculatePerimeter());
		System.out.println("Is Square : " +isSquare());
		if(isSquare()) {
			System.out.println("It is an square..!");
		}else {
			System.out.println("It is a rectangle");
		}
	}

}

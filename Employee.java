package practiceQuestions;

public class Employee {
	private int empId;
	private String name;
	private double basicSalary;
	Employee(int empId,String name,double basicSalary) {
		this.empId=empId;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	double calculateHRA() {
		return basicSalary*0.20;
	}
	double calculateDA() {
		return basicSalary*0.10;
	}
	double calculateGrossSalary() {
		return basicSalary+calculateHRA()+calculateDA();
	}
	void displayEmployeeDetails() {
		System.out.println("Employee ID : " +empId);
		System.out.println("Employee Name : "+name);
		System.out.println("Basic salary : " +basicSalary);
		System.out.println("HRA : " +calculateHRA());
		System.out.println("DA : " +calculateDA());
		System.out.println("Gross salary : " +calculateGrossSalary());
	}
	

}

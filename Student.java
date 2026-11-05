package practiceQuestions;

public class Student {
	private int studentId;
	private String studentName;
	private double marks;
    Student(int studentId,String studentName,double marks){
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks=marks;
		
	}
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setMarks(double marks) {
		this.marks=marks;
	}
	public double getMarks() {
		return marks;
	}
	void displayResult() {
		System.out.println("Student Id : " +studentId);
		System.out.println("Student Name : " +studentName);
		System.out.println("Marks : " +marks);
		if(marks>=35) {
			System.out.println("Passed...!");
		}else {
			System.out.println("Fail...!");
		}
	}
	

}

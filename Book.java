package practiceQuestions;

public class Book {
	private int bookId;
	private String bookName;
	private String authorName;
	private int availableCopies;
	Book(int bookId,String bookName,String authorName,int availableCopies){
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.availableCopies=availableCopies;
	}
	void issueBook() {
		if(availableCopies > 0) {
			availableCopies--;
			System.out.println("Book issued successfuly...!");
		}else {
			System.out.println("No copies available...!");
		}
	}
	void returnBook() {
		availableCopies++;
		System.out.println("Book return successfully..!");
	}
	void displayBookDetails() {
		System.out.println("Book ID : " +bookId);
		System.out.println("Book Name : " +bookName);
		System.out.println("Author Name : " +authorName);
		System.out.println("Available Copies : "  +availableCopies);
	}

}

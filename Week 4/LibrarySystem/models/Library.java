package models;
public class Library{
private Person staff;
private Book book;
private String name;
private Person incharge;

	public Library(String name,Book book,Person incharge,Person staff){
	this.name=name;
	this.book=book;
	this.incharge=incharge;
	this.staff=staff;

}
	public String getName(){
	return name;
	}

	public Person getIncharge(){
	return ;
	}
	public Person getStaff(){
	return staff;	
}
	public Book getBook(){
	return book;
	}

	public void showDetails(){
	System.out.println("Library Name : "+name);
	System.out.println("\nBook Details: ");
	book.showbookdetails();
	System.out.println("\nIncharge Details: ");
	incharge.showinchargedetails;
	System.out.println("\Staff Details: ");
	staff.showstaffdetails;

		}

}
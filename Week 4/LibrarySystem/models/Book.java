public class Book{

	private String title;
	private String issn;
	private Person author;
	private Date dop;



	public Book(String title,String issn,Person author,Date dop){
	this.title=title;
	this.issn=issn;
	this.author=author;
	this.dop=dop;

}

	public String gettitle(){
	return title;
}
	public String getissn(){
	return issn;
}
	public Person getauthor(){
	return author;

}
	public Date getdop(){
	return dop;
}
	
	public void showbookdetail(){

	System.out.println("Book Name: "+title);
	System.out.println("ISSN: "+issn);
	System.out.println("Author: "+author.getname());
	System.out.println("Publication Date: "+publicationdate.getday()+"/"+publicationdate.getmonth()+"/"+publicationdate.year());
}







}
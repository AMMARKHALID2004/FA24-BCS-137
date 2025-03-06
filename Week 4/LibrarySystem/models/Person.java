public class Person{

	private String name;
	private String incharge;

	public Person(String name,String incharge){

	this.name=name;
	this.incharge=incharge;

}
	public String getname(){
	return name;
}
	public String getincharge(){

	this.incharge=incharge;
}

	public void showpersondetails(){

	System.out.println("Name: "+name);
	System.out.println("Role: "+incharge);
}



}
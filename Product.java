public class Product{

	private int productcounter=1;

	private String name;
	private int quantity;
	private String id;
	private int price;
	private String category;

	public Product(String name1,int qty,int price1,String cat){
	name=name1;
	quantity=qty;
	price=price1;
	category=cat;
	id="E"+String.format("%04d",productcounter);

}


	public void SetName(String name){
	 name="Keyboard";

}
	public String GetName(){
	return name;

} 
	public void SetQuantity(int quantity){
	quantity=10;
}
	public int GetQuantity(){
	return quantity;
}
	public void SetPrice(int price){
	 price=1000;
}
	public int GetPrice(){
	return price;
}
	public void SetCategory(String category){
	 category="Computing";
}
	public String GetCategory(){
	return category;

}
} 
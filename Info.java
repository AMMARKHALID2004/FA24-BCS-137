public class Info{


	public static void main(String args[]){
	Product first=new Product();
	Product second=new Product();
	Product third=new Product();
	first.SetName("Keyboard");
	first.SetQuantity(10);
	first.SetPrice(1000);
	first.SetCategpry("Computing");
	second.SetName("Chocolate");
	second.SetQuantity(9);
	second.SetPrice(450);
	second.SetCategory("Edible");
	third.SetName("Jar");
	third.SetPrice(300);
	third.SetQuantity(20);
	third.SetCategory("Household Use");
	
}
	public void Display_Data(Product p){
	system.out.println(p.first);

}

}
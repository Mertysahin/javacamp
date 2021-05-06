package oopIntro;

public class Main {

	public static void main(String[] args) 
	{
		
		
		Product product1 = new Product(1,"Lenovo V14",15000,"8GB RAM"); //referans olusturma,instance olusturma
		
		Product product2 = new Product();

		product2.id=2;
		product2.name="HP";
		product2.unitPrice=15000;
		product2.detail="16 GB RAM";
		
		Product product3 = new Product();

		product3.id=3;
		product3.name="Asus";
		product3.unitPrice=15000;
		product3.detail="16 GB RAM";
		
		Product[] products = {product1,product2,product3};
		
		for(Product product : products) {
			System.out.println(product.name);
		}
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Ev/bah�e";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCard(product1);
		productManager.addToCard(product2);
		productManager.addToCard(product3);
	}
	
}

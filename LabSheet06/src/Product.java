
public class Product {
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String prodName,double prodPrice,double prodVat) {
		name = prodName;
		price = prodPrice;
		vatRate = prodVat;	
	}
	
	public double calculateTotalPrice() {
		vatRate = 0.07;	
		double totalPrice = price + (price*vatRate);
		return totalPrice;
	}
	
	public void displayProductDetails() {
		System.out.println("Product Details:");
		System.out.println("Product Name : "+ name);
		System.out.println("Price (Before VAT) : "+ price);
		System.out.println("Price (After VAT) : "+ calculateTotalPrice());
	}
}

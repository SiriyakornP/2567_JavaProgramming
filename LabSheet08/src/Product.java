
public class Product {
	private String productId;
	private int productUnit;
	private double productPrice;
	
	public void setId(String prodId) {
		prodId = productId;
	}
	public String getId() {
		return productId;
	}
	
	public void setUnit(int ProdUnit) {
		ProdUnit = productUnit;
	}
	public int getUnit() {
		return productUnit;
	}
	
	public void setPrice(double prodPrice) {
		prodPrice = productPrice;
	}
	public double getPrice() {
		return productPrice;
	}
	
	public double calculate() {
		return productUnit * productPrice;
	}
}

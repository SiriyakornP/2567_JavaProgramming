import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Product product1 = new Product();
		
		System.out.print("Enter product name: ");
		String prodName1 = scan.nextLine();		
		System.out.print("Enter product price: ");
		double prodPrice1 = scan.nextDouble();
		System.out.print("Enter VAT rate (%) : ");
		double prodVAT1 = scan.nextDouble();
		
		product1.setProductDetails(prodName1, prodPrice1, prodVAT1);
		System.out.println();
		product1.displayProductDetails();
		System.out.println();
		
	}

}

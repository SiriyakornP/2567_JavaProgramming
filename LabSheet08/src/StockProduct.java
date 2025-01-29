import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product[] productList = new Product[4];
		for(int i=0;i<productList.length;i++) {
			System.out.print("Input product id: ");
			String id = scan.nextLine();
			System.out.print("Input product unit: ");
			int unit = scan.nextInt();
			System.out.print("Input product price: ");
			double price = scan.nextDouble();
			
			productList[i] = new Product(id,unit,price);
		}//end for
		
		double total = 0;
		for(Product product : productList) {
			total += product.calculate();
			if(product.calculate()>0) {
				Line();
				System.out.println("Product Id : "+ product.getId() + ", Total Price = " + product.calculate() + " baht.");
				Line();
				System.out.println("Total price of all products is " + total + " baht.");
			}
		}//end for each
		
		scan.close();
	}
	
	public static void Line() {
		for(int i=0; i<50;i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}

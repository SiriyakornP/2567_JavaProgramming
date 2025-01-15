
public class LoanCalculator {
	private String productName;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String name,double prodPrice,double intRate,int debtYears) {
		productName = name;
		price = prodPrice;
		interestRate = intRate/100/12;
		years = debtYears;
	}
	
	public double calculateMonthlyPayment() {
		double monthlyInterestRate = interestRate;
		int numOfPayments = years *12;
		double monthlyPayment = price*monthlyInterestRate*Math.pow(1+monthlyInterestRate, numOfPayments)/(Math.pow(monthlyInterestRate, numOfPayments)-1);
		return monthlyPayment;
	}
	
	public void displayLoanDetails() {
		System.out.println("Product : "+ productName);
		System.out.println("Price : "+ price);
		System.out.println("Interest Rate: "+ interestRate + "%");
		System.out.println("Loan Period: "+ years + "years");
		System.out.println("Monthly Payment: "+ calculateMonthlyPayment());
	}

}

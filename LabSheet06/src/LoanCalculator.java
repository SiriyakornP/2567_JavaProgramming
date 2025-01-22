
public class LoanCalculator 
{
    private String name;
    private double price;
    private double interestRate;
    private double years;

    public void setLoanDetails(String productName, double dbprice, double dbinterestRate, int dbyears) 
    {
        name = productName;
        price = dbprice;
        interestRate = dbinterestRate;
        years = dbyears;
    }

    public double calculateMonthlyPayment() 
    {
        double month = years * 12;
        double interestRatee = (interestRate / 12) / 100;
        return (price * interestRatee * (Math.pow((1 + interestRatee), month))) /
               ((Math.pow((1 + interestRatee), month)) - 1);
    }

    public void displayLoanDetails() 
    {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Loan Period: " + years + " years");
        System.out.println("Monthly Payment: " + calculateMonthlyPayment());
    }
}    

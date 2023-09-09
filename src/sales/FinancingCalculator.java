package sales;

public class FinancingCalculator implements Financing{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public double calculateMonthlyPayment() {

        double annualInterestRate = 0.05;
        int loanTermMonths = 36;

        double monthlyInterestRate = annualInterestRate / 12;

        double loanAmount = getPrice();


        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));

        return monthlyPayment;

    }
}

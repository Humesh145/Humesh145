package Abstraction;

public class Client extends Bank {

	@Override
	public void loan_Amount() {
	System.out.println("Loan Amt : 500000");
		
	}

	@Override
	public void emi() {
		System.out.println("EMI : 8000");
		
	}
	public static void main(String[] args) {
		Client Loan = new Client ();
		Loan.name();
		Loan.interest_Rate();
		Loan.tenure();
		Loan.loan_Amount();
		Loan.emi();

	}

}

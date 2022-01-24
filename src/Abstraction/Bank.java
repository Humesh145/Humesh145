package Abstraction;

public abstract class Bank 	{
	
	public void name() {
System.out.println("Bank Name : HDFC");

	}
	public void interest_Rate () {
System.out.println("Interest Rate : 15%");

	}
	public void tenure () {
		System.out.println("Tenure : 5 years");

			}
	
public abstract void loan_Amount();
public abstract void emi();
}
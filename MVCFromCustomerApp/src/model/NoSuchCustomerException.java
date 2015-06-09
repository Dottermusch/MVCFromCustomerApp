package model;

public class NoSuchCustomerException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int customerNumber;
	
	public NoSuchCustomerException ()
	{
		
	}
	
	public NoSuchCustomerException(int customerNumber)
	{
		super("The customer " + customerNumber + " does not exist.");
		this.customerNumber = customerNumber;
	}
	
	public int getCustomerNumber()
	{
		return customerNumber;
	}
}

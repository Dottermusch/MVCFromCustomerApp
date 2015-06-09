package controller;

import java.util.ArrayList;
import java.util.TreeMap;

import model.*;
import view.*;



public class CustomerApp
{

	/*
	 * CustomerApp prompts for a customer number for which it queries the CustomerIO class.
	 * If the customer number exists, the customer data is returned.  If not, CustomerIO
	 * throws an custom exception to demonstrate how exception handling and propagation works. 
	 * 
	 * Rick Dottermusch
	 * June 8, 2015
	 * 
	 */
	
	public static void main(String[] args)
	{
		// Test comment for GitHub
		int customerNumber = 0;
		String goAgain = "y";
		
		// display the starting welcome message
		DisplayUtils.displayWelcomeMessage();
		
		// Get customer summary information from the CustomerIO (model) methods to enable menu summary
		ArrayList<Integer> customerNumbers = CustomerIO.getCustomerNumbers();
		TreeMap<Integer, String> customers = CustomerIO.getCustomerSummaryList();
		
		// Display the summary customer data (using the view classes) to show valid user entries
		DisplayUtils.displayCustomerSummary(customerNumbers, customers);
		
		
		
		while (goAgain.equalsIgnoreCase("y"))
		{
			// call Validator (view) class method to prompt for a response
			customerNumber = Validator.promptForIntegerResponse("\nEnter a customer number in integer format (e.g., nnnn): ");
			
			try
			{
				// get customer data based on customer number input by user
				Customer customer = CustomerIO.getCustomer(customerNumber);
				
				// get string with all customer details from Customer
				String customerString = customer.getNameAndAddress();
				
				// display the output details of the selected customer
				DisplayUtils.displayCustomerData(customerString);
			}
			catch (model.NoSuchCustomerException nce)
			{
				DisplayUtils.displayExceptionMessage(nce);
			}
			
			goAgain = Validator.promptForStringResponse("Display another customer? (y/n) ");
			
		}	
		
		DisplayUtils.displayCustomerAppEndedMessage();
		
	}

}

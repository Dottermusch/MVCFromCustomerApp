package view;

import java.util.ArrayList;
import java.util.TreeMap;


public class DisplayUtils
{
	public static void displayCustomerData(String customerString)
	{
		System.out.println(customerString);
	}
	
	public static void displayCustomerAppEndedMessage()
	{
		System.out.println("\nProgram ended.");
	}
	
	public static void displayWelcomeMessage()
	{
		System.out.println("Welcome to the Customer application!\n");
	}
	
	public static void displayExceptionMessage(Exception e)
	{
		System.out.println("\nError! " + e.getMessage() + "\n");
	}
	
	public static void displayCustomerSummary(ArrayList<Integer> customerNumbers, TreeMap<Integer, String> customers)
	{
		System.out.println("Cust No.\tCustomer Name");
		System.out.println("========\t=============");
		for (Integer i : customerNumbers)
		{
			System.out.println(i + "\t\t" + customers.get(i));
		}
	}
}

//Author: Saniha Sreedhara
//Date: 03/28/2024
//Rev: 01
//Note: 

/*
   This class implements a vendor that sells one kind of items.
   A vendor carries out sales transactions.
*/

public class Vendor
{
  // Fields:
  private int stock;
  private int deposit;
  private int change;
  private int price1;
  
  private static double total_rev = 0.0;
  private static double tot_rev = 0.0;

  //  Constructor
  //  Parameters:
  //    int price of a single item in cents
  //    int number of items to place in stock
  
  public Vendor(int price, int itemNumber) {
	  
	  stock = itemNumber;
	  price1 = price;
	  
  }

  //  Sets the quantity of items in stock.
  //  Parameters:
  //    int number of items to place in stock
  //  Return:
  //    None

  public void setStock(int itemsToPlace) {  //  Sets the quantity of items in stock.
      stock = itemsToPlace;
  }

  //  Returns the number of items currently in stock.
  //  Parameters:
  //    None
  //  Return:
  //    int number of items currently in stock

  public int getStock() {   //  Returns the number of items currently in stock.

	  return stock;
  }

  //  Adds a specified amount (in cents) to the deposited amount.
  //  Parameters:
  //    int number of cents to add to the deposit
  //  Return:
  //    None
  
  public void addMoney(int cents) {   //  Adds a specified amount (in cents) to the deposited amount.

	  
	  deposit = deposit + cents;
	 
  }

  //  Returns the currently deposited amount (in cents).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current deposit

  
  public int getDeposit() {
	  return deposit;
  }

  //  Implements a sale.  If there are items in stock and
  //  the deposited amount is greater than or equal to
  //  the single item price, then adjusts the stock
  //  and calculates and sets change and returns true;
  //  otherwise refunds the whole deposit (moves it into change)
  //  and returns false.
  //  Parameters:
  //    None
  //  Return:
  //    boolean successful sale (true) or failure (false)
  
  public boolean makeSale() {
	  
	  int price;
	//  JButton c;
	  
	  
	  if (deposit >= price1 && stock > 0) {
		  change = deposit - price1;
		  deposit = 0;
		  stock --;
		  
		  total_rev += ((double)price1/100);
		  return true;
		  
	  }
	  else {
		  change = deposit;
		  deposit = 0;
		  return false;
	  }
	  
  }

  //  Returns and zeroes out the amount of change (from the last
  //  sale or refund).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current change   //  Returns and zeroes out the amount of change (from the last

//  ... getChange ...
//  {
//    ...
//  }
  
  public int getChange() {   //  Returns and zeroes out the amount of change (from the last

	  
	  int returnChange = change;
	  change = 0;
	  return returnChange;
	  
  }
  
  public static double getTotalSales() {
	  
	  tot_rev = total_rev;
	  total_rev = 0.0;
	  return tot_rev;
	  
  }
  

}

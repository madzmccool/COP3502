/*
 * Madeleine Godette
 * Section: 11053
 * Assignment:  HW #1
 * Due: Jan 25, 2019
*/

public class Account
{
    
    private double balance;
    
    // default constructor
    public Account()
    {
        this.balance = 1000;
    }
    //initialization constructor
    public Account(double balance)
    {
        this.balance = balance;
    }
    //get accessor
    public double getBalance()
    {
        return balance;
    }
    //set accessor
    public void setBalance(double balaIn)
    {
        this.balance = balaIn;
    }
    //print info method
    public void printInfo()
    {
        System.out.println(toString());
    }
    //toString method
    public String toString()
    {
        String str = "Account balance: $" + balance + "\n";
        return str;
    }
    //deposit method
    void deposit(double balance)
    {
        setBalance(getBalance() + balance);
    }
    //withdrawal method
    double withdrawal(double balance)
    {
        setBalance(getBalance() - balance);
        return getBalance();
    }
}
/* 
 * Homework problem 2:
 * If you are thinking of the java class vacation some
 * potential properties could be as follows:
 * 
 * I'm thinking a comparison of different locations, price point, hotel rating
 * type of travel needed to reach destination (drive, fly, ect.)
 * 
 * Properties:
 * private string vacayDest
 * private string transport
 * private double price
 * private int hotel rating
 * 
 * Methods:
 * public String getName()
 * public String getModeTransport()
 * public double getHotelPrice()
 * public double getTravelPrice()
 * public int getRate()
 * public void setName (String vacayDest)
 * public void setModeTransport (String transport)
 * public void setPrice(double price)
 * public void setRate (int hoteRate)
 * public void printInfo()
 * public void toString()
 *  
 */

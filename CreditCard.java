
/**
 * Write a description of class CraditCard here.
 *
 * @author (CS4001NI_programming_MOhammad ajamatullah_22068146
        (np01cp4a220497@islingtoncollage.edu.np))
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    public  CreditCard(double balanceAmount,int cardId,String clientName, String bankAccount, String issuerBank,int cvcNumber, String expirationDate, double interestRate)
    {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }

    //using getter methods for each attribute of Credit Card.
    public int getcvcNumber()
    {
        return this.cvcNumber;
    }

    public double getcreditLimit()
    {
        return this.creditLimit;
    }

    public double getinterestRate()
    {
        return this.interestRate;
    }

    public String getexpirationDate()
    {
        return this.expirationDate;
    }

    public int getgracePeriod()
    {
        return gracePeriod;
    }

    public boolean getisGranted()
    {
        return isGranted;
    }

    //The method accepts a new credit limit, and new Grace Period as parameter and, if the credit limit is less than or equal to 2.5 times
    public void setcreditLimit(double creditLimit, int gracePeriod)
    {
        if(creditLimit <= (2.5* super.getbalanceAmount()))
        {
            isGranted = true;
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
        }
        else
        {
            System.out.println("The Credit is not issued ");
        }
    }

    //method cancelCreditCard with attributes is set 0 and isGranted if fales.
    public void CancelCreditCard()
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }

    //display the methods for Credit Card.
    public void display()
    {
        super.Display();
        if (isGranted==true)
        {
            System.out.println("The Credit limit is: " + getcreditLimit());
            System.out.println("The grace period is: " + getgracePeriod());
            System.out.println("the Interest rate is: " + getinterestRate());
            System.out.println("the CVC number is: " + getcvcNumber());
            System.out.println("The Expiration Date is: " + getexpirationDate());
            System.out.println("The isGranted is: " + getisGranted());
        }
        else
        {
            System.out.println("The Credit limit is: " + getcreditLimit());
            System.out.println("The grace period is: " + getgracePeriod());
            System.out.println("the Interest rate is: " + getinterestRate());
            System.out.println("The Expiration Date is: " + getexpirationDate());
            System.out.println("The isGranted is: " + getisGranted());
        }
    }
}

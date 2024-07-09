
/**
 * Write a description of class DebitCard here.
 *
 * @author (CS4001NI_programming_MOhammad ajamatullah_22068146
        (np01cp4a220497@islingtoncollage.edu.np))
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;

    // A call is made to the superclass constructor with parameters
    public DebitCard(double balanceAmount,int cardId,String clientName, String bankAccount, String issuerBank, int pinNumber)
    {
        super(balanceAmount,cardId,bankAccount,issuerBank);
        super.setClientName(clientName);   
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;

    }

    //  using the getter & setter methodes for each attribute of debitCard.
    public int getpinNumber()
    {
        return this.pinNumber;
    }

    public int getwithdrawalAmount()
    {
        return this.withdrawalAmount;
    }

    public String getdateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }

    // setter method for only  withdrawAmount.
    public void setwithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount = withdrawalAmount;
    }

    //  creaing new method named Withdraw. 
    // The method is used to deduct the money directly from the client account. The method accepts Withdrawal Amount, date Of Withdrawal, and PIN number.
    public void withDraw( int withdrawalAmount, String dateOfWithDrawal, int pinNumber)
    {
        if(this.pinNumber==pinNumber)
        {
            if(super.getbalanceAmount() >= withdrawalAmount) 
            {
                super.setbalanceAmount(super.getbalanceAmount() - withdrawalAmount);
                this.hasWithdrawn = true;
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
            }
            else
            {
                System.out.println("insufficient Balance. Please check your Balance Amount");
            }
        }
        else
        {
            System.out.println("invalid PIN");
        }
    }

    //DISPLAY the methods of Debit card.
    public void display()
    {
        if(hasWithdrawn)
        {  
            super.Display();
            System.out.println("Pin Number is: " + getpinNumber());
            System.out.println("WithDrawn Amount is: " + getwithdrawalAmount());
            System.out.println("Date of withDrawn Amount is: " + getdateOfWithdrawal()); 
        }
        else
        {
            System.out.println("Sorry, the transaction has not been carried yet Please try again. " + super.getbalanceAmount());
        }
    }
}
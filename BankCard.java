/**
 * Write a description of class BankCard here.
 *
 * @author (CS4001NI_programming_MOhammad ajamatullah_22068146
(np01cp4a220497@islingtoncollage.edu.np))
 * @version (a version number or a date)
 */

public class BankCard
{
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;

    //consturctor for the Bank card.

    public BankCard(double balanceAmount,int cardId, String bankAccount, String issuerBank)
    {
        this.clientName = "";                          /** setclientname accepts a new client name as a parameter **/
        this.balanceAmount = balanceAmount;            /** :setbalance amount accepts a new balance amount  **/
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }

    // using the getter mentod
    public int getcardId()
    {
        return this.cardId;
    }

    public String getclientName()
    {
        return this.clientName;
    }

    public String getissuerBank()
    {
        return this.issuerBank;
    }

    public String getbankAccount()
    {
        return this.bankAccount;
    }

    public double getbalanceAmount()
    {
        return this.balanceAmount;
    }

    // using the setter methoed

    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }

    public void setbalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }

    //display the methods of Bank card.
    public void Display()
    {
        if (this.clientName.equals(""))
        {
            System.out.print("Client name is not assigned");
        }
        else
        {
            System.out.print("Client name is: " + this.clientName + "\n");
            System.out.println("card id is: " + this.cardId);
            System.out.println("Issuer Bank is: " + this.issuerBank);
            System.out.println("Bank Account is: " + this.bankAccount);
            System.out.println("Balance Amount is: " + this.balanceAmount);
        }
    } 
}


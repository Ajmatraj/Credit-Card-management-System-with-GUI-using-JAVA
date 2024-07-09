import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList; 

/**
 * Write a description of class BankCard_GUI here.
 *
 * @author (CS4001NI_programming_MOhammad ajamatullah_22068146
(np01cp4a220497@islingtoncollage.edu.np))
 * @version (a version number or a date)
 */

class BankCard_GUI implements ActionListener
{

    JFrame frame1,frame2,frame3,frame4;  
    //frame4 credit limit
    private JLabel Lbl_Grace_period,Lbl_Credit_Limit,Lbl_CardId;
    private JTextField txt_Credit_Limit,txt_Grace_period,txt_CardId_CL;
    private JButton btnSet_Credit_Limit,btnClear_Credit_Limit,btnclose_Credit_Limit;

    //frame1 debit card
    private JLabel title,l1frame1,l2frame1,l3frame1,l4frame1,l5frame1,l6frame1,L7frame1_expiration_Date;
    private JButton btnMove_To_Credit_Card,btnBack_To_Debit_Card,btnWithdrawal_from_Debit_card,btnDispay,btnClear,close,btnAddDebitCard_frame1;
    private JTextField txt_cardID_f1,txt_clientName_f1,txt_issuerBank_f1,txt_bankAcount_f1,txt_pinNumber_f1,txt_BalanceAmount_f1;
    private JComboBox jc1_frame1,jc2_frame1,jc3_frame1;

    //frame2 credit
    private JButton btnDispay_frame2,btnClear_frame2,close_frame2,btnCreditLimit_frame2,btnAdd_to_Cradit_Card,btnCancleCredit_frame2,Lbl_cardID_Detials;
    private JLabel l1frame2,l2frame2,l3frame2,l4frame2,l5frame2,l6frame2,l7frame2,l8frame2,l9frame2;
    private JTextField txt_cardID_f2,txt_clientName_f2,txt_issuerBank_f2,txt_intererstRate_f2,txt_cvcNumber_f2,txt_bankAcount_f2,txt_pinNumber_f2,txt_balanceAmount_f2;
    private JComboBox jc1,jc2,jc3;

    //frame3 withdrawal
    private JButton btnWithdrawal,btnClear_Withdrawal,btnclose_Withdrawal;
    private JTextField txt_Amount,txt_PIN_Number,txt_withdrawal_date,txt_CardID;
    private JLabel Lbl_Amount,Lbl_PIN_Number,Lbl_withdrawal_date,Lbl_CardID;
    private JComboBox txtwithdrawalDay_date_f3,txtwithdrawalMon_date_f3,txtwithdrawalYear_date_f3;

    ArrayList<BankCard> bankCardArray = new ArrayList<BankCard>();

    /**
     * this is frame1 for debit card.
     **/
    public BankCard_GUI()
    {
        //Create frame 1
        frame1 = new JFrame("Bank card Frame 1");
        title = new JLabel("Debit Card");
        title.setBounds(317,21,117,40);
        frame1.add(title);
        //this is for incresing font size.
        title.setFont(new Font("Courier", Font.BOLD,20));

        l1frame1 = new JLabel("Card ID:");
        l1frame1.setFont(new Font("Courier", Font.BOLD,15));
        l2frame1 = new JLabel("Client name:");
        l2frame1.setFont(new Font("Courier", Font.BOLD,15));
        l3frame1 = new JLabel("Issuer Bank:");
        l3frame1.setFont(new Font("Courier", Font.BOLD,15));
        l4frame1 = new JLabel("Bank Account:");
        l4frame1.setFont(new Font("Courier", Font.BOLD,15));
        l5frame1 = new JLabel("PIN Number:");
        l5frame1.setFont(new Font("Courier", Font.BOLD,15));
        l6frame1 = new JLabel("Balance Amount:");
        l6frame1.setFont(new Font("Courier", Font.BOLD,15));
        L7frame1_expiration_Date = new JLabel("Expiration Date:");
        L7frame1_expiration_Date.setFont(new Font("Courier", Font.BOLD,15));
        //this is for ComboBox.
        jc1_frame1 = new JComboBox();
        //String[] jc1_frame1 = {"01","02"};
        jc1_frame1.addItem("01");
        jc1_frame1.addItem("02");
        jc1_frame1.addItem("03");
        jc1_frame1.addItem("04");
        jc1_frame1.addItem("05");
        jc1_frame1.addItem("06");
        jc1_frame1.addItem("07");
        jc1_frame1.addItem("08");
        jc1_frame1.addItem("09");
        jc1_frame1.addItem("10");
        jc1_frame1.addItem("11");
        jc1_frame1.addItem("12");
        jc1_frame1.addItem("13");
        jc1_frame1.addItem("14");
        jc1_frame1.addItem("15");
        jc1_frame1.addItem("16");
        jc1_frame1.addItem("17");
        jc1_frame1.addItem("18");
        jc1_frame1.addItem("19");
        jc1_frame1.addItem("20");
        jc1_frame1.addItem("21");
        jc1_frame1.addItem("22");
        jc1_frame1.addItem("23");
        jc1_frame1.addItem("24");
        jc1_frame1.addItem("25");
        jc1_frame1.addItem("26");
        jc1_frame1.addItem("27");
        jc1_frame1.addItem("28");
        jc1_frame1.addItem("29");
        jc1_frame1.addItem("30");

        jc2_frame1 = new JComboBox();
        jc2_frame1.addItem("01");
        jc2_frame1.addItem("02");
        jc2_frame1.addItem("03");
        jc2_frame1.addItem("04");
        jc2_frame1.addItem("05");
        jc2_frame1.addItem("06");
        jc2_frame1.addItem("07");
        jc2_frame1.addItem("08");
        jc2_frame1.addItem("09");
        jc2_frame1.addItem("10");
        jc2_frame1.addItem("11");
        jc2_frame1.addItem("12");

        jc3_frame1 = new JComboBox(); 
        jc3_frame1.addItem("2022");
        jc3_frame1.addItem("2023");
        jc3_frame1.addItem("2024");
        jc3_frame1.addItem("2025");

        jc1_frame1.setBounds(530,260,50,30);
        jc2_frame1.setBounds(590,260,50,30);
        jc3_frame1.setBounds(655,260,75,30);

        frame1.add(jc1_frame1);
        frame1.add(jc2_frame1);
        frame1.add(jc3_frame1);

        txt_cardID_f1 = new JTextField();
        txt_clientName_f1 = new JTextField();
        txt_issuerBank_f1 = new JTextField();
        txt_bankAcount_f1 = new JTextField();
        txt_pinNumber_f1 = new JTextField();
        txt_BalanceAmount_f1 = new JTextField();

        l1frame1.setBounds(31,133,110,30);
        l2frame1.setBounds(31,193,110,30);
        l3frame1.setBounds(31,253,110,30);
        l4frame1.setBounds(31,313,110,30);
        l5frame1.setBounds(420,139,110,30);
        l6frame1.setBounds(394,207,150,30);
        L7frame1_expiration_Date.setBounds(398,260,130,30);

        txt_cardID_f1.setBounds(176,133,150,30);
        txt_clientName_f1.setBounds(176,193,150,30);
        txt_issuerBank_f1.setBounds(176,253,150,30);
        txt_bankAcount_f1.setBounds(176,313,150,30);
        txt_pinNumber_f1.setBounds(561,133,150,30);
        txt_BalanceAmount_f1.setBounds(561,204,150,30);

        //Create next and close buttons
        btnMove_To_Credit_Card = new JButton("Move To ﻿Credit Card");
        btnMove_To_Credit_Card.setBackground(Color.RED);
        btnMove_To_Credit_Card.setForeground(Color.WHITE);
        btnMove_To_Credit_Card.setFont(new Font("Courier", Font.BOLD,15));

        close = new JButton("Close");
        close.setFont(new Font("Courier", Font.BOLD,15));
        close.setBackground(Color.RED);
        close.setForeground(Color.WHITE);

        btnWithdrawal_from_Debit_card = new JButton("Withdrawal from Debit card");
        btnWithdrawal_from_Debit_card.setFont(new Font("Courier", Font.BOLD,15));
        btnWithdrawal_from_Debit_card.setBackground(Color.RED);
        btnWithdrawal_from_Debit_card.setForeground(Color.WHITE);

        btnClear = new JButton("Clear");
        btnClear.setFont(new Font("Courier", Font.BOLD,15));
        btnClear.setBackground(Color.RED);
        btnClear.setForeground(Color.WHITE);

        btnDispay = new JButton("Display");
        btnDispay.setFont(new Font("Courier", Font.BOLD,15));
        btnDispay.setBackground(Color.RED);
        btnDispay.setForeground(Color.WHITE);

        btnAddDebitCard_frame1 = new JButton("Add to DebitCard");
        btnAddDebitCard_frame1.setFont(new Font("Courier", Font.BOLD,15));
        btnAddDebitCard_frame1.setBackground(Color.RED);
        btnAddDebitCard_frame1.setForeground(Color.WHITE);

        btnMove_To_Credit_Card.setBounds(511,401,200,40);
        close.setBounds(44,445,120,30);
        btnWithdrawal_from_Debit_card.setBounds(394,320,317,40);
        btnClear.setBounds(186,445,120,30);
        btnDispay.setBounds(116,510,120,30);
        btnAddDebitCard_frame1.setBounds(330,401,170,40);

        //Add the buttons to frame 1
        frame1.add(btnWithdrawal_from_Debit_card);
        frame1.add(btnClear);
        frame1.add(btnDispay);
        frame1.add(btnAddDebitCard_frame1);
        frame1.add(btnMove_To_Credit_Card);
        frame1.add(close);

        frame1.add(l1frame1);
        frame1.add(l2frame1);
        frame1.add(l3frame1);
        frame1.add(l4frame1);
        frame1.add(l5frame1);
        frame1.add(l6frame1);
        frame1.add(L7frame1_expiration_Date);

        frame1.add(txt_cardID_f1);
        frame1.add(txt_clientName_f1);
        frame1.add(txt_issuerBank_f1);
        frame1.add(txt_bankAcount_f1);
        frame1.add(txt_pinNumber_f1);
        frame1.add(txt_BalanceAmount_f1);

        //add button for Debit card.
        btnAddDebitCard_frame1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {

                    try{
                        //Get input values
                        double balance = Double.parseDouble(txt_BalanceAmount_f1.getText());
                        int cardId = Integer.parseInt(txt_cardID_f1.getText());
                        String bankAccount = txt_bankAcount_f1.getText();
                        String issuerBank = txt_issuerBank_f1.getText();
                        String clientName = txt_clientName_f1.getText();
                        int pinNumber = Integer.parseInt(txt_pinNumber_f1.getText());
                        String expirationDate = jc1_frame1.getSelectedItem().toString() + "/" + jc2_frame1.getSelectedItem().toString() + "/" + jc3_frame1.getSelectedItem().toString();
                        // Create new DebitCard object
                        DebitCard newDebitCard = new DebitCard(balance,cardId,clientName,bankAccount,issuerBank,pinNumber);

                        //checking the repations of card ID.
                        for(BankCard card: bankCardArray)
                        {
                            if(card instanceof DebitCard){
                                if(card.getcardId()==(cardId)){
                                    JOptionPane.showMessageDialog(null,"Already exist","message",JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            }
                        }

                        //add newDebitCard to bankcard.
                        bankCardArray.add(newDebitCard);

                        String message = "Card ID: " + cardId + "\n"
                            + "Bank Account: " + bankAccount + "\n"
                            + "Issuer Bank: " + issuerBank + "\n"
                            + "Client Name: " + clientName + "\n"
                            + "Balance: " + balance + "\n"
                            + "Interest Rate: " + pinNumber + "\n"
                            + "Expiration Date: " + expirationDate;

                        JOptionPane.showMessageDialog(frame1,message,"successfully add to DebitCard!",JOptionPane.INFORMATION_MESSAGE);
                    }catch(NumberFormatException e1)
                    {
                        JOptionPane.showMessageDialog(frame1,"Invalied input. please check carefully!","message",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            });

        //display for debit card.
        btnDispay.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) 
                {

                    try{
                        // Get input values
                        double balance = Double.parseDouble(txt_BalanceAmount_f1.getText());
                        int cardId = Integer.parseInt(txt_cardID_f1.getText());
                        String bankAccount = txt_bankAcount_f1.getText();
                        String issuerBank = txt_issuerBank_f1.getText();
                        String clientName = txt_clientName_f1.getText();
                        int pinNumber = Integer.parseInt(txt_pinNumber_f1.getText());
                        String expirationDate = jc1_frame1.getSelectedItem().toString();jc2_frame1.getSelectedItem().toString();jc3_frame1.getSelectedItem().toString();
                        // Create new DebitCard object
                        DebitCard newDebitCard = new DebitCard(balance, cardId, bankAccount, issuerBank, clientName, pinNumber);
                        //add newDebitCard to bankcard.
                        bankCardArray.add(newDebitCard);

                        if(e.getSource()==btnDispay){

                            if(bankCardArray.isEmpty()){
                                JOptionPane.showMessageDialog(null,"Noting to display","Error",JOptionPane.INFORMATION_MESSAGE);

                            }else{
                                for(BankCard card: bankCardArray){
                                    if(card instanceof DebitCard){

                                        BankCard bankCardArray = (DebitCard)card;
                                        if(cardId == bankCardArray.getcardId())
                                        {
                                            bankCardArray.Display();

                                            String message = "Card ID: " + cardId + "\n"
                                                + "Bank Account: " + bankAccount + "\n"
                                                + "Issuer Bank: " + issuerBank + "\n"
                                                + "Client Name: " + clientName + "\n"
                                                + "Balance: " + balance + "\n"
                                                + "Interest Rate: " + pinNumber + "\n"
                                                + "Expiration Date: " + expirationDate;

                                            JOptionPane.showMessageDialog(null,message,"Detialies of Debit card",JOptionPane.INFORMATION_MESSAGE);
                                            return;
                                        }
                                    }
                                }
                            }

                        }
                    }catch(NumberFormatException e1)
                    {
                        JOptionPane.showMessageDialog(frame1,"Invalied input. please fill all the detials!","message",JOptionPane.WARNING_MESSAGE);
                    }

                }
            });

        //Associate ActionListener with the buttons
        btnAddDebitCard_frame1.addActionListener(this);
        btnWithdrawal_from_Debit_card.addActionListener(this);
        btnMove_To_Credit_Card.addActionListener(this);
        close.addActionListener(this);
        btnClear.addActionListener(this);

        //Display frame 1
        frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.setVisible(true);
        frame1.setSize(750,650);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //// frame 3------------------------------------------------------------
        frame3 = new JFrame("withdrawal_frame");

        Lbl_CardID = new JLabel("Card ID:");
        Lbl_CardID.setFont(new Font("Courier", Font.BOLD,15));
        Lbl_Amount = new JLabel("Amount:");
        Lbl_Amount.setFont(new Font("Courier", Font.BOLD,15));
        Lbl_PIN_Number = new JLabel("PIN Number:");
        Lbl_PIN_Number.setFont(new Font("Courier", Font.BOLD,15));
        Lbl_withdrawal_date = new JLabel("withdrawal Date:");
        Lbl_withdrawal_date.setFont(new Font("Courier", Font.BOLD,15));

        Lbl_CardID.setBounds(101,57,90,30);
        Lbl_Amount.setBounds(101,97,90,30);
        Lbl_PIN_Number.setBounds(101,145,95,30);
        Lbl_withdrawal_date.setBounds(101,200,100,30);

        txt_CardID = new JTextField();
        txt_Amount = new JTextField();
        txt_PIN_Number = new JTextField();

        txtwithdrawalDay_date_f3 = new JComboBox();
        txtwithdrawalDay_date_f3.addItem("01");
        txtwithdrawalDay_date_f3.addItem("02");
        txtwithdrawalDay_date_f3.addItem("03");
        txtwithdrawalDay_date_f3.addItem("04");
        txtwithdrawalDay_date_f3.addItem("05");
        txtwithdrawalDay_date_f3.addItem("06");
        txtwithdrawalDay_date_f3.addItem("07");
        txtwithdrawalDay_date_f3.addItem("08");
        txtwithdrawalDay_date_f3.addItem("09");
        txtwithdrawalDay_date_f3.addItem("10");
        txtwithdrawalDay_date_f3.addItem("11");
        txtwithdrawalDay_date_f3.addItem("12");
        txtwithdrawalDay_date_f3.addItem("13");
        txtwithdrawalDay_date_f3.addItem("14");
        txtwithdrawalDay_date_f3.addItem("15");
        txtwithdrawalDay_date_f3.addItem("16");
        txtwithdrawalDay_date_f3.addItem("17");
        txtwithdrawalDay_date_f3.addItem("18");
        txtwithdrawalDay_date_f3.addItem("19");
        txtwithdrawalDay_date_f3.addItem("20");
        txtwithdrawalDay_date_f3.addItem("21");
        txtwithdrawalDay_date_f3.addItem("22");
        txtwithdrawalDay_date_f3.addItem("23");
        txtwithdrawalDay_date_f3.addItem("24");
        txtwithdrawalDay_date_f3.addItem("25");
        txtwithdrawalDay_date_f3.addItem("26");
        txtwithdrawalDay_date_f3.addItem("27");
        txtwithdrawalDay_date_f3.addItem("28");
        txtwithdrawalDay_date_f3.addItem("29");
        txtwithdrawalDay_date_f3.addItem("30");

        txtwithdrawalMon_date_f3 = new JComboBox();
        txtwithdrawalMon_date_f3.addItem("01");
        txtwithdrawalMon_date_f3.addItem("02");
        txtwithdrawalMon_date_f3.addItem("03");
        txtwithdrawalMon_date_f3.addItem("04");
        txtwithdrawalMon_date_f3.addItem("05");
        txtwithdrawalMon_date_f3.addItem("06");
        txtwithdrawalMon_date_f3.addItem("07");
        txtwithdrawalMon_date_f3.addItem("08");
        txtwithdrawalMon_date_f3.addItem("09");

        txtwithdrawalMon_date_f3.addItem("10");
        txtwithdrawalMon_date_f3.addItem("11");
        txtwithdrawalMon_date_f3.addItem("12");

        txtwithdrawalYear_date_f3 = new JComboBox();
        txtwithdrawalYear_date_f3.addItem("2021");
        txtwithdrawalYear_date_f3.addItem("2022");
        txtwithdrawalYear_date_f3.addItem("2023");
        txtwithdrawalYear_date_f3.addItem("2024");
        txtwithdrawalYear_date_f3.addItem("2025");

        txt_CardID.setBounds(212,55,180,30);
        txt_Amount.setBounds(212,95,180,30);
        txt_PIN_Number.setBounds(215,140,180,30);

        txtwithdrawalDay_date_f3.setBounds(215,195,50,30);
        txtwithdrawalMon_date_f3.setBounds(275,195,50,30);
        txtwithdrawalYear_date_f3.setBounds(340,195,80,30);

        frame3.add(Lbl_CardID);
        frame3.add(txt_CardID);
        frame3.add(Lbl_Amount);
        frame3.add(Lbl_PIN_Number);
        frame3.add(Lbl_withdrawal_date);
        frame3.add(txt_Amount);
        frame3.add(txt_PIN_Number);
        frame3.add(txtwithdrawalDay_date_f3);
        frame3.add(txtwithdrawalMon_date_f3);
        frame3.add(txtwithdrawalYear_date_f3);

        btnWithdrawal = new JButton(" Withdrawal");
        btnWithdrawal.setFont(new Font("Courier", Font.BOLD,15));
        btnWithdrawal.setBackground(Color.RED);
        btnWithdrawal.setForeground(Color.WHITE);

        btnClear_Withdrawal = new JButton("Clear");
        btnClear_Withdrawal.setFont(new Font("Courier", Font.BOLD,15));
        btnClear_Withdrawal.setBackground(Color.RED);
        btnClear_Withdrawal.setForeground(Color.WHITE);

        btnclose_Withdrawal = new JButton("Close");
        btnclose_Withdrawal.setFont(new Font("Courier", Font.BOLD,15));
        btnclose_Withdrawal.setBackground(Color.RED);
        btnclose_Withdrawal.setForeground(Color.WHITE);

        btnWithdrawal.setBounds(101,266,298,50);
        btnClear_Withdrawal.setBounds(339,363,120,30);
        btnclose_Withdrawal.setBounds(41,363,120,30);

        frame3.add(btnClear_Withdrawal);
        frame3.add(btnWithdrawal);
        frame3.add(btnclose_Withdrawal);

        //this is for withdrawal amount from debit card.
        btnWithdrawal.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) 
                {
                    try{
                        int cardId = Integer.parseInt(txt_CardID.getText());
                        int withdrawalAmount = Integer.parseInt(txt_Amount.getText());
                        int pinNumber = Integer.parseInt(txt_PIN_Number.getText());
                        String dateOfWithdrawal = txtwithdrawalDay_date_f3.getSelectedItem().toString() +"/" + txtwithdrawalMon_date_f3.getSelectedItem().toString() +"/" + txtwithdrawalYear_date_f3.getSelectedItem().toString();
                        boolean hasWithdrawn = false;

                        for(BankCard card : bankCardArray)
                        {
                            if(card instanceof DebitCard)
                            {
                                DebitCard debitCard = (DebitCard) card;
                                if(debitCard.getpinNumber() == pinNumber)
                                {
                                    BankCard bankCardArray = (DebitCard)card;
                                    if(cardId == bankCardArray.getcardId()){
                                        debitCard.withDraw(withdrawalAmount, dateOfWithdrawal,pinNumber);
                                        hasWithdrawn = true;

                                        String message = "withdrawalAmount: " + withdrawalAmount + "\n" + "dateOfWithdrawal: " + dateOfWithdrawal; 

                                        JOptionPane.showMessageDialog(frame3,message,"Successfully withdrawal.!",JOptionPane.INFORMATION_MESSAGE);
                                        return;
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(frame1,"UnSuccessfully withdrawal.try again!","message",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                        }

                    }catch(NumberFormatException e1)
                    {
                        JOptionPane.showMessageDialog(frame1,"invalid input.!","message",JOptionPane.INFORMATION_MESSAGE);

                    }

                }
            });

        btnWithdrawal.addActionListener(this);
        btnclose_Withdrawal.addActionListener(this);
        btnClear_Withdrawal.addActionListener(this);

        //Display frame 1
        frame3.setLayout(null);
        frame3.setResizable(false);
        frame3.setVisible(false);
        frame3.setSize(500,450);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame2-----------------------------------------------------------------

        //Create frame 2
        frame2 = new JFrame("Credit_Card_GUI");

        title = new JLabel("Credit Card");
        title.setBounds(317,21,117,40);
        frame2.add(title);
        //this is for incresing font size.
        title.setFont(new Font("Courier", Font.BOLD,20));

        l1frame2 = new JLabel("Card ID:");
        l1frame2.setFont(new Font("Courier", Font.BOLD,15));
        l2frame2 = new JLabel("Client name:");
        l2frame2.setFont(new Font("Courier", Font.BOLD,15));
        l3frame2 = new JLabel("Issuer Bank:");
        l3frame2.setFont(new Font("Courier", Font.BOLD,15));
        l4frame2 = new JLabel("Interest Rate:");
        l4frame2.setFont(new Font("Courier", Font.BOLD,15));
        l5frame2 = new JLabel("CVC Number:");
        l5frame2.setFont(new Font("Courier", Font.BOLD,15));
        l6frame2 = new JLabel("Bank Account:");
        l6frame2.setFont(new Font("Courier", Font.BOLD,15));
        l7frame2 = new JLabel("Expiration Date:");
        l7frame2.setFont(new Font("Courier", Font.BOLD,15));
        l9frame2 = new JLabel("Balance amount:");
        l9frame2.setFont(new Font("Courier", Font.BOLD,15));
        jc1 = new JComboBox();
        jc1.addItem("01");
        jc1.addItem("02");
        jc1.addItem("03");
        jc1.addItem("04");
        jc1.addItem("05");
        jc1.addItem("06");
        jc1.addItem("07");
        jc1.addItem("08");
        jc1.addItem("09");
        jc1.addItem("10");
        jc1.addItem("11");
        jc1.addItem("12");
        jc1.addItem("13");
        jc1.addItem("14");
        jc1.addItem("15");
        jc1.addItem("16");
        jc1.addItem("17");
        jc1.addItem("18");
        jc1.addItem("19");
        jc1.addItem("20");
        jc1.addItem("21");
        jc1.addItem("22");
        jc1.addItem("23");
        jc1.addItem("24");
        jc1.addItem("25");
        jc1.addItem("26");
        jc1.addItem("27");
        jc1.addItem("28");
        jc1.addItem("29");
        jc1.addItem("30");

        jc2 = new JComboBox();
        jc2.addItem("01");
        jc2.addItem("02");
        jc2.addItem("03");
        jc2.addItem("04");
        jc2.addItem("05");
        jc2.addItem("06");
        jc2.addItem("07");
        jc2.addItem("08");
        jc2.addItem("09");
        jc2.addItem("10");
        jc2.addItem("11");
        jc2.addItem("12");

        jc3 = new JComboBox(); 
        jc3.addItem("2021");
        jc3.addItem("2022");
        jc3.addItem("2023");
        jc3.addItem("2024");
        jc3.addItem("2025");

        txt_cardID_f2 = new JTextField();
        txt_clientName_f2 = new JTextField();
        txt_issuerBank_f2 = new JTextField();
        txt_intererstRate_f2 = new JTextField();
        txt_cvcNumber_f2 = new JTextField();
        txt_bankAcount_f2 = new JTextField();
        txt_balanceAmount_f2 = new JTextField();

        l1frame2.setBounds(31,133,100,30);
        l2frame2.setBounds(31,193,100,30);
        l3frame2.setBounds(31,253,100,30);
        l4frame2.setBounds(31,313,100,30);
        l5frame2.setBounds(391,133,120,30);
        l6frame2.setBounds(391,193,110,30);
        l7frame2.setBounds(391,313,121,30);
        l9frame2.setBounds(391,253,140,30);

        txt_cardID_f2.setBounds(176,133,150,30);
        txt_clientName_f2.setBounds(176,193,150,30);
        txt_issuerBank_f2.setBounds(176,253,150,30);
        txt_intererstRate_f2.setBounds(176,313,150,30);
        txt_cvcNumber_f2.setBounds(531,133,150,30);
        txt_bankAcount_f2.setBounds(531,193,150,30);
        txt_balanceAmount_f2.setBounds(531,253,150,30);

        jc1.setBounds(512,313,55,30);
        jc2.setBounds(577,313,55,30);
        jc3.setBounds(643,313,72,30);

        frame2.add(l1frame2);
        frame2.add(l2frame2);
        frame2.add(l3frame2);
        frame2.add(l4frame2);
        frame2.add(l5frame2);
        frame2.add(l6frame2);
        frame2.add(l7frame2);
        frame2.add(l9frame2);

        frame2.add(txt_cardID_f2);
        frame2.add(txt_clientName_f2);
        frame2.add(txt_issuerBank_f2);
        frame2.add(txt_intererstRate_f2);
        frame2.add(txt_cvcNumber_f2);
        frame2.add(txt_bankAcount_f2);
        frame2.add(txt_balanceAmount_f2);

        frame2.add(jc1);
        frame2.add(jc2);
        frame2.add(jc3);

        btnClear_frame2 = new JButton("Clear");
        btnClear_frame2.setFont(new Font("Courier", Font.BOLD,15));
        btnClear_frame2.setBackground(Color.RED);
        btnClear_frame2.setForeground(Color.WHITE);

        btnDispay_frame2 = new JButton("Display");
        btnDispay_frame2.setFont(new Font("Courier", Font.BOLD,15));
        btnDispay_frame2.setBackground(Color.RED);
        btnDispay_frame2.setForeground(Color.WHITE);

        close_frame2 = new JButton("Close");
        close_frame2.setFont(new Font("Courier", Font.BOLD,15));
        close_frame2.setBackground(Color.RED);
        close_frame2.setForeground(Color.WHITE);

        btnClear_frame2.setBounds(186,445,120,30);
        btnDispay_frame2.setBounds(116,510,120,30);
        close_frame2.setBounds(44,445,120,30);

        frame2.add(btnClear_frame2);
        frame2.add(btnDispay_frame2);
        frame2.add(close_frame2);

        btnBack_To_Debit_Card = new JButton("Back To Debit Card"); 
        btnBack_To_Debit_Card.setBounds(530,445,200,40);
        btnBack_To_Debit_Card.setFont(new Font("Courier", Font.BOLD,15));
        btnBack_To_Debit_Card.setBackground(Color.RED);
        btnBack_To_Debit_Card.setForeground(Color.WHITE);
        frame2.add(btnBack_To_Debit_Card);

        btnCancleCredit_frame2 = new JButton("Cancle Credit");
        btnCancleCredit_frame2.setBounds(450,510,160,40);
        btnCancleCredit_frame2.setFont(new Font("Courier", Font.BOLD,15));
        btnCancleCredit_frame2.setBackground(Color.RED);
        btnCancleCredit_frame2.setForeground(Color.WHITE);
        frame2.add(btnCancleCredit_frame2);

        btnCancleCredit_frame2.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) 
                {
                    try{
                        int cardId = Integer.parseInt(txt_cardID_f2.getText());
                        boolean found = false;

                        for(BankCard card : bankCardArray)
                        {
                            if(card instanceof CreditCard)
                            {
                                if(card.getcardId() == cardId)
                                {
                                    CreditCard newcreditcard = (CreditCard) card;
                                    newcreditcard.CancelCreditCard();
                                    found = true;
                                    String message = "cardId : "+ cardId + "is cancle seccessfully.";

                                    JOptionPane.showMessageDialog(null,message,"seccessfully cancle credit card.",JOptionPane.WARNING_MESSAGE);
                                    return;
                                }else{
                                    JOptionPane.showMessageDialog(null,"Cancle credit card is unseccessfully.","Error",JOptionPane.WARNING_MESSAGE);

                                }
                            }
                        }
                    }catch(NumberFormatException e1)
                    {
                        JOptionPane.showMessageDialog(null,"canceling credit card is not done..., plz try Again!!!!!.");
                    }
                }
            });

        btnCreditLimit_frame2 = new JButton("Credit Limit");
        btnCreditLimit_frame2.setBounds(560,370,160,40);
        btnCreditLimit_frame2.setFont(new Font("Courier", Font.BOLD,15));
        btnCreditLimit_frame2.setBackground(Color.RED);
        btnCreditLimit_frame2.setForeground(Color.WHITE);
        frame2.add(btnCreditLimit_frame2);

        btnAdd_to_Cradit_Card = new JButton("Add to Cradit Card"); 
        btnAdd_to_Cradit_Card.setBounds(320,445,200,40);
        btnAdd_to_Cradit_Card.setFont(new Font("Courier", Font.BOLD,15));
        btnAdd_to_Cradit_Card.setBackground(Color.RED);
        btnAdd_to_Cradit_Card.setForeground(Color.WHITE);
        frame2.add(btnAdd_to_Cradit_Card);

        // add event listener to the set credit card.
        btnAdd_to_Cradit_Card.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e) 
                {

                    try{// Get input values
                        double balance = Double.parseDouble(txt_balanceAmount_f2.getText());
                        int cardId = Integer.parseInt(txt_cardID_f2.getText());
                        String bankAccount = txt_bankAcount_f2.getText();
                        String issuerBank = txt_issuerBank_f2.getText();
                        String clientName = txt_clientName_f2.getText();
                        double interestRate = Double.parseDouble(txt_intererstRate_f2.getText());
                        int cvcNumber = Integer.parseInt(txt_cvcNumber_f2.getText());
                        String expirationDate = jc1.getSelectedItem().toString() +"/" + jc2.getSelectedItem().toString() +"/" + jc3.getSelectedItem().toString();
                        // Create new CraditCard object
                        CreditCard newCreditCard = new CreditCard(balance, cardId, clientName, bankAccount, issuerBank, cvcNumber, expirationDate, interestRate);

                        //checking the repations of card ID.
                        for(BankCard card: bankCardArray)
                        {
                            if(card instanceof CreditCard){
                                // System.out.println(card.getcardId());
                                if(card.getcardId()==(cardId)){
                                    JOptionPane.showMessageDialog(null,"Already exist","message",JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            }
                        }

                        String message = "balance: " + balance+ "\n" + 
                            "cardId: " + cardId +"\n" + 
                            "clientName: " + clientName + "\n" + 
                            "bankAccount: "+ bankAccount + "\n" +
                            "issuerBank: " + issuerBank + "\n" + 
                            "cvcNumber: " + cvcNumber + "\n" + 
                            "expirationDate" + expirationDate + "\n" +
                            "interestRate: " +interestRate;

                        // Add newCraditCard to Bankcard array list
                        bankCardArray.add(newCreditCard);

                        JOptionPane.showMessageDialog(frame2,message,"successfully add to credit card!",JOptionPane.INFORMATION_MESSAGE);

                    }catch(NumberFormatException e1)
                    {
                        JOptionPane.showMessageDialog(frame2,"invalid input, Please check carefully!","message",JOptionPane.WARNING_MESSAGE);
                    }
                }
            });

        //display detiles of credit card.
        btnDispay_frame2.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e)
                {
                    // ArrayList<BankCard> bankCard = new ArrayList<BankCard>();
                    try{
                        // Get input values
                        double balance = Double.parseDouble(txt_balanceAmount_f2.getText());
                        int cardId = Integer.parseInt(txt_cardID_f2.getText());
                        String bankAccount = txt_bankAcount_f2.getText();
                        String issuerBank = txt_issuerBank_f2.getText();
                        String clientName = txt_clientName_f2.getText();
                        //int pinNumber = Integer.parseInt(txt_pinNumber_f2.getText());
                        double interestRate = Double.parseDouble(txt_intererstRate_f2.getText());
                        int cvcNumber = Integer.parseInt(txt_cvcNumber_f2.getText());
                        String expirationDate = jc1.getSelectedItem().toString() +"/" + jc2.getSelectedItem().toString()+"/" + jc3.getSelectedItem().toString();
                        // Create new CraditCard object
                        CreditCard newCreditCard = new CreditCard(balance, cardId, clientName, bankAccount, issuerBank, cvcNumber, expirationDate, interestRate);
                        // Add newCraditCard to Bankcard array list
                        bankCardArray.add(newCreditCard);

                        if(e.getSource()==btnDispay_frame2){

                            if(bankCardArray.isEmpty()){
                                JOptionPane.showMessageDialog(null,"Noting to display","Message",JOptionPane.INFORMATION_MESSAGE);

                            }else{
                                for(BankCard card: bankCardArray){
                                    if(card instanceof CreditCard){
                                        // Create message with details of credit card
                                        String message = "Card ID: " + cardId + "\n"
                                            + "Bank Account: " + bankAccount + "\n"
                                            + "Issuer Bank: " + issuerBank + "\n"
                                            + "Client Name: " + clientName + "\n"
                                            + "Balance: " + balance + "\n"
                                            + "Interest Rate: " + interestRate + "\n"
                                            + "CVC Number: " + cvcNumber + "\n"
                                            + "Expiration Date: " + expirationDate;

                                        CreditCard creditcard = (CreditCard)card;
                                        creditcard.display();

                                        JOptionPane.showMessageDialog(null,message,"Credit of Cradit Card!",JOptionPane.INFORMATION_MESSAGE);

                                        return;
                                    }
                                }
                            }

                        }

                    }catch(NumberFormatException e1)
                    {
                        JOptionPane.showMessageDialog(frame2,"Invalied input. please fill all the detials!","message",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            });

        //Associate ActionListener with the buttons
        btnBack_To_Debit_Card.addActionListener(this);
        close_frame2.addActionListener(this);
        btnClear_frame2.addActionListener(this);
        btnDispay_frame2.addActionListener(this);
        btnAdd_to_Cradit_Card.addActionListener(this);
        btnCreditLimit_frame2.addActionListener(this);
        btnCancleCredit_frame2.addActionListener(this);

        //Display frame 2
        frame2.setLayout(null);
        frame2.setResizable(false);
        frame2.setVisible(false);
        frame2.setSize(750,650);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //farme4-----------------------------------------------------------------
        frame4 = new JFrame("Credit_Limit_GUI");

        Lbl_CardId = new JLabel("Card ID:");
        Lbl_Credit_Limit = new JLabel("Credit Limit:");
        Lbl_Grace_period = new JLabel("Grace period:");

        Lbl_CardId.setBounds(103,60,95,30);
        Lbl_Credit_Limit.setBounds(103,118,95,30);
        Lbl_Grace_period.setBounds(103,173,95,30);

        txt_CardId_CL = new JTextField();
        txt_Credit_Limit = new JTextField();
        txt_Grace_period = new JTextField();

        txt_CardId_CL.setBounds(217,60,180,30);
        txt_Credit_Limit.setBounds(217,113,180,30);
        txt_Grace_period.setBounds(217,168,180,30);

        frame4.add(Lbl_CardId);
        frame4.add(Lbl_Credit_Limit);
        frame4.add(Lbl_Grace_period);
        frame4.add(txt_Credit_Limit);
        frame4.add(txt_Grace_period);
        frame4.add(txt_CardId_CL);

        btnSet_Credit_Limit = new JButton("set");
        btnSet_Credit_Limit.setFont(new Font("Courier", Font.BOLD,15));
        btnSet_Credit_Limit.setBackground(Color.RED);
        btnSet_Credit_Limit.setForeground(Color.WHITE);

        // add event listener to the "Set Credit Limit" button
        btnSet_Credit_Limit.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) 
                {
                    try{
                        int cardID = Integer.parseInt(txt_CardId_CL.getText());
                        double creditLimit = Double.parseDouble(txt_Credit_Limit.getText());
                        int gracePeriod = Integer.parseInt(txt_Grace_period.getText()); 
                        boolean cardFound = false;

                        // check if all fields are filled
                        if (txt_CardId_CL.getText().isEmpty() || txt_Credit_Limit.getText().isEmpty() || txt_Grace_period.getText().isEmpty()) 
                        {
                            JOptionPane.showMessageDialog(null, "Please enter all information.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            for(BankCard bank : bankCardArray)
                            {

                                //CreditCard banks = (CreditCard)bank;
                                if (bank instanceof CreditCard ) 
                                {
                                    if(bank.getcardId()== cardID){

                                        CreditCard creditCard = (CreditCard) bank;
                                        creditCard.setcreditLimit(creditLimit,gracePeriod);
                                        cardFound = true;
                                        String CLmessage = "cardID: " + cardID +"\n" + "creditLimit: " + creditLimit + "\n" + "gracePeriod: " + gracePeriod;

                                        JOptionPane.showMessageDialog(frame4,CLmessage,"Credit limit set successfully",JOptionPane.INFORMATION_MESSAGE);
                                        return;

                                    } else {
                                        JOptionPane.showMessageDialog(frame4, "Invalid card ID.", "Error", JOptionPane.ERROR_MESSAGE);

                                    }
                                }

                            }
                        }
                    }catch(NumberFormatException e1)
                    {
                        JOptionPane.showMessageDialog(frame4, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        btnClear_Credit_Limit = new JButton("Clear");
        btnClear_Credit_Limit.setFont(new 
            Font("Courier", Font.BOLD,15));
        btnClear_Credit_Limit.setBackground(Color.RED);
        btnClear_Credit_Limit.setForeground(Color.WHITE);

        btnclose_Credit_Limit = new JButton("Close");
        btnclose_Credit_Limit.setFont(new 
            Font("Courier", Font.BOLD,15));
        btnclose_Credit_Limit.setBackground(Color.RED);
        btnclose_Credit_Limit.setForeground(Color.WHITE);

        btnSet_Credit_Limit.setBounds(101,239,298,50);
        btnClear_Credit_Limit.setBounds(339,363,120,30);
        btnclose_Credit_Limit.setBounds(41,363,120,30);

        frame4.add(btnSet_Credit_Limit);
        frame4.add(btnClear_Credit_Limit);
        frame4.add(btnclose_Credit_Limit);

        btnSet_Credit_Limit.addActionListener(this);
        btnclose_Credit_Limit.addActionListener(this);
        btnClear_Credit_Limit.addActionListener(this);

        //Display frame 1
        frame4.setLayout(null);
        frame4.setResizable(false);
        frame4.setVisible(false);
        frame4.setSize(500,450);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    //Function to perform actions related to button clicked
    public void actionPerformed(ActionEvent e)
    {
        //frame1
        if(e.getSource()==btnMove_To_Credit_Card)
        {
            //calling the frame2 
            frame2.setVisible(true);
            frame1.setVisible(false);
        }
        //frame1
        if(e.getSource()==close)
        {
            frame1.setVisible(false);
        }
        //frame1
        if(e.getSource()==btnClear)
        {
            txt_cardID_f1.setText(""); 
            txt_clientName_f1.setText("");
            txt_issuerBank_f1.setText("");
            txt_bankAcount_f1.setText("");
            txt_pinNumber_f1.setText("");
            txt_BalanceAmount_f1.setText("");
        }
        //frame1
        if(e.getSource()==btnWithdrawal_from_Debit_card)
        {
            //calling to frame3(withdrawal_frame)
            frame3.setVisible(true);//frame3 set to visible.
        }

        //frame2
        if(e.getSource()==btnBack_To_Debit_Card)
        {
            frame2.setVisible(false);
            frame1.setVisible(true);
        }
        //frame2
        if(e.getSource()==close_frame2)
        {
            frame2.setVisible(false);
            frame1.setVisible(true);
        }
        //frame2 clear all data.
        if(e.getSource()==btnClear_frame2)
        {
            txt_cardID_f2.setText("");
            txt_clientName_f2.setText("");
            txt_issuerBank_f2.setText("");
            txt_intererstRate_f2.setText("");
            txt_cvcNumber_f2.setText("");
            txt_bankAcount_f2.setText("");
        }
        // frame3
        if(e.getSource()==btnclose_Withdrawal)
        {
            frame3.setVisible(false);
            frame1.setVisible(true);
        }
        //frame3 
        if(e.getSource()==btnClear_Withdrawal)
        {
            txt_Amount.setText("");
            txt_PIN_Number.setText("");
            //txt_withdrawal_date.setText("");
        }

        // frame4
        if(e.getSource()==btnCreditLimit_frame2)
        {
            //Credit_Limit();
            frame4.setVisible(true);//frame4 set to visible.
        }
        if(e.getSource()==btnclose_Credit_Limit)
        {
            frame4.setVisible(false);
            frame2.setVisible(true);
        }
        //frame4
        if(e.getSource()==btnClear_Credit_Limit)
        {
            txt_Credit_Limit.setText("");
            txt_Grace_period.setText("");
        }
    }
    public static void main(String []args){
        new BankCard_GUI();
    }
}
import java.util.Scanner;

public class Account{
 public String accountName, accountTypes;
    public float accountBalance, depositAmount, withdrawalAmount;
    public int accountNum;
 
/* public Account(String accountName, String accountTypes,float accountBalnce, float depositAmount, float withdrawalAmount){
  this.
 }*/
    Scanner input= new Scanner(System.in);
    public void deposit(){
     
     System.out.print("Enter deposit amount:");
     depositAmount= input.nextFloat();
     accountBalance+=depositAmount;
     System.out.print("Deposit successful!");
    }
 
 public void withdraw(){
System.out.println("Enter withdrawal amount:");
  withdrawalAmount= input.nextFloat();
  if(withdrawalAmount<=accountBalance){
  accountBalance-=withdrawalAmount;
  System.out.println("Withdrawal successful!");
  }
   else {
    System.out.println("Not enough account balance!");
   }
 }
  
 public float checkBalance(){
  System.out.println("Account balance:");
  return accountBalance;
 }
   
    
}

//We have agreed that the Account class will display the accountBalance of all the three accounts and each account will have it's own accounting.

class Current extends Account{
 
 public float currentAccBal, depositAmountC, withdrawalAmountC, receiverAccBal, amountSent,overDraft;
 
 public float checkBalance(){
  System.out.println("Account balance:");
  return accountBalance;
 };
 
 public void depositC(){
  System.out.print("Enter deposit amount:");
     depositAmountC= input.nextFloat();
     currentAccBal+=depositAmountC;
     System.out.print("Deposit successful!");
  
    }
 
  public void withdrawC(){
System.out.println("Enter withdrawal amount:");
  withdrawalAmountC= input.nextFloat();
  if(withdrawalAmountC<=currentAccBal){
   currentAccBal-=withdrawalAmountC;
 System.out.println("Withdrawal successful!");
  }
   else if(withdrawalAmountC>currentAccBal&&withdrawalAmountC<=50000){
    overDraft= currentAccBal-withdrawalAmountC;
    currentAccBal-=withdrawalAmountC;
 System.out.println("Withdrawal successful! ");
     System.out.println("An overdraft of" +overDraft");
   }
   else {
    System.out.println("Not enough account balance!");
   }
 }
 
 public float checkBalanceC(){
  System.out.println("Account balance:");
  return currentAccBal;
 }
 
 public float sendMoneyC(){
  System.out.println("Enter account number to send money to :");
  receiverAccBal= input.nextFloat();
  System.out.println("Enter amount of money to send:");
  amountSent=input.nextFloat();
  currentAccBal-=amountSent;
  System.out.println("Amount sent successfully!");
   
 }
  
 }
 
}



//Account class:(public) String accountName, accountTypes;float accountBalance, depositAmount, withdrawalAmount;int accountNum;
//Current class:(public)  float currentAccBal, depositAmountC, withdrawalAmountC, receiverAccBal, amountSent,overDraft;
//Savings class: (public) float savingsInterest,time,savingsAccBal,savingsDeposit,savingsWithdrawalAmount;
//Fixed Deposit class (public) String accountName, accountTypes;    (public) float accountBalance, depositAmount, withdrawalAmount; (public) int accountNum;

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

class Savings extends Account{
 public float savingsInterest,time,savingsAccBal,savingsDeposit,savingsWithdrawalAmount;
 
  public void deposit(){
     
     System.out.print("Enter deposit amount:");
     savingsDeposit= input.nextFloat();
    savingsAccBal+=savingsDeposit;
     System.out.print("Deposit successful!");
    }
 
 public void savingsInterest(){
   System.out.print("Enter the time period in months you lastly made a deposit:");
  time=input.nextFloat();
  savingsInterest= 0.015*savingsAccBal*time;
   savingsAccBal+=savingsInterest;
 }
 
 public void withdraw(){
System.out.println("Enter withdrawal amount:");
  savingsWithdrawalAmount= input.nextFloat();
  
  if(savingsWithdrawalAmount<=savingsAccBal){
  savingsAccBal-=savingsWithdrawalAmount;
  System.out.println("Withdrawal successful!");
  }
   else {
    System.out.println("Not enough account balance!");
   }
 }
 
}
                        
                    
class FixedDeposit{
 public int interestPlans;
 public float totalInterest, fixedAccBal,fixedDepositAmount, withdrawalAmountFD;
 
  public void deposit(){
     
     System.out.print("Enter deposit amount:");
     depositAmount= input.nextFloat();
     fixedAccBal+=fixedDepositAmount;
     System.out.print("Deposit successful!");
 
}
 
 public void interestPlans(){
  System.out.println("Choose the savings period that suits you from the list below.The time period is in years.");
  System.out.println("1 \n 2 \n 3 \n 4 \n 5");
  interestPlans=input.nextInt();
  totalInterest=0.14*interestPlans*fixedAccBal;
  System.out.println("The total interest at the expiry of your plan is:" +totalInterest);
  fixedAccBal+=totalInterest;
 }
 
public void withdraw(){
 if(withdrawalAmountFD<=fixedAccBal){
  fixedAccBal-= withdrawalAmountFD;
  System.out.println("Withdrawal successful!");
 }
 else {
  System.out.println("Account balance too low");  
}
 
}


import java.util.Scanner;

public class Main { //class concept
 public static void main(String[]args){
  Scanner myObj=new Scanner(System.in);//object
  int num1,num2,num3,num4;
  System.out.println("Welcome to your main account! We are delighted to have you.");
   System.out.println("Your account balance is zero.Please deposit some money.");
  Account account= new Account();//object
  account.deposit();
    System.out.println("Please choose the type of account that you want to access.\n press 1 for a current account.\n 2 For a Savings account\n 3 For a Fixed Deposit Account\n4 To withdraw money from your main account");
  num1=myObj.nextInt();
  switch(num1){
   case 1:
  Current current=new Current();//object
  current.deposit();
   System.out.println("Press 1 to check balance\n 2 to send money\n 3 to withdraw");
  num2=myObj.nextInt();
  switch(num2){
   case 1:
    current.checkBalanceC();
    break;
   case 2:
    current.sendMoneyC();
    break;
   case 3:
    current.withdrawC();
    break;
   default:
  }
    break;
  
   case 2:
    Savings savings=new Savings();//object
    savings.deposit();
    savings.savingsInterest();
    System.out.println("To withdraw press 1. To quit, press 2.");
    num3=myObj.nextInt();
    switch(num3){
     case 1:
      savings.withdraw();
      break;
     case 2:
      account.checkBalance();
      break;
     default:
    }
    break;
    
   case 3:
    FixedDeposit fixed=new FixedDeposit();//object
    fixed.deposit();
    fixed.interestPlans();
    System.out.println("To withdraw from this account press 1. To quit, press2");
    num4=myObj.nextInt();
    switch(num4){
     case 1:
      fixed.withdraw();
      break;
     case 2:
      account.checkBalance();
      break;
     default:
    }
    break;
    
   case 4:
    account.withdraw();
    break;
   default:
    }
  System.out.println("Thankyou for choosing us. We appreciate you.");
 }
}

class Account{
 public String accountName, accountTypes;//attributes
    public float accountBalance, depositAmount, withdrawalAmount;//attributes
    public int accountNum;//attribute
 
    Scanner input= new Scanner(System.in);//object
 
    public void deposit(){//method
     
     System.out.print("Enter deposit amount:");
     depositAmount= input.nextFloat();
     accountBalance+=depositAmount;
     System.out.print("Deposit successful!");
    }
 
 public void withdraw(){//method
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
  
 public float checkBalance(){//method
  System.out.println("Account balance:");
  return accountBalance;
 }
   
    
}


class Current extends Account{ //inheritance
 Scanner input= new Scanner(System.in);//object
 
 public float currentAccBal, depositAmountC, withdrawalAmountC, receiverAccBal, amountSent,overDraft;//attributes
 
 public float checkBalance(){//method
  System.out.println("Account balance:");
  return accountBalance;
 };
 
 public void deposit(){//method OVERRIDING
  System.out.print("Enter deposit amount:");
     depositAmountC= input.nextFloat();
     currentAccBal+=depositAmountC;
     System.out.print("Deposit successful!");
  
    }
 
  public void withdrawC(){//method
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
     System.out.println("An overdraft of" +overDraft);
   }
   else {
    System.out.println("Not enough account balance!");
   }
 }
 
 public float checkBalanceC(){//method
  System.out.println("Account balance:");
  return currentAccBal;
 }
 
 public void sendMoneyC(){//method
  System.out.println("Enter account number to send money to :");
  receiverAccBal= input.nextFloat();
  System.out.println("Enter amount of money to send:");
  amountSent=input.nextFloat();
  currentAccBal-=amountSent;
  System.out.println("Amount sent successfully!");
   
 }
  
 }
 


class Savings extends Account{ //inheritance
 Scanner input= new Scanner(System.in);//object
 public float savingsInterest,time,savingsAccBal,savingsDeposit,savingsWithdrawalAmount;//attributes
 
  public void deposit(){//method
     
     System.out.print("Enter deposit amount:");
     savingsDeposit= input.nextFloat();
    savingsAccBal+=savingsDeposit;
     System.out.print("Deposit successful!");
    }
 
 public void savingsInterest(){//method
   System.out.print("Enter the time period in months after which you might withdraw your money:");
  time=input.nextFloat();
  savingsInterest= (float)0.015*savingsAccBal*time;
   savingsAccBal+=savingsInterest;
   System.out.println("Your total amount plus interest will be:" +savingsAccBal);
 }
 
 public void withdraw(){//method.
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
                        
                    
class FixedDeposit extends Account { //inheritance
 Scanner input= new Scanner(System.in);//object
 public int interestPlans;//attribute
 public float totalInterest, fixedAccBal,fixedDepositAmount, withdrawalAmountFD;//attribute
 
  public void deposit(){//method
     
     System.out.print("Enter deposit amount:");
     fixedDepositAmount= input.nextFloat();
     fixedAccBal+=fixedDepositAmount;
     System.out.print("Deposit successful!");
 
}
 
 public void interestPlans(){//method
  System.out.println("Choose the savings period that suits you from the list below.The time period is in years.");
  System.out.println("1 \n 2 \n 3 \n 4 \n 5");
  interestPlans=input.nextInt();
  totalInterest=(float)0.14*interestPlans*fixedAccBal;
  System.out.println("The total interest at the expiry of your plan is:" +totalInterest);
  fixedAccBal+=totalInterest;
 }
 
public void withdraw(){//method
 if(withdrawalAmountFD<=fixedAccBal){
  fixedAccBal-= withdrawalAmountFD;
  System.out.println("Withdrawal successful!");
 }
 else {
  System.out.println("Account balance too low");  
}
}
}

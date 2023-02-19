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

class Current extends Account{
 
}

import java.util.Scanner;
import java.time.*;
import java.lang.Math;

public class Account{
    static float accountBalance, depositAmount, withdrawal;
    
    
    
    static void deposit(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter deposit amount:");
        depositAmount= myObj.nextFloat();
        accountBalance += depositAmount;
        System.out.println("Deposit successful \\n Account balance:" + accountBalance);
    }
    
    static void withdraw(){
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        withdrawal = myObj1.nextFloat();
        accountBalance -= withdrawal;
        System.out.println("Withdrawal successful \\n Account balance:" + accountBalance);
        
    }
    
    
}
    
 class fixedDeposit extends Account{
     
     static float time, interest, num;
     
     static void interest (){
         Scanner myObj2 = new Scanner(System.in);
        System.out.println("Please enter the time period that you wish to leave your money in here for. \\n If you wish to enter this number in months, please press 1. \\n If you wish to enter it in years, press 2");
         num= myObj2.nextFloat();
         if(num==1){
             System.out.println("Please enter the number of months:");
             time=myObj2.nextFloat();
             interest=(float)Math.pow((accountBalance*1.08),(time/12));
             
         }
         else if(num==2){
             System.out.println("Enter the number of years:");
             time=myObj2.nextFloat();
             interest= (float) Math.pow((accountBalance*1.08),time);
         }
         else{
             System.out.println("Invalid Input!");
             interest();
         }
     }
 }

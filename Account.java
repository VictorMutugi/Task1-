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

package java_oops_exception_test2;

import java.util.Scanner;

/***
 * Bank Account Encapsulation
 * Create a BankAccount class with private balance field. Implement deposit(), withdraw(), and getBalance() methods with proper validation.
 *
 * Examples:
 * Input:
 * Initial balance: 1000, deposit: 500, withdraw: 200
 * Output:
 * Balance after deposit: 1500.0 Balance after withdrawal: 1300.0
 */
public class Challenge4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter amount you have in account: ");
        Double amount=scan.nextDouble();
        BankAccount bank1=new BankAccount(amount);
        System.out.println("Please enter the amount you want to get..");
        Double amount2=scan.nextDouble();
        bank1.withdraw(amount2);
        bank1.getBalanceNow();
    }
}

class BankAccount{
    private Double Balance;

    public BankAccount(Double balance) {
        Balance = balance;
    }

    public Double getBalance() {
        return Balance;
    }
    public void setBalance(Double Balance){
        this.Balance=Balance;
    }

    public void deposit(Double amount){
        if(amount>0){
        setBalance(getBalance()+amount);}
        else{
            System.out.println("Please enter valid amount...");
        }
    }
    public void withdraw(Double amount){
        if(getBalance()>amount){
            setBalance(getBalance()-amount);
            System.out.println(amount+" is deducted from your account");
        }else{
            System.out.println("You don't have sufficient amount in your account..");
        }
    }

    public void getBalanceNow(){
        System.out.println("Your Current amount is: "+getBalance());
    }


}

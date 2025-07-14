package bankApplication;

public class ATM extends Customer1 {
    public ATM(int account_num, String name, int Balance, long Contact_number){
        super(account_num,name,Balance,Contact_number);
    }

    public void deposite(double amount){
        setBalance(getBalance()+amount, true);
        System.out.println("Amount added to your account: "+ amount);
    }

    public void deposite(double amount, String note){
        setBalance(getBalance()+amount, true);
        System.out.println("Amount added to your account: "+ amount +" | Note: "+note);
    }

    public void withdraw(double amount){
        if(super.getBalance()>amount){
            System.out.println("Here is your money: "+amount );
            super.setBalance(super.getBalance()-amount,true);
        }else{

            System.out.println("You don't have enough money in your account..");
        }
    }


}

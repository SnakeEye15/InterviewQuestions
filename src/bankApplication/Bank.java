package bankApplication;
/***
 * "Develop a Java application for a Bank Management System where customers can open savings accounts, check balances, and perform basic operations like deposits and withdrawals. The system should demonstrate OOP concepts such as classes, objects, inheritance, encapsulation, polymorphism, method overloading, method overriding, and use of this and super keywords."
 */
public class Bank {
    private int Account_number;
    private String Customer_name;

     public Bank(){
        Account_number=1001;
        Customer_name="Aman";
    }

    public Bank(int Account_number, String Customer_name){
        this.Account_number=Account_number;
        this.Customer_name= Customer_name;
    }

    public int getAccount_number() {
        return Account_number;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setAccount_number(int account_number) {
        Account_number = account_number;
    }

    public void setCustomer_name(String customer_name) {
        Customer_name = customer_name;
    }

    public void showDetails(){
        System.out.println("-------//-----");
        System.out.println("Account Number: " + Account_number);
        System.out.println("Customer Name: " + Customer_name);
    }

}

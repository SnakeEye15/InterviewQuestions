package bankApplication;

public class Customer1 extends Bank{
    private double Balance;
    private long Contact_number;

    public Customer1(){
        super();
        Balance=10000;
        Contact_number=9890912747l;
    }
    public Customer1(int Account_number, String Customer_name,double Balance, long Contact_number){
        super(Account_number,Customer_name);
        this.Contact_number=Contact_number;
        this.Balance=Balance;
    }

    public void setBalance(double Balance,boolean isCashier){
        if(isCashier){
            this.Balance=Balance;
        }else{
            System.out.println("Your don't have permission to do this..");
        }
    }
    public double getBalance() {
        return Balance;
    }

    public long getContact_number() {
        return Contact_number;
    }

    public void setContact_number(long contact_number) {
        Contact_number = contact_number;
    }

    public void getDetails(){
        System.out.println("-------//-----");
        super.showDetails(); // super call
        System.out.println("Balance: " + Balance);
        System.out.println("Contact Number: " + Contact_number);
    }

}

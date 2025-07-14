package practice2;

/***Description: Abstract class Bank with abstract method getInterestRate(). Classes SBI and HDFC implement it.
 *
 */
abstract class bank {
    void getInterestRate(){}
}

class SBI extends bank{
    @Override
    void getInterestRate() {
        System.out.println("Interest rate in SBI is: 6.5%");
    }
}

class HDFC extends bank{
    @Override
    void getInterestRate() {
        System.out.println("Interest rate in HDFC is: 7.0%");
    }
}



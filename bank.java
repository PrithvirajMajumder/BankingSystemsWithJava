public class bank{
    String bankName;
    int AccountNo=0;
    String AccountHolder;

    public bank(String bankName, int accountNo, String accountHolder) {
        this.bankName = bankName;
        AccountNo = accountNo;
        AccountHolder = accountHolder;
    }

    public void getAccountNo() {
        AccountNo++;
    }

    public void getAccountHolder() {
        System.out.println("Your Name is : " + AccountHolder);
    }

    public void getBankName() {
        System.out.println("Your Bank is : " + bankName);
    }

}
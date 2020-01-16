public class account{
    int AccountNo;
    String AccountHolder;
    double AccountBalance;
    String BankName;

    public int getAccountNo(String AccountHolder)
    {
        return AccountNo;
    }

	public String getAccountHolder() {
		return AccountHolder;
    }
    
	public double getAccountBalance() {
		return AccountBalance;
	}

	public String getBankName() {
		return BankName;
	}

    public account(int accountNo, String accountHolder, double accountBalance, String bankName) {
        AccountNo = accountNo;
        AccountHolder = accountHolder;
        AccountBalance = accountBalance;
        BankName = bankName;
    }
}
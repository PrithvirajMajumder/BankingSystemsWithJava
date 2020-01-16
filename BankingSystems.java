import java.util.Scanner;
public class BankingSystems{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String holderName, bankName;
        int accountNo;
        System.out.println("Enter your name : ");
        holderName = input.next();
        System.out.println("Enter your Bank Name : ");
        bankName = input.next();
        System.out.println("Enter your Account Number : ");
        accountNo = input.nextInt();
        bank obj = new bank(bankName, accountNo, holderName);
        obj.getBankName();
        obj.getAccountNo();
        obj.getAccountHolder();
    }
}
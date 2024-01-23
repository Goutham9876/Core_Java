package abstract;

public class Account {
    static int accountNumber = 12233;

    public static int getAccountNumber(){
        return accountNumber;
    }

    public static void main(String[] args) {
        System.out.println(getAccountNumber());
    }
}

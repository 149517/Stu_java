package Exercise;

public class AccountTest {
    public static void main(String[] args){
        CheckAccount account = new CheckAccount(1122,20000,0.045,10000);
        CheckAccount acc = new CheckAccount(1223,5000,00.45);
        System.out.println(account.getMonthlylnterest());
        account.deposit(3000);
        account.withdraw(30000);
    }
}

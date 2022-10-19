package exer;

public class AccountTest {
    public static void main(String[] args){
        Account acct1 = new Account();
        Account acct2 = new Account("query",2000);

        System.out.println(acct1);
        System.out.println(acct2);
    }
}

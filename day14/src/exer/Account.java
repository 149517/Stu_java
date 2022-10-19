package exer;

public class Account {

    private int id;
    private String pwd;
    private double balance;

    private static double interestRate;
    private static double minMoney = 1.0;
    private static int init = 1000;     // 用于自动生成id

    // 构造器
    public Account() {
        id = init++;
    }

    public Account(String pwd, double balance) {
        id = init++;
        this.pwd = pwd;
        this.balance = balance;
    }

    // get & set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}

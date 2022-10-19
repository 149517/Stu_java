package Exercise;

public class Account {
    private int id;
    private double balance;
    private double annuallnteresRate;


    public Account(int id, double balance, double annuallnteresRate){
        this.id = id;
        this.balance = balance;
        this.annuallnteresRate = annuallnteresRate;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnteresRate() {
        return annuallnteresRate;
    }

    public void setAnnuallnteresRate(double annuallnteresRate) {
        this.annuallnteresRate = annuallnteresRate;
    }

    // 月利率方法
    public double getMonthlylnterest(){
        return annuallnteresRate / 12;
    }
    // 取款方式
    public void withdraw(double amount){
        System.out.println("取款金额为："+amount+"元");
        if(balance >= amount){
            System.out.println("取款成功");
            System.out.println("账户余额为："+(balance - amount)+"元");
        }
        else{
            System.out.println("账户余额不足");
        }

    }
    // 存款方法
    public void deposit(double amount){
        this.balance = this.balance + amount;
        System.out.println("账户余额为："+balance+"元");
    }

}


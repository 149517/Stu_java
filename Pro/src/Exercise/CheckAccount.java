package Exercise;

public class CheckAccount extends Account {
    private double overdraft = 5000;

    public CheckAccount(int id,double balance,double annuallnteresRate){
        super(id,balance,annuallnteresRate);
    }
    public CheckAccount(int id, double balance, double annuallnteresRate, double overdraft) {
        super(id, balance, annuallnteresRate);
        this.overdraft = overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (super.getBalance() > amount) {
            System.out.println("可以直接取款");
            System.out.println("账户余额为" + (getBalance() - amount));
        } else {
            System.out.println("余额不足，使用透支额度...");

            if ((super.getBalance() + overdraft) > amount) {
                setOverdraft(super.getBalance() + overdraft - amount);
                setBalance(0);
                System.out.println("取款成功");
                System.out.println("账户余额为 " + getBalance());
                System.out.println("透支额度为 " + getOverdraft());

            } else {
                System.out.println("取款失败，余额不足");
            }
        }
    }
}

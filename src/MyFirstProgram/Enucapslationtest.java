package MyFirstProgram;

class Account {
    private double balance;
    void setBalance(double balance)
    {
        if(balance>100)
        {
            this.balance=balance;
        }
    }
    double getBalance()
    {
        return balance;
    }
}
public class Enucapslationtest
{
    public static void main(String[]args)
    {
        Account a=new Account();
        a.setBalance(292);
        System.out.println(a.getBalance());
    }
}

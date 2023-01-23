class Bank
{
    static int balance = 100000;
    synchronized static void withdrawl(int wd)
    {
        if(balance>wd)
        {
            balance = balance-wd;
            System.out.println("Withdrawl amount is "+wd);
            System.out.println("Balance after withdrawl "+balance);
        }
        else
        {
            System.out.println("Insufficient Balance ");
        }
    }
    synchronized static void deposits(int ds)
    {
        if(balance>0)
        {
            balance = balance+ds;
            System.out.println("deposited amount is "+ds);
            System.out.println("Balance after deposit "+balance);
        }
        else
        {
            System.out.println("Negative amount can't be deposit ");
        }
    }
}
class Withdraw implements Runnable
{
    public void run()
    {
        Bank.withdrawl(2000);
    }
}
class Deposit implements Runnable
{
    public void run()
    {
        Bank.deposits(6000);
    }
}
public class Banking
{
    public static void main(String[] args)
    {
        Withdraw w = new Withdraw();
        Deposit d = new Deposit();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
    }
}

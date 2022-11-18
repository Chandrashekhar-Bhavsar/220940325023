class temp extends Exception
{
    temp(String str)
    {
        super(str);
    }
}
class BankAccount{
    int AccNo;
    double Bal;
    BankAccount(int a, double b)
    {
        this.AccNo=a;
        this.Bal=b;
    }
    void Withdraw(double c)throws temp
    {
        if (Bal < c)
        {
            throw new temp("Balance is low");
        }
        else {
            Bal = Bal - c;
            System.out.println("After withdrawl balance is " + Bal);
        }
    }
    void Deposite(int a)
    {
        Bal=Bal+a;
        System.out.println("After deposite Your new balance is "+Bal);
    }
    void Show()
    {
        System.out.println("Your account number is "+AccNo+" And your balance is "+Bal);
    }
}
public class Q2 {
    public static void main(String[] args) {
        BankAccount b= new BankAccount(121,5000);
        b.Show();
        b.Deposite(1000);
        try
        {
            b.Withdraw(7000);
        }
        catch(temp e)
        {
            System.out.println("Execption handles by ctch ");
            System.out.println(e);

        }
    }
}

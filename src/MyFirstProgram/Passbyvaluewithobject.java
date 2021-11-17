package MyFirstProgram;

class Test
{
    String Testname;
    int balance;
    Test(String Testname,int balance)
    {
        this.Testname=Testname;
        this.balance=balance;
    }
    void display()
    {
        System.out.println("Test Name"+Testname);
        System.out.println("Balance"+balance);
    }

}
public class Passbyvaluewithobject {

    public static void main(String[]args)
    {
        Test t=new Test("Bank test",20301);

System.out.println(" "+t.Testname+" "+t.balance);
updatescsore(t);
System.out.println(" "+t.Testname+" "+t.balance);

    }
    static void updatescsore(Test te)
    {
        te.balance=30311;
    }




}


package MyFirstProgram;

public class EnhanceForloop {
    public static void main(String args[]) {
        int[] a1 = {1, 3, 4, 51, 2};
        int[] arr2;
        arr2 = new int[]{1, 5, 6, 7};
        int sum=0;
        for (int x : a1) {
            System.out.println(x);
            sum+=x;
        }
        System.out.println(sum);
    }
}
//we cant use enhance for loop for reverse order
//mainly index related things are not appropriate  for each loop 18.00
//42,46
class Studentintancevariable
{
    //instance variable
    String name;
    int id;
    float cgpa;
    void study(int hours)
    {
        System.out.println(name+" is studying for "+hours+" hours and her cgpa is "+cgpa+" and her id is "+id);
    }
}
class maine
{
    public static void main(String args[]) {
        Studentintancevariable st1 = new Studentintancevariable();
        st1.name ="Unknown";
        st1.cgpa=3.89f;
        st1.id=30011;
        st1.study(2);
        Studentintancevariable st2=new Studentintancevariable();
        st2.name="unkkkk";
        st2.cgpa=3.75f;
        st2.id=20302020;
        st2.study(4);
    }
}
class Bankk
{
    String name;
    int balance=4000;
    void withdraw(int amount)
    {
        if (amount<balance)
        {
        balance-=amount;
        System.out.println("current"+balance);
        }
        else
        {
System.out.println("insufficient Balance");
        }
    }
    void deposit(int Dmoney)
    {
        balance+=Dmoney;
System.out.println("Name "+name+" New Balance"+balance);
    }
}
class Mainf
{
    public static void main(String[]args) {
        Bankk st1 = new Bankk();
        st1.name = "Srabon";
        st1.balance = 10000;

        st1.withdraw(4000);
        st1.deposit(3000);//deposit
    }
}

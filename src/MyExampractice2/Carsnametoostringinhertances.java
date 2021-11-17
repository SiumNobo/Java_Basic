package MyExampractice2;
class Bmw
{
    Bmw(int year)
    {
System.out.println("Created: "+year);
    }
    Bmw(String Modelname)
    {
        System.out.println("P#444232"+Modelname);
    }
}
class Nobooo extends Bmw
{
    Nobooo(String Name)
    {
super("BDX");
System.out.println(""+Name);
    }
    Nobooo(int K)
    {
        super(2021);
        System.out.println(" "+K);
    }
}

public class Carsnametoostringinhertances {
    public static void main(String[]args)
    {
Bmw c=new Bmw(2019);
Bmw c1=new Bmw("CDasa");
c.toString();
c1.toString();
    }
}

package MyExampractice2;

class Mrsbird
{
    public Mrsbird(String name)
    {
System.out.println(name);
    }
    public Mrsbird()
    {
System.out.println("this is new year");
    }
    public Mrsbird(int a)
    {
System.out.println(a);
    }
}
class MiChildern extends Mrsbird
{
    void Fna()
    {

        System.out.println("lakskask");
    }
}
public class Polymarphism {
    public static void main(String[]args)
    {
        MiChildern c=new MiChildern();
        c.Fna();
    }
}

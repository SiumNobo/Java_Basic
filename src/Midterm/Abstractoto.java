package Midterm;

abstract class Dogs
{
    void Fna(String name)
    {
        System.out.println(name);
    }
    public abstract void good(String k);
}
 class Chita extends Dogs
{

    @Override
    public void good(String k) {

    }
}

public class Abstractoto extends Dogs {

    @Override
    public void good(String k) {
        System.out.println(k);
    }
    public static void main(String[]args)
    {
        Abstractoto s=new Abstractoto();
        s.good("Humm");
        s.Fna("haa");
    }
}

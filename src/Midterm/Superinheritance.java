package Midterm;

class Honda
{
    String name;
    private int pa;
    void setPa(int pa)
    {
        this.pa=pa;
    }
    public Honda(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }
    void Fna()
    {
        System.out.println(pa);
    }
}
class Toyota extends Honda
{
    String name;
    public Toyota(String name)
    {
        super("name");
        System.out.println(name);
        super.Fna();

    }

    void Fna(int n)
    {
        if(n>10)
        {
            System.out.println(n);
        }
    }
}
public class Superinheritance {
    public static void main(String[]args)
    {
        Toyota t=new Toyota("Gari");
        t.Fna(100);
        t.setPa(90);
        t.Fna();
    }
}

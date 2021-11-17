package MyExampractice2;

class Baba
{
    private int a;
    void Fna()
    {
        System.out.println("Age of father"+a);
    }
    void setA(int a)
    {
        this.a=a;
    }
}
class Chele extends Baba
{
    int a;
    int b;
    public Chele(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

}
public class Inheritanceday2 {

}

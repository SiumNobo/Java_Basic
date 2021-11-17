package MyExampractice2;


class Parentsss
{
    String name;
    void Massage()
    {
        System.out.println("sium Muntasir");
    }
}
class Childss extends Parentsss{
    String name;
    public Childss(String a,String b)
    {
        this.name=a;
        super.name=b;
        System.out.println(super.name);
        System.out.println(name);
    }
}
public class Fahimsirinheritancesslide {
    public static void main(String[]args)
    {
        Childss s1=new Childss("Rauf","Nobo");
        s1.Massage();
    }
}

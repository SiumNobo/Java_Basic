package MyExampractice2;

class Parents {
    private int pa;
    int pb;
    void Fna()
    {
        System.out.println("The age of Parant"+pa);

    }
    void setPa(int pa)
    {
        this.pa=pa;
    }
}
class Childs extends Parents
{
    void Fna()
    {
        int pa=20;
        System.out.println("the age of sium muntasir"+pa);
        super.Fna();
    }
}
public class Mainsuperparentinheritance
{
    public static void main(String[]args)
    {
        Childs c1=new Childs();
        c1.setPa(40);
        c1.Fna();
        //if i print from this main method what should i do then?

    }
}

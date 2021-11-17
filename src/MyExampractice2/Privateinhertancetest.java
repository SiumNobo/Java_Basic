package MyExampractice2;

class PParent
{
    private int pa;
    void fnA()
    {
        System.out.println(pa);
    }
    void setPa(int pa)
    {
        this.pa=pa;
    }
}
class Childd extends PParent
{

}
public class Privateinhertancetest {
    public static void main(String[] args) {

        Childd c1=new Childd();
        c1.fnA();
        c1.setPa(80);
        c1.fnA();


    }

}

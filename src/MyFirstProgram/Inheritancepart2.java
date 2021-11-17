package MyFirstProgram;

class Parents
{
    private int pb;
    public int pa;
    void seta(int pb)
    {
        this.pb=pb;
    }
    void k()
    {
        System.out.println("Hlw");
    }
}
class Childs extends Parents {

    public int pa;
    void  png() {
k();
super.pa=50;

System.out.println("C"+pa);

System.out.println(super.pa);



    }
}
public class Inheritancepart2 {
    public static void main(String[]args)
    {
        Childs p=new Childs();
        p.pa=5000;
        p.seta(100);
        p.png();
    }
}

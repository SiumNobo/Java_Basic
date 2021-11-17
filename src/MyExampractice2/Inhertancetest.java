package MyExampractice2;

class Parent
{
    int a;
    void fna()
    {
        System.out.println(a);
    }

}
class Child extends Parent
{

}


public class Inhertancetest {
    public static void main(String[]args)
    {
        Child c1=new Child();
        c1.a=5;
        c1.fna();


    }


}

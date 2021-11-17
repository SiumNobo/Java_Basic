package MyExampractice2;
class A
{
    A()
    {
        System.out.println("The Bike is created");
    }
}
class B extends A
{
    B()
    {
        System.out.println("The honda is created");
    }
}
class C extends B
{
    C()
    {

        System.out.println("The jealousy has created");
    }
}
public class Extendabc {
    public static void main(String[]args)
    {
        C c=new C();
        c.toString();
    }

}

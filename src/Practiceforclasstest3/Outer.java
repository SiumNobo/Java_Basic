package Practiceforclasstest3;

public class Outer{
    static int data=30;
    static class StaticInner
    {
void msg()
{
    System.out.println(data);
}
static void innermsg(String msg)
{
    System.out.println(msg);
}
    }
    public static void main(String[]args)
    {
        Outer.StaticInner obj=new Outer.StaticInner();
        obj.msg();
        Outer.StaticInner.innermsg("Hello!");

    }
}

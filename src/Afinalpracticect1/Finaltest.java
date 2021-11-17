package Afinalpracticect1;
class Student1
{
    final static int a=8;
    void Fnc()
    {
        System.out.println("asas"+a);
    }
}
public class Finaltest {
    public static void main(String[]args)
    {
        Student1 c=new Student1();
        c.Fnc();

        System.out.println(Student1.a);
    }
}

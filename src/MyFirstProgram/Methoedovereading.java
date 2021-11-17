package MyFirstProgram;

class Overloaddemo{
    void test()
    {
        System.out.println("No parameters");
    }
    void test(int a)
    {
        System.out.println("a:"+a);
    }
    double test(double a) {
        System.out.println("double a:" + a);
return a*a;
    }
}

public class Methoedovereading {
    public static void main(String[]args)
    {
        Overloaddemo s=new Overloaddemo();
        s.test();
        s.test(90);
        double test =s.test(10.00);
        System.out.println(test);
    }
}

package MyFirstProgram;
class Parent
        {
          int pa;
          int pb;
          void fpa()
          {
              System.out.println("Hlw");
          }
        }

        class Child extends Parent
        {
            void fpb()
            {
                fpa();
                System.out.println(pa);
                System.out.println(pb);
            }



        }
public class BasicInhertance {
    public static void main(String[]args)
    {
        Child p=new Child();
        p.pa=50;
        p.pb=30;
        p.fpb();
        System.out.println(p.pa+" "+p.pb);
    }
}

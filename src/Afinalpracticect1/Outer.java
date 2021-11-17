package Afinalpracticect1;

public class Outer {
    private String text="Sium Muntasir";

    class inner
    {
        private String text="Text Message";
        void print()
        {
            System.out.println(text);
        }
    }
    public static void main(String[]args)
    {
        Outer obj=new Outer();
        Outer.inner obk=obj.new inner();
        obk.print();
    }
}

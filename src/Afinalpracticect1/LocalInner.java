package Afinalpracticect1;

public class LocalInner {
    private int data=20;
    void Display()
    {
        int Value=20;
        class Local
        {
            void msg()
            {
                System.out.println("Value"+data);
            }
        }
        Local lc=new Local();
        lc.msg();
    }
    public static void main(String[]args)
    {
        LocalInner lc=new LocalInner();
        lc.Display();
    }

}

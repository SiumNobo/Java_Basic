package Afinalpracticect1;

class StaticInner {
    static int data=30;
    static class inner
    {
        void msg()
        {
            System.out.println("Data is:"+data);
        }
        static void msg(String msg)
        {
System.out.println(msg);
        }
    }
    public static void main(String[]args)
    {
        StaticInner.inner obj=new StaticInner.inner();
        obj.msg();
        StaticInner.inner.msg("Sium Muntasir");
    }
}

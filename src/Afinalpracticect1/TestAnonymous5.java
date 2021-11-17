package Afinalpracticect1;
interface MyInterface{
    void doIt();
}

public class TestAnonymous5{
    public static void main(String[]args)
    {
        MyInterface ref=new MyInterface() {
            @Override
            public void doIt() {
                  System.out.println("Sium Muntasir");
            }
        };
        ref.doIt();
    }
}

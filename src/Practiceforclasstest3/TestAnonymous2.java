package Practiceforclasstest3;
interface MyInferce
{
    void doIT();
}

public class TestAnonymous2 {
    public static void main(String[]args)
    {
        MyInferce inferce=new MyInferce() {
            @Override
            public void doIT() {
               System.out.println("Super Miya");
            }
        };
        inferce.doIT();
    }
}

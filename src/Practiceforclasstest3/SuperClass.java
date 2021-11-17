package Practiceforclasstest3;

class SuperClass {
    public void doIt()
    {
        System.out.println("Super class doIt()");
    }

}
class TestAnonymous
{
    public static void main(String[]args)
    {
        SuperClass intance=new SuperClass() {
            public void doIT() {
                System.out.println("Sium Muntasir");
            }
        };
        intance.doIt();
    }
}


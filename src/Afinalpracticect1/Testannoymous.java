package Afinalpracticect1;

class SuperClass
{
    public void doIt()
    {
        System.out.println("Super class doIt();");
    }
}
class ChildClass extends SuperClass
{
public void dOIt()
{
    System.out.println("Child class DoIt");
}
}

class Testannoymous {
    public static void main(String[]args)
    {
        SuperClass obj=new SuperClass()
        {
            public void doIt()
            {
                System.out.println("Annoymous();");
            }

        };
        obj.doIt();
        System.out.println(obj.getClass().getName());
    }

}
//create childclass which is annoymous;
//crate and object of that particular class;
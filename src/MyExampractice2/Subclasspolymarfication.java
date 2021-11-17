package MyExampractice2;

class Mainparents
{
    String name;
    String age;
    void displayinformation()
    {
        System.out.println(" "+name);
        System.out.println(" "+age);
    }
}
class Teacher extends Mainparents
{
    public String Qualification;

    @Override
            void displayinformation()
    {
System.out.println(" "+name);
System.out.println(" "+age);
System.out.println(" "+Qualification);
    }
}
public class Subclasspolymarfication  {
    public static void main(String[]args)
    {
        Mainparents st1=new Mainparents();
        st1.name="Alex zender";
        st1.age="28";
        st1.displayinformation();
        Mainparents st2=new Teacher();
        st2.age="28";
        st2.name="HuruhuruBnador";
        st2.displayinformation();
    }
}

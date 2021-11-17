package Amidexam;

class Father
{
    String name;
    String Surname;
    void Display()
    {
        System.out.println(name);
        System.out.println(Surname);
    }

}
class Mother extends Father
{
    String hname="Sium Muntasir";
    @Override
void Display()
{
    System.out.println(name);
    System.out.println(Surname);
    System.out.println(hname);
}
void fly()
{
    System.out.println("I am flying");

}
}

public class Subclasspolimarficasion {
    public static void main(String[]args)
    {
        Father c=new Father();
        c.name="MR Abdur rauf";
        c.Surname="Mazi";
        c.Display();
        Father c1=new Mother();
        c1.name="Mrs Ferdoushi Begum";
        c1.Surname="Mazoiii";
        //casting;
        String name = ((Mother) c1).hname;
        if(c1 instanceof Father)//for safe casting
        ((Mother) c1).fly();





        c1.Display();
    }
}

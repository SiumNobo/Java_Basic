package PreparationForFinalExam;
class Student1
{
    int id;
    static String name="Sium Muntasir";
    void fnc()
    {
        System.out.println(name);
    }
    static void Fna()
    {
        name="Sium Muntasir Nobo";
    }
}
public class Staticmethod {
    public static void main(String[]args)
    {
        Student1 c=new Student1();
        Student1 c1=new Student1();
        c.id=1020202;
        c1.id=101012012;
        System.out.println(Student1.name);
        Student1.Fna();
        double d1=27;
        double d2=Math.sqrt(d1);
        Student1.name="Sium Muntasir Nobo Brother of Al-Amin Faisal";

        System.out.println(Student1.name);
        System.out.println(d2);
    }
}

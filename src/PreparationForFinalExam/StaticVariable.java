package PreparationForFinalExam;
class Student
{
    int a=5;
    static String university = "United International University";
   static void fnc() {
        university ="UIU gives short time in exam which is not good for a student";
    }

}
public class StaticVariable {
    public static void main(String[]args)
    {
        Student c=new Student();
        c.a=10;
        System.out.println(c.a);
        c.a=15;
        System.out.println(c.a);
        System.out.println(Student.university);
        Student.fnc();
        System.out.println(Student.university);
        System.out.println();

    }
}

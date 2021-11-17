package Midterm;

public class Perametertest {
    public static void main(String[]args)
    {
        Student s1=new Student("Sium","28",2019);
        Student s2=new Student("Nobo","30",2020);
        s1.Fna();
        s2.Fna();
        test(s1,s2);
        s1.Fna();
        s2.Fna();
    }

    static void test(Student t1,Student t2)
    {
        String temp=t1.age;
        t1.age=t2.age;
        t2.age=temp;
    }
}
class Student
{
    String name;
    String age;
    int passingyear;
    public Student(String name,String age,int passingyear)
    {
        this.name=name;
        this.age=age;
        this.passingyear=passingyear;
    }
    void Fna()
    {
        System.out.println(name+" "+age+" "+passingyear);
    }

}
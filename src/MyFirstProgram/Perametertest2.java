package MyFirstProgram;

public class Perametertest2 {
    public static void main(String[] args) {
        Studenttt s1 = new Studenttt("Rahim", 1921992);
        Studenttt st2 = new Studenttt("karim", 2332022);
        test(s1,st2);
        System.out.println(s1.id);
        System.out.println(st2.id);
    }


    static void test(Studenttt t1, Studenttt t2) {
int temp=t1.id;
t1.id=t2.id;
t2.id=temp;

    }
}
class Studenttt
{
    public String name;
    public int id;
    public Studenttt(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

}
class Perametertest3 {
    public static void main(String[] args) {
        Student5 st1=new Student5("p",318,4);
        Student5 st2=new Student5("N",362,4);
        test(st1,st2);
        System.out.println(st1.id);
        System.out.println(st2.id);


    }

    static void test(Student5 t1,Student5 t2)
    {
int temp=t1.id;
t1.id=t2.id;
t2.id=temp;
    }
}
class Student5
{
public String name;
public int id;
public int cgpa;
public Student5(String name,int id,int cgpa)
{
    this.name=name;
    this.id=id;
    this.cgpa=cgpa;
}
}
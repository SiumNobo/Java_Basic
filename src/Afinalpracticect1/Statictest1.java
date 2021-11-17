package Afinalpracticect1;
class Student {
    static int n = 100;
    static String name = "United International University";

   static void fnc() {
        name = "Better University";

    }
}


public class Statictest1 {
    public static void main(String[]args)
    {
        System.out.println(Student.n);
        Student.fnc();
        System.out.println(Student.name);
        System.out.println(Student.name);

    }
}

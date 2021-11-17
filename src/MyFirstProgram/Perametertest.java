package MyFirstProgram;

public class Perametertest {
    public static void main(String[] args) {


        Studentt stu1 = new Studentt("Sakib", 500, 3.61);
        Studentt stu2 = new Studentt("Hasan", 350, 3.65);
        test2(stu1,stu2);
        System.out.println(stu1.id);
        System.out.println(stu2.id);
    }


    static void test2(Studentt s1, Studentt s2){
        int temp = s1.id;
        s1.id = s2.id;
        s2.id = temp;
    }



}

class Studentt {
    // instance variables
    String name;
    int id;
    double cgpa;

    Studentt(String name, int id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

}


package Midterm;

public class Objectivearray {
    String name;
    int age;
    int passingyear;
    public Objectivearray(String name,int age,int passingyear)
    {
        this.name=name;
        this.age=age;
        this.passingyear=passingyear;
    }
    void Fna()
    {
        System.out.println(name+" "+age+" "+passingyear);
    }
    public static void main(String[]args)
    {
        Objectivearray[]c1=new Objectivearray[4];
        c1[0]=new Objectivearray("Sium",30,2020);
        c1[1]=new Objectivearray("Nobo",24,2019);
        c1[0].Fna();
        c1[1].Fna();
    }

}

package Midterm;

import MyFirstProgram.Constructor;

public class Contructor {
    String Name;
    int age;
    String Sound;
    public Contructor(String name,int age,String Sound)
    {
        this.Name=name;
        this.age=age;
        this.Sound=Sound;
    }
    void Fna()
    {
        System.out.println(Name+ "age "+age+"The kitty is"+Sound);

    }

}
class Kittymain
{
public static void main(String[]args)
{
    Contructor c=new Contructor("kakskas",30,"Gew Gew");
    c.Name="Catty";
    c.age=30;
    c.Sound="Mew MEw";
    c.Fna();
}
}

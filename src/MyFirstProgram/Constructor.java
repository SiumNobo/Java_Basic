package MyFirstProgram;

import java.util.Random;

public class Constructor {
    public String name;
    public String ID;
    public double balance;
    String __$$__;


    public Constructor() {

        ID = new Random().nextInt(999999) + "";

    }

    public Constructor(String name, String ID, Double balance) {

        this.name=name;
        this.ID=ID;
        this.balance=balance;
    }
    public static void main(String[]args)
    {
        Constructor ba=new Constructor("Rashid","01101020",10000.0);
        Constructor bb=new Constructor("Karim","010120120",199991.0);
        Constructor bc=new Constructor();
        bc.ID="3121212";
        System.out.println("name "+ba.name+"\nID "+ba.ID+"\nbalance "+ba.balance);
        System.out.println("ID "+bc.ID);
    }
}
class Cat
{
    String name;
    String color;
    void makesound()
    {
        System.out.println(name+"is meowing");
    }
}
class Main
{
    public static void main(String[]args) {
        Cat st1 = new Cat();
        st1.name = "kitty";
        st1.color = "gray";
        st1.makesound();
    }
}
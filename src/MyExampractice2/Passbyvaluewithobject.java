package MyExampractice2;

public class Passbyvaluewithobject {
    public static void main(String[]args) {
        Cat c1 = new Cat("Lamu", "small", "Funny");
        Cat c2 = new Cat("Dipu", "Long", "Super Funny");
        c1.Display();
c2.Display();
        swap(c1,c2);
        c1.Display();
       c2.Display();

    }
    static void swap(Cat s,Cat k)
    {
        String name=s.name;
        s.name=k.name;
        k.name=name;

    }

}
class Cat
{
    public String name;
    public String size;
    public String attitu;
    public Cat(String x,String z,String a)
    {
        this.name=x;
        this.size=z;
        this.attitu=a;

    }
    void Display()
    {
        System.out.println(size);
        System.out.println(name);
        System.out.println(attitu);

    }
}

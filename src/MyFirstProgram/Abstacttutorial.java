package MyFirstProgram;
abstract class Dog{
String name;
    public void bark()
    {
System.out.println("Gew Gew");
    }
    public void Good()
    {
        System.out.println("Good");

    }
    public abstract void Bad();
    abstract void setName(String name);

}

class Hola extends Dog {


    @Override

    public void Bad() {

        System.out.println("OShovonacharon");
    }

    @Override
    void setName(String name) {
        this.name=name;
        System.out.println(name);
    }
}
public class Abstacttutorial {
public static void main(String[]args)
{
Hola c=new Hola();

c.bark();
c.Good();
c.Bad();
c.setName("Rafio");

}

}

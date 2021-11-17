package Amidexam;

interface Flyer
{
    String name="Crow";
    public abstract void Flyer();
}
interface Canwork
{
    public abstract void Work();
}
class Bird implements Flyer,Canwork
{

String name="koalw";

    @Override
    public void Flyer() {
        System.out.println("Bird can Fly "+Flyer.name);
    }

    @Override
    public void Work() {
        System.out.println("People can work"+name);

    }
}
public class InterfaceMorethanone {
    public static void main(String[] args) {

    Flyer c=new Bird();
    c.Flyer();
    Canwork d=new Bird();
    d.Work();
    }
}
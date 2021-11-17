package MyFirstProgram;
interface Waterbottleface{
    String name="Blue";
    void fillup();
    void pourout();


}
public class Interfacefromyoutube implements Waterbottleface{
    public static void main(String[]args)
    {
        System.out.println(name);
        Interfacefromyoutube ex=new Interfacefromyoutube();
        ex.fillup();
        ex.pourout();
    }

    @Override
    public void fillup() {
        System.out.println("The jealously");

    }

    @Override
    public void pourout() {
        System.out.println("The Arrogance");

    }
}

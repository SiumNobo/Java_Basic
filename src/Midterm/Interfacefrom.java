package Midterm;
interface Occan
{
    String name="Blue";
void fillup();
void Fishup();

}

public class Interfacefrom implements Occan {
    public static void main(String[]args) {
        System.out.println(name);
        Interfacefrom s = new Interfacefrom();
        s.fillup();
        s.Fishup();
    }


    @Override
    public void fillup() {
System.out.println("the ocean is blue");
    }

    @Override
    public void Fishup() {
System.out.println("The ocean has full of fish");
    }
}

package MyFirstProgram;
class Honda
{
    Honda(String name)
    {
        System.out.println("Car is created "+name);
    }
}
class Toyota extends Honda
{
    Toyota(String name)
    {

        super("Allion A15");
        System.out.println("Car is created "+name);
    }
}
public class Superwithperameterinhertance {

    public static void main(String[]args)
    {

        Toyota st1=new Toyota("CVR");

    }
}

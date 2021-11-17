package MyExampractice2;
class vericale
{
    vericale()
    {
        System.out.println("amr Baba Bike Chalay nh");
    }
}
class Bike extends vericale
{
    Bike()
    {
        //super should be the first statement of your constructor
        super();
        System.out.println("bike is created");
    }
}
public class inhertancewithconstructor {
   public static void main(String[]args)
    {
        Bike b=new Bike();
    }
}

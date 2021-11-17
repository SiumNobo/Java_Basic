package Afinalpracticect1;

public class HeroHuman {
 int Energylevel;
 public HeroHuman(int a)
 {
     Energylevel=a;
 }
 public void testengery()throws HeroHumanException
 {
     if(Energylevel<50)
     {
         throw new HeroHumanException(50);
     }
 }
public static void main(String[]args)
{
    HeroHuman c=new HeroHuman(40);
    try
    {
        c.testengery();
    }
    catch (HeroHumanException e)
    {
        e.printStackTrace();
    }
}
}
class HeroHumanException extends Exception
{
public HeroHumanException()
{
    super();
}

    public HeroHumanException(int Energylevel)
    {
        super("eta kno"+Energylevel);
    }
}
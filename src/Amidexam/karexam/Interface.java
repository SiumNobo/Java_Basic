package Amidexam.karexam;
interface Box
{
    public static final String media="Sky";

    public abstract void fly();
    public abstract boolean fuel();
    }

    class Aero implements Box
    {

        @Override
        public void fly() {
            System.out.println("Plane can Fly in the "+Box.media);
        }

        @Override
        public boolean fuel() {
            return false;
        }
    }
    class Bi implements Box
    {
        @Override
        public void fly()
        {
            System.out.println("Plane Can Fly in the "+Box.media);
        }
        @Override
        public boolean fuel()
        {
            return true;
        }
    }
public class Interface {
    public static void main(String[]args)
    {
        Bi c=new Bi();
        c.fly();
        c.fuel();
        Aero b=new Aero();
        b.fly();
        b.fuel();
    }
}

package Amidexam;
abstract class Animald
{
    String name;
    public Animald(String name)
    {
        this.name=name;

    }
   public void Animalname()
    {
        System.out.println("name"+name);
    }
    public abstract void AnimalSound();
}
class Birds extends Animald {
    public Birds() {
        super("Cuckoo");
        name = "Cuckooi";
    }


        @Override
        public void AnimalSound () {
        System.out.println("Crip");
    }
}
class Lion extends Animald
{
    public Lion()
    {
        super("Lion");
        name="Lionee";
    }

    @Override
    public void AnimalSound() {
     System.out.println("Halum");
    }
}
public class Abstract {

    public static void main(String[]args)
    {
        Animald c=new Birds();
        Animald d=new Lion();
        c.Animalname();
        c.AnimalSound();
        d.Animalname();
        d.AnimalSound();
    }

        }

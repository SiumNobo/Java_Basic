package Amidexam;
class Parents
{
    void Fna()
    {
System.out.println("Sium");
    }
}

class Child extends Parents
{
    void Fna()
    {
        super.Fna();
        System.out.println("Nobo");
    }
}

public class Overiddingmetheod {
    public static void main(String[]args)
    {
        Parents c=new Parents();
        c.Fna();
        Child d=new Child();
        d.Fna();
    }
}

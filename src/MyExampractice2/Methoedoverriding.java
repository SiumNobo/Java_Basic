package MyExampractice2;
class papa
{
    public void display()
    {
        System.out.println("The name is Nobo");
    }
}
class Baccha extends papa
{
    public void display()
    {
        System.out.println("This is you");
    }
}

public class Methoedoverriding {
    public static void main(String[]args)
    {
        papa p=new papa();
        p.display();
        Baccha s=new Baccha();
        s.display();
    }
}

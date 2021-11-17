package MyExampractice2;
class Goru {
    void Fna() {
        System.out.println("This is tumi");
    }

}
class Gorurbaccha extends Goru{
    void Fna()
    {
        super.Fna();
        System.out.println("I mean tumi");
    }
}
public class Polymarphismwithoverreading {
    public static void main(String[]args)
    {
        Gorurbaccha st1=new Gorurbaccha();
        st1.Fna();
    }
}

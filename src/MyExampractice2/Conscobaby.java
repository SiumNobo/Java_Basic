package MyExampractice2;

public class Conscobaby {
    String Name;
    String ID;
    int number;
    public Conscobaby(String Name,String id,int number)
    {
        this.Name=Name;
        this.ID=id;
        this.number=number;
    }
    public static void main(String[]args)
    {
        Conscobaby st1=new Conscobaby("Tahmid","01010121212",1101010102);
        st1.Name="Shagoto";
        st1.Display();


    }
    void Display()
    {
        System.out.println(""+Name);
        System.out.println(""+ID);
    }

}

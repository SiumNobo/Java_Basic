package MyFirstProgram;
class Bankers
{
    String name;
    int bankerid;
    float slaray;
    void withdraw(int wamount)
    {
        if(slaray>wamount)
        {
            slaray-=wamount;
        }
        else
        {
            System.out.println("insufficient amount");
        }
    }
    void deposit(int ammount)
    {
        slaray+=ammount;
        System.out.println(slaray);
    }

        }
public class IntancevariableBasic {
    public static void main(String[]args)
    {
        Bankers st1=new Bankers();
        st1.name="Rahim";
        st1.bankerid=203011;
        st1.slaray=20000;
        st1.withdraw(3000);
        st1.deposit(4000);
    }
}

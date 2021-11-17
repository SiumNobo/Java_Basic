package Amidexam;
class judge {
    public Double Judgee1;
    public Double Judgee2;
    public Double Judgee3;

    private double n;
    public judge(Double judgee1, Double judgee2, Double judgee3)
    {
        this.Judgee1=judgee1;
        this.Judgee2=judgee2;
        this.Judgee3=judgee3;
    }

    void setN(double judgee1, double judgee2, double judgee3) {
        if (n <= 1 && n >= 10) {
            n =(judgee1+judgee2+judgee3);
        }
    }

    double getN(double judgee1, double judgee2, double judgee3) {
return judgee1+judgee2+judgee3;
    }



}
class Team extends judge
{


    public Team(Double judgee1, Double judgee2, Double judgee3) {
        super(judgee1, judgee2, judgee3);
    }
int n1,n2;
    double team1()
    {
        super.setN(1.02,1.6,1.1);
        super.getN(1.02,1.6,1.1);
        System.out.println(super.getN(1.02,1.6,1.1));
        return getN(1.02,1.6,1.1);
    }
    double team2()
    {
        super.setN(2.13,1.44,1.23);
        super.getN(2.13,1.44,1.23);
        return getN(2.13,1.44,1.23);
    }

}
public class Judge {
    public static void main(String[]args)
    {
        Team c=new Team(1.2,1.1,1.23);
        if(c.team1()> c.team2())
        {
            System.out.println("Team 1 is Winner");

        }
        else
        {
            System.out.println("Team 2 is Winner");
        }

    }
}

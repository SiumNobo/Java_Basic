package Midterm;
class Input
{
    private int n;
    void setN(int n)
    {
        if(n>0&&n<4)
        {
            this.n=n;

        }
    }
    int getN()
    {
        return n;
    }
}
public class Encapslation {
    public static void main(String[]args)
    {
        Input c=new Input();
        c.setN(3);
        System.out.println(c.getN());
    }
}

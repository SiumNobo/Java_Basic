package MyFirstProgram;
class A{
   private int n;
    void setN(int K)
    {
        if(K>0&&K<4)
        {
            this.n=K;
        }
    }

    public int getN() {
        return n;
    }
}

public class Encapsluation {
public static void main(String[]args)
{
    A c=new A();
    c.setN(1);
    System.out.println(c.getN());
}

}

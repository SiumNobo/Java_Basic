package Afinalpracticect1;

public class StackMethoed {
    public static void main(String[]args)
    {
       Testsqure(-1);
    }

        public static void Testsqure(int k)
        {
        try {
            System.out.println(callsqure(k));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
public static int squre(int a)throws Exception
    {
        if(a<0)
            throw new Exception("Can not be less than 0");
        return a*a;
    }
    public static int callsqure(int a)throws Exception
    {
        return squre(a);
    }
}

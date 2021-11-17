package PreparationForFinalExam;

public class ExceptionTest6 {
    public static void main(String[]args)
        {
            testsqrt(-1);
        }
    public static void testsqrt(int s)
    {
        try
        {
            System.out.println(callsqr(s));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static int sqr(int a)throws Exception
    {
        if(a<0)
            throw new Exception("Can't be less than 0");
        return a*a;
    }
    public static int callsqr(int a) throws Exception
    {
        int ret=sqr(a);
        System.out.println("Will it print it?");
        return ret;
    }
}

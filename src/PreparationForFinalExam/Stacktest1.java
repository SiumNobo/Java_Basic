package PreparationForFinalExam;


public class Stacktest1 {




}
class TeststackExpection
{
    public static void main(String[]args)
    {
        testSqrt(-1);
    }

    public static void testSqrt(int s) {

        try{
            System.out.println(callsqr(s));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static int sqr(int a) throws Exception
    {
        if(a<0)


        throw new Exception("Can't be less than 0");
        return a*a;
    }
public static int callsqr(int a) throws Exception
{
    return sqr(a);
}
}
package PreparationForFinalExam;

public class Exceptionthrows {
    public static void main(String[]args)
    {
        TestTException ex=new TestTException();
        try {
            ex.throwException();
        }
        catch (Exception e)
        {
System.out.println("Input something valid");
        }
    }
}
class TestTException
{
    public void throwException() throws Exception
    {
        throw new Exception();
    }
    public void throwSystemException() throws InterruptedException
    {
        Thread.sleep(100);


    }
}
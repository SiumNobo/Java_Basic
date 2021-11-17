package PreparationForFinalExam;

class C1
{

}
public class Exceptiontest {
    public static void main(String[]args)
    {
        int a=Integer.parseInt("10");
        System.out.println(a);
        int []ar=new int[5];
        ar[0]=0;
        System.out.println("here 1");
        int d=5/ar[0];
        System.out.println("HERE 2");
        ar[10]=6;
    }
}

package MyExampractice2;

public class Passbyvalue {
    public static void main(String[]args)
    {
         int a=20;
         int b=30;
         System.out.println(a+" "+" "+b);
Swap(a,b);
        System.out.println(a+" "+" "+b);

    }
    static void Swap(int c,int d)
    {
        int temp=c;
        c=d;
        d=temp;

    }

}

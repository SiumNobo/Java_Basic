package MyFirstProgram;
import java.lang.*;
import java.util.*;

public class ThirdProgram {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        System.out.println("Input Two Number");
        int a, b, c, d;
        a = t.nextInt();
        b = t.nextInt();
        d = t.nextInt();
        c = a + b + d;
        System.out.println("Sum of two digit " + c);

    }
}
class longg
{
    public static void main(String[] args)
    {
        Scanner t=new Scanner(System.in);
        int a,b,c;

        a=t.nextInt();
        b=t.nextInt();
        c=t.nextInt();
        int i = a + b + c;
        long res=(long)i;

        System.out.println("the sum of the result"+res);

    }
}
class floate
{
    public static void main(String[] args)
    {
        Scanner t=new Scanner(System.in);
        int a,b,c;
        a=t.nextInt();
        b=t.nextInt();
        c=a+b;
        float i=(float)c;
        System.out.println("this the sum of float"+i);
    }
}
//Declare an array
class arr1
{
    public static void main(String[] args)
{
    int []arr1,arr3;
    int arr2[],arr4[];
    int[]arr5={1,3,4,5,6,7,8,9};
    arr1=new int[3];
    arr3=new int[5];
    arr4=new int[6];
    arr1=new int[]{1,3,4,5};
    arr1[0]=5;
    for(int i=0;i<arr1.length;i++)
    {
        System.out.println("the element of the array is "+arr1[i]);
    }


}
}



 class PNobo {

    public static void main(String[] args)
    {
        int a,b,x;
        Scanner t=new Scanner(System.in);
        a=t.nextInt();
        b=t.nextInt();
        x=a-b;
        System.out.println("X= "+x);


    }

}

class Mysum
{
    public static void main(String[]args)
    {
        int a,b,c,d;
        Scanner t=new Scanner(System.in);
        a=t.nextInt();
        b=t.nextInt();
        c=t.nextInt();
        d=a+b+c;
        System.out.println("X="+d);
    }
}
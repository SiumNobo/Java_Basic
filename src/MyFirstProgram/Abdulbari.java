package MyFirstProgram;
import java.lang.*;
import java.util.*;


public class Abdulbari {
    public static void main(String args[])
    {
Scanner s=new Scanner(System.in);
int a,b,c;
System.out.println("enter two of the number");

a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.println("Sum of two numbers:"+c);

    }
}
//7 4.11
class radixpoint
{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        sc.useRadix(2);
        int x= sc.nextInt();
        System.out.println(x);


    }
}
class Nextline
{
    public static void main(String[]args)
    {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("May i know your name?");
        name=sc.nextLine();
        System.out.println(name);


    }
}

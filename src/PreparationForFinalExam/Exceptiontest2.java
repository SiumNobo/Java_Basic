package PreparationForFinalExam;

import java.util.Scanner;
import java.util.InputMismatchException;

class A
{

}

public class Exceptiontest2 {
    public static void main(String[]args)


    {
try {
    Scanner sc=new Scanner(System.in);
    int[]k=new int[5];
    int d=sc.nextInt();
    k[d]=50;
    int a=5/d;
    System.out.println(a);
}

catch (InputMismatchException e){

    System.out.println("You must import an integer");
}
catch (ArithmeticException e)
{
    System.out.println("You don't store any 0 number in d");
}
finally {
    System.out.println("It will printed");
}
System.out.println("Admin");
System.out.println("Sium Muntasir");
    }


}


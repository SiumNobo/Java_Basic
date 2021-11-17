package Afinalpracticect1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiontest {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int k=Integer.parseInt(sc.nextLine().trim());
        int a = sc.nextInt();

        try {

            int d=5/a;
            System.out.println(d);
            int[]ar=new int[5];
            ar[a]=5;
        }
        catch (InputMismatchException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("AMi tumi ek nh");
        }
    }
}

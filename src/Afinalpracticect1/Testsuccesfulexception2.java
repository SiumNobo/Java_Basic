package Afinalpracticect1;

import com.sun.net.httpserver.Authenticator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Testsuccesfulexception2 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        boolean Successful=false;
        while (!Successful)
        {
            try {


                int a = sc.nextInt();
                int b = Integer.parseInt(sc.nextLine().trim());
                int k = a / b;
                System.out.println("The result is" + k);
                Successful = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println(e.getMessage());
                if (sc.hasNextLine())
                    sc.nextLine();
            }
            catch (ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            catch (NumberFormatException e)
            {
                System.out.println(e.getMessage());
            }
        }
        sc.close();


    }
}

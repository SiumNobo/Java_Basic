package Afinalpracticect1;

import java.util.InputMismatchException;

public class Throwingfromthetry {
    public static void main(String[] args) {

        try {
            test();
            System.out.println("Okay");
        }
        catch (Exception e)
        {
            System.out.println("Not okay"+e.getMessage());
        }

    }

    public static void test() {
        try {

            throw new ArithmeticException("Take A Sleep");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Metheod"+e.getMessage());
        }
        finally {
            System.out.println("You are splendid");
        }
    }
}

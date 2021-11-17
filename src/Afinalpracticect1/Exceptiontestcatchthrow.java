package Afinalpracticect1;

public class Exceptiontestcatchthrow {
    public static void main(String[]args) {
        try {
            fna();
        } catch (Exception e) {
            System.out.println("outter" + e.getMessage());
        }

    }


    public static void fna() {
        try {
            int c=10/0;
            System.out.println("You are so Beautiful to me");
        }
        catch (ArithmeticException e)
        {
            System.out.println("inner"+e.getMessage());
            throw new IllegalArgumentException("This is you");
        }
        finally {
            System.out.println("Can you see me");
        }
        System.out.println("Okay Bye");
    }
}

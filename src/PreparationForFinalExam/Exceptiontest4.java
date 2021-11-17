package PreparationForFinalExam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiontest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean succesful = false;
        while (!succesful) {
            try {
                int a = sc.nextInt();
                int b = Integer.parseInt(sc.nextLine().trim());
                int c = a / b;
                System.out.println(c);
                succesful = true;


            }
            catch (ArithmeticException e)
            {
                System.out.println("Don't input 0");
            }
            catch (InputMismatchException e)
            {
                System.out.println("need a valid number");
            }
            catch (NumberFormatException e)
            {
                System.out.println("Number format exception");
            }
        }
    }
}
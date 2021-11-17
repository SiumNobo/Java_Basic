package PreparationForFinalExam;

public class Multitrycatch {
    public static void main(String[] args) {
        int[]ar=new int[10];


        try {
            System.out.println("outpen");
            try {
                System.out.println("Open");
                ar[4] = 11/0;
                System.out.println("Changed");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("inner out of" + e.getMessage());
            }
        }
        catch(ArithmeticException e)
        {
System.out.println("Outer out of"+e.getMessage());
        }
        finally {
            System.out.println("You may go now");
        }
    }
}

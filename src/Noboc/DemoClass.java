package Noboc;

public class DemoClass {
    final double PI = 3.1416;
    class IBlock {
        void calculateArea(double radius) {
            double area = PI * radius*radius;
            System.out.println("Area: "+ area);
        }

    }


    public static void main (String []args) {

        DemoClass  KD =  new DemoClass();
        IBlock DK =  KD.new IBlock();

        DK.calculateArea(5.0);
    }
}



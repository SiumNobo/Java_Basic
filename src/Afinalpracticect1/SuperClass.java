package Afinalpracticect1;

class Supeclass {
    public void doIt()

    {
        System.out.println("Super class doIt()");
    }
}
class TestAnonymous {
    public static void main(String[] args) {
        SuperClass ref = new SuperClass()

        {
            public void doIt(){
                System.out.println("Anonymous class doIt()");

        }

        } ;
        ref.doIt();
    }
}

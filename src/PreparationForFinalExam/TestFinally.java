package PreparationForFinalExam;

public class TestFinally {
    public static void main(String[] args){
        try{
            test();
        }catch(Exception e){
            System.out.println("Catch from main: "+ e.getMessage());
        }
    }
    public static void test(){
        try{
            throw new ArithmeticException("throwing an exception");
        } catch(ArithmeticException e){
            System.out.println("Catch from test: "+ e.getMessage());
        } finally{
            System.out.println("Finally from test method.");
        }
        System.out.println("After Finally from test method.");
    }
}

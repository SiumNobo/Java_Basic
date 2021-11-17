package Amidexam;
import Amidexam.karexam.Protectedimplementation;

public class Useofproctected extends Protectedimplementation {
    void Fna()
    {
        System.out.println(Var1);
    }
    public static void main(String[] args) {
            Useofproctected c1=new Useofproctected();
            c1.Fna();
            System.out.println(c1.Var1);



    }
}

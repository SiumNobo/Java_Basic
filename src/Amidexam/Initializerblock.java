package Amidexam;
class Laptop {
    String model;
    {
        model = "Model Rafia";
        System.out.println("Cheledhar Anagona");
    }
    Laptop()
    {
        System.out.println("Bole uradhura kintu ekebarei Pani");
    }
}
public class Initializerblock {
    public static void main(String[]args)
    {
        Laptop c=new Laptop();
        String model=c.model;
        System.out.println(c.model);
    }
}

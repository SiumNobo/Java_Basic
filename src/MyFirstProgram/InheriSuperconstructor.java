package MyFirstProgram;

class InheriSuperconstructor {
    public InheriSuperconstructor(String name) {
    }

    void bike(String name)
    {
        System.out.println(" sasdasdasd"+name);
    }
}
class Bike extends InheriSuperconstructor
{
    Bike(String name)
    {
        super(name);
        System.out.println("Bike is created");
    }
    public static void main(String[]args)
    {
        Bike b=new Bike("bike");
    }
}


package Practiceforclasstest3;

class Localinner {
    private int date=20;
    void display()
    {
        int a=50;
        class Local
        {
         void msg()
         {
             System.out.println(date+a);
         }
        }
        Local l=new Local();
        l.msg();
    }
    public static void main(String[]args)
    {
        Localinner obj=new Localinner();
        obj.display();
    }
}

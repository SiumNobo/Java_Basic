package Practiceforclasstest3;
class Abc
{
    public void Dolt()
    {
        System.out.println("Student is Student");
        System.out.println("Student is not beyadob");
    }
}

public class Final1934a {
    public static void main(String[]args)
    {
        Abc k=new Abc()
        {
          public void Dolt()
          {
              System.out.println("Student is reading");
              System.out.println("Student is not reading");
          }
        };
        k.Dolt();
    }

}

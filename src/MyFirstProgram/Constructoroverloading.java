package MyFirstProgram;

class Sium{
    double width,height,depth;
    Sium(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;

    }
    Sium(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
        return width*height*depth;
    }
}
public class Constructoroverloading {
    public static void main(String[]args)
    {
        Sium b=new Sium(10,50,60);
        System.out.println(" "+b.volume());
        Sium b1=new Sium(5);
        System.out.println(" "+b1.volume());

    }
}

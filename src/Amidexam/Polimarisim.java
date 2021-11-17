package Amidexam;

public class Polimarisim {
    int depth;
    int length;
    int height;
    Polimarisim(int d,int h,int l)
    {
        depth=d;
        height=h;
        length=l;
    }
    Polimarisim(int len)
    {
        this(len,len,len);
    }
    /*
    polimarisim(int len)
    {
    depth=height=length=len;
    }

     */
    int volume()
    {
        return depth*length*height;
    }
    public static void main(String[]args)
    {
        Polimarisim s=new Polimarisim(20);
        Polimarisim s1=new Polimarisim(20,30,30);
        s.volume();
        s1.volume();
        System.out.println(s.volume());
        System.out.println(s1.volume());


    }
}

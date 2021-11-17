package Afinalpracticect1;

class Innerclassandoutterclass {
    int m;
    class Inner
    {
        int k;
        public Inner(int k)
        {
            this.k=k;
        }
        void Print()
        {
            System.out.println("inner"+k);
        }
    }
    public Innerclassandoutterclass(int m)
    {
        this.m=m;
    }
void print()
{
    System.out.println("outter");
    Inner inner = new Inner(10);
    inner.Print();
}

    public static void main(String[]args)
    {
        Innerclassandoutterclass obj=new Innerclassandoutterclass(10);
        obj.print();
        System.out.println(obj.m);
        Innerclassandoutterclass.Inner inneronj=obj.new Inner(20);
        System.out.println(inneronj.k);
    }
}

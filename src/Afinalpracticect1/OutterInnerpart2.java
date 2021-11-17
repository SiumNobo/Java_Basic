package Afinalpracticect1;

class OutterInnerpart2 {
    int t1;
    public OutterInnerpart2(int t1)
    {
        this.t1=t1;
    }

    class inner{
        int t2;
        public inner(int t2)
        {
            this.t2=t2;
        }
        void Print()
        {
            System.out.println(t1);
            System.out.println(t1);
            System.out.println(t2);

        }
    }
    public static void main(String[]args)
    {
        OutterInnerpart2 obj=new OutterInnerpart2(10);
        OutterInnerpart2.inner onj=obj.new inner(100);
        onj.Print();
    }

}

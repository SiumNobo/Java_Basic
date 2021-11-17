package Afinalpracticect1;

class Shadowwingoutterinner {
int k;
public Shadowwingoutterinner(int K)
{
    this.k=k;
}
class inner
{
    int k;
    public inner(int k)
    {
        this.k=k;
    }
    void Print()
    {
        System.out.println("inner"+k);
        System.out.println("Outer"+Shadowwingoutterinner.this.k);
    }


}
public static void main(String[]args)
{
    Shadowwingoutterinner sc=new Shadowwingoutterinner(100);
    Shadowwingoutterinner.inner onj=sc.new inner(200);
    onj.Print();
}
}

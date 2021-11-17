public class Objectivearray {
    String name;
    String ID;
    int num;
    public Objectivearray(String name,String ID,int num)
    {
        this.name=name;
        this.ID=ID;
        this.num=num;
    }
    public static void main(String[]args)
    {
        Objectivearray[]st1=new Objectivearray[3];
        st1[0]=new Objectivearray("Sium","0110210212",10000);
        st1[1]=new Objectivearray("Kalam","939129129",100102012);
        st1[2]=new Objectivearray("Salim","20120120",102102012);
        System.out.println(st1[0].name+" "+st1[0].ID+" "+st1[0].num);
        System.out.println(st1[1].name+" "+st1[1].ID+" "+st1[1].num);
        System.out.println(st1[2].name+" "+st1[2].ID+" "+st1[2].num);
st1[0].Display();
st1[1].Display();
st1[2].Display();

    }
    void Display()
    {
        System.out.println(name);
        System.out.println(ID);
        System.out.println(num);
    }
}

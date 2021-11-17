package MyFirstProgram;

import java.util.Random;

public class MyPractice {
    public static void main(String[]args)
    {
        int[]arr9;
        arr9 = new int[]{1,3,4,6,9};
        for(int i=0;i<arr9.length;i++)
        {
            System.out.println("this program is all about "+arr9[i]);
        }
    }
}


class Multidimentional
{
    public static void main(String[]args)
    {
        int [][]arr1={{0},{1,3,9,100,1000},{1,56,7}};
        for(int i=0;i< arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class Array{
    public static void main(String args[])
    {
        int[][]arr1={{1,2,3},{1,4,9},{1,6,7},{1,2,3,5,9}};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }
    }
}
class Foreachloop
{
   public static void main(String[]args)
   {
       int[] A1={1,3,4,88,99};
       int sum=0;
       int i=0;
       for(int X:A1)
       {
           i++;
           System.out.println("number"+i);
           sum+=X;
           System.out.println(X);
       }
       System.out.println("Sum of the whole digit "+sum);
   }
}
class Fore {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 5, 6, 7};
        int sum = 0;
        int i = 0;
        for (int x : a1) {
            System.out.println("" + i);
            System.out.println("" + a1);
        }
    }
}
class OFFiceWorker
{
    String name;
    int salary;
    float id;
    void printtall()
    {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(id);

    }
}
class Ditailss
{
    public static void main(String args[]) {
        OFFiceWorker st1 = new OFFiceWorker();
        st1.name = "Rafiq";
        st1.salary=20000;
        st1.id=200.13f;
        st1.printtall();
    }
}
class Bafstudent
{
    String name;
    int ID;
    float number;
    void study(int hours)
    {
        System.out.println(name);
        System.out.println(number);
        System.out.println(ID);
        System.out.println(hours);
    }
}
class Bafwebportal
{
    public static void main(String[]args)
    {
        Bafstudent st2=new Bafstudent();
        st2.name="MR kuddos";
        st2.ID=11120202;
        st2.number=99.35f;
        st2.study(4);
    }
}
class Conasto{
    public String name;
    public String id;
    public double balance;
    public Conasto()
    {
        id = new Random(10000)+"";
    }
    public Conasto(String name,String id,double balance)
    {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public static void main(String[]args)
    {
        Conasto ba=new Conasto("Rashid","201120120",203003.03);
        Conasto bb=new Conasto();
        System.out.println(ba.name+"\n"+ba.id+ ba.balance);
    }
}
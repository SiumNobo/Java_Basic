package MyExampractice2;

public class Objectivearray {

    String name;
    String ID;
    public Objectivearray(String name,String ID)
    {
        this.name=name;
        this.ID=ID;
    }

    public static void main(String[]args) {

        Objectivearray[] st1 = new Objectivearray[3];
        st1[0]=new Objectivearray("Rahim","101229012");
        st1[0].ID="1012012";
        System.out.println(st1[0].name);
        System.out.println(st1[0].ID);
    }
}
class Foreachloop {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 1, 51, 5};
        for (int x :a)
        {
            System.out.println(x);
        }
    }
}
package MyFirstProgram;

public class Objectivearray {

     String name;
     String id;
     Double cgpa;
     public Objectivearray(String name,String id,Double cgpa)
     {
         this.name=name;
         this.id=id;
         this.cgpa=cgpa;
     }
     public static void main(String[]args)
     {
         Objectivearray[]st1=new Objectivearray[4];
         st1[0]=new Objectivearray("Rahim","2010101",3.99);
         st1[1]=new Objectivearray("Chokina","2010101",3.19);
         st1[2]=new Objectivearray("Jorina","2010101",4.00);
         st1[3]=new Objectivearray("Porina","2010101",3.55);
         System.out.printf("name %s Id: %s", st1[0].name, st1[0].id);
     }
}


package Javamate;


import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

class Judges{
    static  int point;
    Judges(){
        Random random =  new Random();
        point = random.nextInt(10);
    }
}
class Teams{
    String name;
    String description;
    int point;
    Teams(String name,String description){
        this.name = name;
        this.description = description;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    void teamInfo(){
        System.out.println("Team name : "+name);
        System.out.println("Desscription : "+description);
    }
    void teamNameANdPoint(){
        System.out.println("Team Name : "+name);
        System.out.println("Points : "+point);
    }
}

public class ScienceFair011162093{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Teams[] teams = new Teams[5];
        for(int i=0;i<5;i++){
            String name;
            String descroiptin;

            System.out.println("Team name : ");
            name = cin.next();
            cin.nextLine();
            System.out.println("Team Despription : ");
            descroiptin = cin.nextLine();
            teams[i] = new Teams(name,descroiptin);
        }
        System.out.println("Team information : ");
        for(int i=0;i<5;i++){
            teams[i].teamInfo();
        }
        System.out.println("Team Marks");
        for(int i=0;i<5;i++){
            int marks=0;
            for(int j=0;j<3;j++){
                Judges judges = new Judges();
                marks += judges.point;
            }
            teams[i].setPoint(marks);
            teams[i].teamNameANdPoint();
        }
        int max=0,index=0;
        for(int i=0;i<5;i++){
            if(teams[i].getPoint()>max){
                max = teams[i].getPoint();
                index = i;
            }
        }
        System.out.println("Make point : "+teams[index]+" Winner team "+teams[index].name);
    }
}
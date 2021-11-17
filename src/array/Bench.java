package array;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Student {
    String name;

    Student(String name){
        this.name = name;
    }
    void printAll(){
        System.out.print("Student name: " + name);
    }

}

public class Bench {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("src/file.txt"));
            FileWriter fw = new FileWriter("src/file2.txt");
            BufferedWriter writer = new BufferedWriter(fw);

            ArrayList<Student> students = new ArrayList<>();

            while(sc.hasNext()){
                String name = sc.next();
                Student st = new Student(name);
                students.add(st);
            }

            Collections.sort(students, Collections.reverseOrder());

            for(int i = 0; i < students.size() ;i ++) {
                writer.write(students.get(i).name + "\n");
                writer.newLine();
                writer.close();
            }

            sc.close();


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

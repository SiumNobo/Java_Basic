package Filerelatedprob;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Readingformafile {
    public static void main(String[]args)
    {
        try {
            File f = new File("Files/a.txt");
            Scanner sc = new Scanner(f);
            String line = sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            double d = sc.nextInt();
            String str = sc.next();

            System.out.println(line);
            System.out.println(a);
            System.out.println(b);
            System.out.println(d);
            System.out.println(str);

            sc.close();

        }
        catch (IOException e)
        {
e.printStackTrace();
        }
    }
}
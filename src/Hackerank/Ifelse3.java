package Hackerank;

import java.util.Scanner;

public class Ifelse3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2!=0 || (n%2==0 && n>=6 && n<21 ))
        {
            System.out.println("Weird");
        }
        else if((n%2==0&&(n>1 && n<6))||(n%2==0 && n>20))
        {
System.out.println("Not weird");
        }
        else
        {
            System.out.println("Not weird");
        }

    }
}

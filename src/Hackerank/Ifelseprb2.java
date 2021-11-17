package Hackerank;

import java.util.Scanner;

public class Ifelseprb2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = 0; i <n; i++) {
            int k=0;
            int g=0;

            for (int j = 0; j < i; j++) {

                k = k + (b * i);
            }
           g=a+k;
            System.out.println(g);
        }
    }
}

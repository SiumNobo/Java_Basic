package Hackerank;
import java.lang.*;
import java.util.*;

import java.util.Scanner;

public class Soluation {
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

        if (n >= 2 && n <= 20) {
            for (int i = 1; i <= 10; i++) {
                int k = 0;
                k = n * i;
                System.out.println(n+" x "+i+" = "+k);


            }

        }
    }
}
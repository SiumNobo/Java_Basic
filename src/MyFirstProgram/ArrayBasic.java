package MyFirstProgram;

import java.awt.desktop.SystemEventListener;

public class ArrayBasic {
    public static void main(String[]args) {
        int[] num1 = {1, 3, 4, 5};
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]+"\n");
        }
    }
}
class Foreachloopp
{
    public static void main(String[]args)
    {
        int[] num1;
        num1=new int[]{1,3,4,5};
        for(int X:num1)
        {
            System.out.println(X);
        }
    }
}
class Multidimentionalarray
{
    public static void main(String[]args) {
        int[][] arr1 ={{1,3,3,4,5},{1,23,2},{2,4,5},{1,2,57,22}};
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

package lekcion1;

import java.util.Scanner;

public class Helloword {
    public static void main(String[] args ){
        System.out.println ("Введите целое положительное число");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x<0 ){
            System.out.println ("Некорректный ввод");

        }
        int[] a = new int [x+1];
        for (int i=1;i<=x;i++){
           a[i]  =i;
        }
        int F=1;
        for (int i=1;i<=x;i++){
            F=F*a[i];
            //System.out.printf ("%d= %d \n",i,a[i]);
        }
        System.out.printf ("F= %d ",F);

    }
//public class Robot (int a_x,int a_y){



//}
}

package leksikon3;

import java.util.Scanner;
/**
 * Программа заполняет квадратную матрицу цифрами «1» в форме бабочки.
 * @author Aleh Karpachew
 */

public class Bab {
    public static void main(String[] args ) {
        System.out.println("Введите целое положительное число");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int array[][] = new int[x][x];   /*Вводим размер массива и создаём его*/


            int n =x/2;                  /*Находим середину массива*/

        for (int i=0;i<n;i++){
            for(int j=0+i;j<x-i;j++){
                array[i][j]=1;           /*Заполняем верхнюю часть массива бабочкой*/
            }
        }
        for (int i=n;i<x;i++){
            for(int j=x-i-1;j<0+i+1;j++){
                array[i][j]=1;            /*Заполняем нижнюю часть массива бабочкой*/
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("%d ", array[i][j]);
            }                                         /*Распечатка массива*/
            System.out.println("");}
    }
}

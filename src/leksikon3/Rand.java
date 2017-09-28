package leksikon3;

import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args ) {
        System.out.println("ВВедите количество строк масссива M");
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        System.out.println("Введите количество столбцов массива N");
        int N = in.nextInt();
        int array[][] = new int[M][N];   /*Вводим размер массива и создаём его*/
        Random rand = new Random();
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++) {/*Заполняем весь массив случайными элементами*/
                array[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Введите число от 0 до 100 ");
        int X = in.nextInt();
        int k =0;                               /*Задаём счётчик*/
        if (X<100) {
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                if(array[i][j] == X) {k++;}
                }
            }
            System.out.printf("Число %d встречается %d раз", X,k);
            System.out.println("");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.printf(" %d ", array[i][j]);
                }
                System.out.println("");
            }
        }
        else System.out.println("НЕправильный ввод");


    }

}

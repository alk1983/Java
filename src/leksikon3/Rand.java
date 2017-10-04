package leksikon3;

import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args ) {
        System.out.println("ВВедите количество строк масссива Row");
        Scanner in = new Scanner(System.in);
        int Row = in.nextInt();
        System.out.println("Введите количество столбцов массива Column");
        int Column = in.nextInt();
        int array[][] = new int[Row][Column];   /*Вводим размер массива и создаём его*/
        Random rand = new Random();
        for (int i = 0; i < Row; i++){
            for (int j = 0; j < Column; j++) {/*Заполняем весь массив случайными элементами*/
                array[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Введите число от 0 до 100 ");
        int number = in.nextInt();
        int counter =0;                               /*Задаём счётчик*/
        if (number<100) {
            for (int i = 0; i < Row; i++) {
                for (int j = 0; j < Column; j++) {
                if(array[i][j] == number) {counter++;}
                }
            }
            System.out.printf("Число %d встречается %d раз", number,counter);
            System.out.println("");
            for (int i = 0; i < Row; i++) {
                for (int j = 0; j < Column; j++) {
                    System.out.printf(" %d ", array[i][j]);
                }
                System.out.println("");
            }
        }
        else System.out.println("НЕправильный ввод");


    }

}

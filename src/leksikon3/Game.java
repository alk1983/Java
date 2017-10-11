package leksikon3;

import java.util.Random;
import java.util.Scanner;

/**
 * Программа генерирует случайное число в определённом диапазоне
 * Пользователь должен угадать это число
 * Если пользователь вводит число более близкое к заданному программа выыводит Горячо
 * Если пользователь вводит число дальнее от заданного программа выдаст Холодно
 * Программа укажет за какое количество попыток было отгадано число
 */
public class Game {
    public static void main (String[] args){
        System.out.println("Введите нижний предел");
        Scanner in = new Scanner(System.in);
        int limit1 = in.nextInt();
        System.out.println("Введите верхний предел");
        int limit2 = in.nextInt();
        Random rand = new Random();
       int compNumber = rand.nextInt(limit2-limit1);
        //System.out.println(compNumber);

       int deltaN =1;
       int counter=1;
do{
    System.out.println("Введите число диапазона");
    int myNumber = in.nextInt();
    if (myNumber==compNumber){ break;}
    if(Math.abs(myNumber-compNumber)>deltaN){
        deltaN = Math.abs(compNumber - myNumber);
        System.out.println("Холодно!");
    }
    else {deltaN = Math.abs(compNumber - myNumber);
        System.out.println("Горячо!");}
counter++;
}while (deltaN !=0);
System.out.println("ВЫ угадали число  " +compNumber+" за "+counter+" попыток");








    }
}

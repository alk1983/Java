package lekcion1;

import java.util.Scanner;
/**
 * Программа создаёт робота, задаёт его координаты,и показывает движение робота.
 *
 */
public class main {
public static void main (String[] args){
    Robot myRobot = new Robot();
    CoordinateOutput(myRobot);
    System.out.println("\n" + "Введите координату х робота");
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    System.out.println("\n" + "Введите координату у робота");
    int y = in.nextInt();
    myRobot.SetCoord(x,y);
    CoordinateOutput(myRobot);
    System.out.println("\n" + "Введите смещение вдоль оси х робота");

    myRobot.MoveX(in.nextInt());
    System.out.println("\n" + "Введите смещение вдоль оси у робота");
    myRobot.MoveY(in.nextInt());
    CoordinateOutput(myRobot);

}
    /**
     * Функция выводит на экран координаты робота.
     *
     * @param robot - экземпляр класса Robot
     */
    public static void CoordinateOutput(Robot robot) {
        System.out.println("\n" + "" + "Координаты робота: [" + robot.getXCoord() + "," + robot.getYCoord() + "]" );
    }
}

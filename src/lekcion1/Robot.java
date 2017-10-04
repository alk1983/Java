package lekcion1;

/**
 * Class Robot имеет координаты х и у которые можно задавать.
 * Robot может перемещаться вдоль осей х и у
 * @author Aleh Karpachew
 */
public class Robot {
    private int xCord=0;
    private int yCord=0;
public void SetCoord(int x,int y){
    this.xCord=x;
    this.yCord=y;
}
public int getXCoord(){
    return xCord;
}
public int getYCoord(){
    return yCord;
}
public void MoveX(int deltaX){
    xCord+=deltaX;
    }
public void MoveY(int deltaY){
    yCord+=deltaY;
}

}

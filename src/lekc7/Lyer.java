package lekc7;

public class Lyer {
    private  int dif;
    private Calculator calculator;
    public  Lyer (Calculator calculator,int dif){
        this.calculator=calculator;
        this.dif=dif;
    }
    public int summ(int a,int b){
        return calculator.summ(a,b)+dif;
    }

    public void setDif(int dif) {
        this.dif = dif;
    }
}

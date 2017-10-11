package leksion4;

public class Sportsman {

   private String name;
   private int gold;
   private int silver;
   private int total;
public  Sportsman(){

}
public Sportsman( String name,int gold,int silver){
   this.name = name;
   this.gold = gold;
   this.silver = silver;
   this.total = gold+silver;
}
   public String getName () {
      return this.name;
   }
   public int getGold(){
   return this.gold;
   }
   public int getTotal(){
      return this.total;
   }
   @Override
public String toString (){
   return name + "["+gold+";"+silver+"]";
   }
   @Override
   public int hashCode(){
   return (gold+silver)*31+Math.abs(name.hashCode());
   }
}


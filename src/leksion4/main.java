package leksion4;
import java.util.Arrays;
import java.util.Comparator;
public class main {
    public static Comparator cname = new NameComparator ();
    public static Comparator t = new TotalComparator();
    public static Comparator g = new GoldComparator();

    public static void main(String[] args ) {


        Sportsman sport[] = new Sportsman[6];
        String names[] = {  "Aleh", "Johny", "Abby", "John", "Bob",
                             ""};
        int gold[]={3,1,3,1,1,0};
        int silver[]={4,2,3,4,1,8};
        for (int i=0; i<6; i++) {
            sport[i] = new Sportsman (names[i], gold[i], silver[i]);
        }
        for (int i=0; i<6; i++) {
            System.out.println(i+1+"."+sport[i].toString());
        }
        for (int i=0; i<6; i++) {
            System.out.println(i + 1 + "." + sport[i].toString()+sport[i].hashCode());
        }
        Arrays.sort (sport, cname);
        // List of sportsmen sorted per name output
        System.out.println ("\n" + "Спортсмены по алфавиту:");
        for (int i=0; i<6; i++) {
            System.out.println ((i+1) + ". " + sport[i].toString());
        }
        System.out.println("\n"+"Спортсмены по золотым медалям");
        Arrays.sort(sport,g);
        for (int i=0; i<6; i++) {
            System.out.println ((i+1) + ". " + sport[i].toString());
        }
        System.out.println("\n"+"Спортсмены по общему количеству медалей");
        Arrays.sort(sport,t);
        for (int i=0; i<6; i++) {
            System.out.println ((i+1) + ". " + sport[i].toString());


        }

    }

}

package lesion8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static  void main(String[] args){
        String [] s;
        List<String> list =new ArrayList<>(100);
        list.add("asd");
        list.add("as2d");
        System.out.println(list);
        for (String element:list){
            System.out.println(element);
        }
        Map<String,Integer> map =new HashMap<>();
        map.put("Vasia",5);
        map.put("Petya",4);
        map.put("Kostya",5);
        map.entrySet();
        map.keySet();
        map.values();

    }


}

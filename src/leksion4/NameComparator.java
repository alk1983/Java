package leksion4;

import java.util.Comparator;

/**
 *  Компаратор для имен объектов «Sportsman».
 */
public class NameComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {

        if ((obj1 == null) || (!obj1.getClass().equals(Sportsman.class))) {
            return 1;
        }

        if ((obj2 == null) || (!obj2.getClass().equals(Sportsman.class))) {
            return -1;
        }

        Sportsman firstobject = (Sportsman) obj1;
        Sportsman secondobject = (Sportsman) obj2;
        return firstobject.getName().compareTo(secondobject.getName());
    }

}

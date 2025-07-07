package jungsuck.ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ch11_1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(10);
        list.add(3);
        list.add(5);
        list.add("1");
        list.add(2);
        list.add(54);

        ArrayList list1 = new ArrayList(list.subList(1,4));

        list.remove(String.valueOf(1));
//        Collections.sort(list);
        System.out.println(list);;

    }
}

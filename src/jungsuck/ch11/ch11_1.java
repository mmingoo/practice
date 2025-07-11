package jungsuck.ch11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ch11_1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(10);
        list.add(3);
        list.add(5);

        list.add(2);
        list.add(54);

        ArrayList list1 = new ArrayList(list.subList(1,4));

        Collections.sort(list);
        System.out.println(Collections.max(list));
        System.out.println(list);
        System.out.println(list1);

        Collections.sort(list);

    }
}

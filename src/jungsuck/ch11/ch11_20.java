package jungsuck.ch11;

import jungsuck.ch4.Math_random;

import java.util.*;

public class ch11_20 {
    public static void main(String[] args) {
        Set set = new HashSet();
        int number = 0;
        for (int i = 0; set.size()<6 ; i++) {
            number = (int) (Math.random()*45)+1;
            set.add(number);
        }

        System.out.println(set);
        List list = new LinkedList<>(set);
        Collections.sort(list);
        System.out.println(list);

    }
}

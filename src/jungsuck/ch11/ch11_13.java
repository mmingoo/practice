package jungsuck.ch11;

import java.util.*;

public class ch11_13 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("사과", 1);
        map.put("딸기", 2);
        map.put("바나나", 3);
        map.put("배", 1);

        Iterator iterator0 =  map.values().iterator();
        Iterator iterator1 = map.keySet().iterator();
        Iterator iterator2= map.entrySet().iterator();

        while (iterator0.hasNext()){
            Object object = iterator0.next();
            System.out.println(object);
        }

        while (iterator1.hasNext()){
            Object object = iterator1.next();
            System.out.println(object);
        }
        while (iterator2.hasNext()){
            Object object = iterator2.next();
            System.out.println(object);
        }
    }
}

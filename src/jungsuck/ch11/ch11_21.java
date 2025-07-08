package jungsuck.ch11;

import java.security.cert.CertPath;
import java.util.*;

public class ch11_21 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("안자바", 90);
        map.put("김자바", 100);
        map.put("강자바", 80);
        map.put("이자바", 100);

        int sum = 0;
        float avg = 0f;

        Set set = map.entrySet();
        Iterator it = set.iterator();


        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println("이름: "+ entry.getKey() + ", 점수 : " + entry.getValue());
            sum += (int)entry.getValue();
        }

        set = map.keySet();
        System.out.println("이름 : " + set);

        Collection scores = map.values();
        avg = (float) sum / scores.size();

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
        System.out.println("최고점수 : " + Collections.max(scores));
        System.out.println("최고점수 : " + Collections.min(scores));



    }
}
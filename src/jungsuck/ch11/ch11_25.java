package jungsuck.ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ch11_25 {
    public static void main(String[] args) {
        Set setA = new HashSet();
        Set setB = new HashSet();
        Set hob= new HashSet();
        Set kyo = new HashSet();
        Set cha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("setA :" + setA);


        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("setB:" + setB);

        Iterator it = setB.iterator();
        while(it.hasNext()){
            Object b = it.next();
            if (setA.contains(b))
                    kyo.add(b);
        }

        it = setA.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if(!setB.contains(obj))
                cha.add(obj);
        }


        it = setA.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            hob.add(obj);

        }
        it = setA.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            hob.add(obj);

        }

        System.out.println(hob);
        System.out.println(cha);
        System.out.println(kyo);

    }
}

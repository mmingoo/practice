package jungsuck.ch12;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericsTest {

    public static  <E> ArrayList<E> createArrays(E elements){
        ArrayList<E> arrayList = new ArrayList<>();
        arrayList.add(elements);
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = createArrays("string");
        for(String test : strings) {
            System.out.println(test);
        }

        ArrayList<Integer> ints = createArrays(1);
        System.out.println(ints);


    }



}

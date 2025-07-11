package jungsuck.ch8;

import java.util.Arrays;

public class ch8_3 {
    public static void main(String[] args) {
        int number = 100;
        int number2 = 0;
        String string = "123";
        char[] chs = string.toCharArray();
        System.out.println(Arrays.toString(chs));
        System.out.println(number/number2);

//        try{
//            System.out.println(number/number2);
//
//        } catch (NullPointerException e) {
//            System.out.println("예외가 발생");
//        }
    }
}

package jungsuck.practice.ch7;

import java.util.Arrays;

public class ErrorTest {
    public static void main(String[] args) {

        String arr = "absdfc";
        char[] chars = arr.toCharArray();
        System.out.println(Arrays.toString(chars));
        String string = String.valueOf(chars);
        System.out.println(string);
    }
}
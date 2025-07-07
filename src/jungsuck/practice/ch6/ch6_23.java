package jungsuck.practice.ch6;

import java.util.Arrays;

public class ch6_23 {

    public static int max(int[] arr){
        int max = 0;
        if(arr==null){
            return -9999;
        } else if (arr.length == 0) {
            return -9999;
        }else{
            for (int i = 0; i < arr.length ; i++) {
                if(arr[i] > max) max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{}));


    }

}

package jungsuck.ch4;

import java.math.MathContext;

public class Math_random {
    public static void main(String[] args) {

        // Quiz 1~10 사이의 임의의 숫자 출력하기
        for(int i = 0; i < 20; i++){

            // 총 0개 숫자
            System.out.println((int)(Math.random()*10)+1);

        }
        // Quiz -5 ~ 5 사이의 임의의 숫자 출력하기
        for(int i = 0; i < 20; i++){
            // -5,-4,-3,-2,-1,0,1,2,3,4,5 -> 11개 숫가
            System.out.println((int)(Math.random()*11)-5);

        }

    }
}

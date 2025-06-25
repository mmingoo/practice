package jungsuck.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Strike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int cnt = 0;
        int s = 0;
        int b = 0;


        //s가 될 때 까지 반복
        while (s != 3) {
            // s,b 초기화
            s = 0;
            b = 0;

            //1. arr1 랜덤한 값 받기
            for (int i = 0; i < arr1.length; i++) {
                int random_n = (int) (Math.random() * 9);
                arr1[i] = random_n;
            }

            //2. arr2 입력받기
            for (int i = 0; i < arr1.length; i++) {
                int input_n = scanner.nextInt();
                arr2[i] = input_n;
            }

            cnt ++;
            // arr1 원소를 돌면서
            for (int i = 0; i < arr1.length; i++) {
                boolean is_in = false;

                //3. arr1 각 원소와 arr2 안에 들어있다면 true
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        is_in = true;
                    }

                }

                //4. 들어있고(ture) 원소가 같다면 s++
                if (is_in && arr1[i] == arr2[i]) {
                    s++;
                }
                // 4. 들어있고 원소가 같지 않다면 b++
                else if (is_in && arr1[i] != arr2[i]) {
                    b++;
                }

            }
            System.out.println("arr1:"+ Arrays.toString(arr1));
            System.out.println("arr2:"+ Arrays.toString(arr2));

            System.out.println(s + "s" + b + "b");
        }

        System.out.println("총" +cnt+"번 반복했습니다.");
    }
}

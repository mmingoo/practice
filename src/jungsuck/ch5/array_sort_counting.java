package jungsuck.ch5;

import java.util.Arrays;

public class array_sort_counting {
    public static void main(String[] args) {
        int[]  numArr = new int[10];
        int[]  counter = new int[10];
        int[]  sort_arr = new int[10];
        int number = 0;

        for(int i = 0; i< 10; i++){
            numArr[i] = (int)(Math.random()*10);
        }

        for(int i = 0; i<10; i++){
            counter[numArr[i]] += 1;
        }

        for(int i = 0; i< numArr.length; i++){
            System.out.println(i+"의 갯수: "+ counter[i]);
            if(counter[i]!=0){
                // 카운팅이 0이 아닌 인덱스의 갯수
                number += 1;
            }
        }
        System.out.println("=============================");
        System.out.println("중복 제거");
        // 1. 중복제거
        System.out.println("중복 배열 :" + Arrays.toString(numArr));

        // 중복되지 않는 값들만큼 배열 생성
        int[] new_arr = new int[number];

        //new_arr 의 인덱스
        int idx = 0;

        //중복된 배열들을 순서대로 탐색
        for(int i = 0; i<numArr.length; i++){
            // new_arr 에 중복된 원소가 있는지 세는 변수
            int cnt = 0;

            //하나씩 탐색하면서 해당 원소와 0으로 초기화된 새로운 배열에 같은 값이 있는지 비교
            for(int j = 0; j < number; j++){
                if(numArr[i] == new_arr[j]){
                    cnt += 1;
                }
            }

            //만약 new_arr 에 중복된 원소가 없다면 추가
            if(cnt == 0){
                new_arr[idx] = numArr[i];
                idx ++;
            }

        }
        System.out.println("중복 제거한 배열 :" + Arrays.toString(new_arr));


        System.out.println("=============================");
        System.out.println("정렬");


        int sort_idx = 0;
        // 2.정렬
        for(int i = 0 ; i < counter.length; i++){

            // 카운터가 0이 아니라면
            if(counter[i] != 0){
            //카운터 갯수
                int cnt = counter[i];
                //카운터 갯수만큼 해당 인덱스 값을 넣음 -> 인덱스 추가
                for (int j = 0; j<cnt; j++){
                    sort_arr[sort_idx] = i;
                    sort_idx++;
                }
            }
        }
        System.out.println("정렬한 중복 배열 : "+ Arrays.toString(sort_arr));
    }
}


package jungsuck.quiz;

import java.util.Scanner;

public class Mid_value {
    public static void main(String[] args) {
        int[] input_arr = new int[3];
        Scanner scanner = new Scanner(System.in);
        Mid_value cal = new Mid_value();

        // 배열 입력받기
        System.out.print("배열을 입력해주세요:");
        for (int i = 0; i<input_arr.length; i++){
            int n = scanner.nextInt();
            input_arr[i] = n;
        }

        // 함수 호출
        System.out.println(cal.getMidValue(input_arr));

    }






    // 중간값 구하기
    public int getMidValue(int[] new_arr) {
        // max_n, min_x 배열의 첫반째 값으로 할당 -> 같은수가 있읈 수 있으므로
        int max_n = getMaxNum(new_arr);
        int min_n = getMinNum(new_arr);
        int result = 0;
        int sum = 0;

        System.out.println("min :" +min_n+ " max:"+max_n);

        // 모든 원소를 더해서 가장 큰 값과 가장 작은 값을 빼면 중간 값이 나옴
        sum = getSumValue(new_arr);

        result = sum - max_n - min_n;

        return result;
    }


    // 가장 큰 값 구하기
    public int getMaxNum(int[] new_arr){
        int max_n = new_arr[0];
        for (int i = 0; i < new_arr.length; i++) {
            if (new_arr[i] >= max_n) {
                max_n = new_arr[i];
            }
        }
        return max_n;
    }

    // 가장 작은 값 구하기
    public int getMinNum(int[] new_arr){
        int min_n = new_arr[0];
        for (int i = 0; i < new_arr.length; i++) {
            if (new_arr[i] <= min_n) {
                min_n = new_arr[i];
            }
        }


        return min_n;
    }

    // 합 구하기
    public int getSumValue(int[] new_arr){
        int sum = 0;

        for(int n : new_arr)
            sum+=n;

        return sum;
    }
}

package jungsuck.ch4;

import java.util.Scanner;

public class while_for {
    public static void main(String[] args) {
        int input = (int) (Math.random() * 101);

        Scanner sc = new Scanner(System.in);

        int answer = 0;

        do {
            System.out.println("0과 100 사이의 정수를 입력하세요:");
            answer = sc.nextInt();

            if (input < answer)
                System.out.println("더 작은 수를 입력하세요");
            else if (input > answer) {
                System.out.println("더 큰 수를 입력하세요");
            } else {
                System.out.println("정답입니다!");
            }

        } while (input != answer);
    }
}

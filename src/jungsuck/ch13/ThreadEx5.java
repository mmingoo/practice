package jungsuck.ch13;

import java.util.concurrent.ThreadPoolExecutor;

public class ThreadEx5 {

    static long startTime = 0;
    public static void main(String[] args) {
        Thread5_1 th = new Thread5_1();
        th.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i <300000 ; i++) {
            System.out.printf("%s" , "-");
        }

        System.out.println("소요시간1 : " + (System.currentTimeMillis() - ThreadEx5.startTime) );
    }

}

class Thread5_1 extends Thread{
    public void run(){
        for (int i = 0; i <300000 ; i++) {
            System.out.printf("%s", "|");
        }

        System.out.println("소요시간2 : " + (System.currentTimeMillis() - ThreadEx5.startTime) );

    }

}
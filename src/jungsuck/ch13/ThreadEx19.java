package jungsuck.ch13;

class ThreadEx19 {
    static long startTime = 0;

    public static void main(String args[]) {
        ThreadEx19_1 th1 = new ThreadEx19_1();
        ThreadEx19_2 th2 = new ThreadEx19_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();


        //해당 부분이 없으면 main 쓰레드가 먼저 종료된다.
        try {
            th1.join();	// main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
            th2.join();	// main쓰레드가 th2의 작업이 끝날 때까지 기다린다.
        } catch(InterruptedException e) {}

        System.out.println("main 쓰레드 종료");

    } // main
}

class ThreadEx19_1 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++)
            System.out.print(new String("-"));
    } // run()
}
class ThreadEx19_2 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print(new String("|"));
        }
    } // run()
}
package jungsuck.ch13;

public class ch13_1 {
    public static void main(String[] args) {

        ThreadEX_1 t1 = new ThreadEX_1();

        Runnable runnable = new ThreadEx_2();
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
    }
}


class ThreadEX_1 extends Thread{

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }

    }
}

class ThreadEx_2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
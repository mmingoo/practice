package virtualThreadPractice;

public class VirtualThreadBasic {
    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
                System.out.println("가상 Thread 호출");
            } catch (InterruptedException e) {
                System.out.println("인터럽트 발생");
            }
        };

        Thread thread = Thread.ofVirtual().unstarted(runnable);
        thread.start();

        thread.join();
        System.out.println("메인 쓰레드 종료");

    }
}
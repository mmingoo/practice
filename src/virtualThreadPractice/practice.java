package virtualThreadPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class practice {
    /*
    10개의 가상 쓰레드를 생성하여 각각 다른 시간(1초~5초) 동안 sleep 후
    "Task X completed after Y seconds" 형태로 출력하는 프로그램을 작성하세요.
    모든 쓰레드가 완료된 후 "All tasks completed!" 출력
    */
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <=10 ; i++) {

            int taskId = i;
            Runnable runnable = ()->{
                int time = (int)(Math.random()*5) + 1;
                try{
                    Thread.sleep(time* 1000);

                } catch (InterruptedException e) {
                    System.out.println("인터럽트가 발생했습니다.");
                }
                System.out.println(taskId+"번째 쓰리드 completed after " + time +"secods ");
            };

        Thread thread = Thread.ofVirtual().unstarted(runnable);
        thread.start();
        threads.add(thread);
        }

        for (Thread thread : threads){
            thread.join();
        }
        System.out.println("All tasks completed!");


    }
}

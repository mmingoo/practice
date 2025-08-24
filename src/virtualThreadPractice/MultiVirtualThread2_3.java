package virtualThreadPractice;


import java.util.ArrayList;
import java.util.List;

// 문제 2-3: 성능 측정
// 100개의 쓰레드가 각각 100ms sleep하는 작업의 총 실행 시간 측정
// 1. 일반 쓰레드 버전
// 2. 가상 쓰레드 버전
// 3. 실행 시간 비교
public class MultiVirtualThread2_3 {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> platformThreads = new ArrayList<>();
        List<Thread> virtualThreads = new ArrayList<>();


        for (int i = 1; i <= 10000 ; i++) {
            int taskId = i;

            Runnable task = ()->{
                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    System.out.println("인터럽트 발생");
                }
            };

            Thread thread = Thread.ofPlatform().unstarted(task);
            platformThreads.add(thread);
        }

        System.out.println("일반쓰레드 Sleep 작업");
        long startTime = System.currentTimeMillis();
        // 1단계: 모든 쓰레드를 먼저 시작 (병렬 실행 시작)
        for (Thread thread : platformThreads) {
            thread.start();
        }

        // 2단계: 모든 쓰레드가 완료될 때까지 대기
        for (Thread thread : platformThreads) {
            thread.join();
        }
        long endTime = System.currentTimeMillis();



/// /////////////////////////////////////////////////////////
        for (int i = 1; i <= 10000 ; i++) {
            int taskId = i;

            Runnable task = ()->{
                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    System.out.println("인터럽트 발생");
                }
            };

            Thread thread = Thread.ofVirtual().unstarted(task);
            virtualThreads.add(thread);
        }

        System.out.println("가상쓰레드 Sleep 작업");
        long virtualStartTime = System.currentTimeMillis();
        // 1단계: 모든 쓰레드를 먼저 시작 (병렬 실행 시작)
        for (Thread thread : virtualThreads) {
            thread.start();
        }

        // 2단계: 모든 쓰레드가 완료될 때까지 대기
        for (Thread thread : virtualThreads) {
            thread.join();
        }
        long virtualEndTime = System.currentTimeMillis();

        System.out.println("플랫폼 쓰레드 실행 시간 : "+ (endTime-startTime)+"ms");
        System.out.println("가상 쓰레드 실행 시간 : "+ (virtualEndTime-virtualStartTime) + "ms");


    }
}


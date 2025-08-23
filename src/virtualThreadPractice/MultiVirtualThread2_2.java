package virtualThreadPractice;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class MultiVirtualThread2_2 {

// 문제 2-2: HTTP 요청 시뮬레이션
// 5개의 가상 쓰레드가 각각 다른 "API 서버"에 요청
// 각 요청은 1-3초의 랜덤한 응답 시간
// "API-X response: Success (took Y ms)" 형태로 출력
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();


        for (int i = 1; i <=5 ; i++) {
            int apiId = i;
            Runnable runnable = ()->{
                int time = (int)(Math.random()*3)+1;

                long startTime = System.currentTimeMillis();

                HttpClient client = HttpClient.newHttpClient();

                try {
                    Thread.sleep(time * 1000); // ← 이 줄을 다시 추가하세요!

                    //요청 생석
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create("https://jsonplaceholder.typicode.com/posts/"+apiId))
                            .GET()
                            .build();

                    //응답 보내기
                    HttpResponse<String> response = client.send(request,
                            HttpResponse.BodyHandlers.ofString());

                    long endTime = System.currentTimeMillis();
                    long ingTime =  endTime - startTime;

                    System.out.println("API-"+apiId+ " response: Success (took " + ingTime + " ms)");
                } catch (InterruptedException | IOException e) {
                    System.out.println("인터럽트 발생");
                }
            };

            Thread thread = Thread.ofVirtual().unstarted(runnable);
            threads.add(thread);
            thread.start();
        }

        for(Thread thread : threads){
            thread.join();
        }
    }
}

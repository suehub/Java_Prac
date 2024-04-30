package sec03.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        // Vector 객체 생성
        List<String> vList = new Vector<>();
//        List<String> vList = new ArrayList<>(); // 동기화를 지원하지 않으므로 threadA의 작업이 완료되기 전에 threadB 실행됨

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    vList.add("홍길동"+i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 101; i <= 200; i++) {
                    vList.add("이순신"+i);
                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {}

        // 저장된 총 이름 수 얻기
        int size = vList.size();
        System.out.println("총 학생수: " + size);
    }
}

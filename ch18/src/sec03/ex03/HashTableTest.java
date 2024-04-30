package sec03.ex03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {
    public static void main(String[] args) {
        // HashTable 객체 생성
//        Map<Integer, String> map = new Hashtable<>();
        Map<Integer, String> map = new HashMap<>();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    map.put(i, "홍길동"+i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 101; i <= 200; i++) {
                    map.put(i, "이순신"+i);
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

        // 저장된 총 엔트리 개수 얻기
        int size = map.size();
        System.out.println("총 엔트리 개수: " + size);
    }
}

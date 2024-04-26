package sec04.ex06;

import sec03.ex01.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapGenericTest {
    public static void main(String[] args) {
        Map<String, String> hMap1 = new HashMap<String, String>();      // key와 value가 모두 String 타입이어야 저장 가능
        hMap1.put("홍길동", "서울시");
        hMap1.put("이순신", "부산시");
        hMap1.put("차범근", "부산시");
        hMap1.put("유현진", "서울시");

        String addr = hMap1.get("홍길동");     // 다운캐스팅 할 필요 없음
        System.out.println(addr);

        Map<String, Student> hMap2 = new HashMap<String, Student>();    // key와 value가 String, Student 타입만 저장 가능
        hMap2.put("서울시", new Student("20220001", "이순신",3));
        hMap2.put("부산시", new Student("20022002", "홍길동", 2));
        hMap2.put("2022003", new Student("2022003", "유현진", 1));

        Student s = hMap2.get("서울시");       // 다운캐스팅할 필요 없음
        System.out.println(s.toString());

    }
}

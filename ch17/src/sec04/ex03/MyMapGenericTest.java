package sec04.ex03;

import sec03.ex01.Student;

public class MyMapGenericTest {
    public static void main(String[] args) {
        MyMap<String, String> myMap1 = new MyMap<String, String>();     // key와 value를 String 타입으로 지정
        myMap1.put("홍길동", "서울시");
        String addr = myMap1.get("홍길동");
        System.out.println(addr);

        MyMap<Integer, String> myMap2 = new MyMap<Integer, String>();
        myMap2.put(100, "사과");
        String fruit = myMap2.get(100);
        System.out.println(fruit);

        MyMap<String, Student> myMap3 = new MyMap<String, Student>();
        myMap3.put("서울시", new Student("20220001", "이순신", 3));
        Student s = myMap3.get("서울시");
        System.out.println(s.toString());
    }
}

package sec03.ex01;

import sec01.ex05.Student;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("hello");
        set.add(Integer.valueOf(178));
        set.add(Float.valueOf(4.56F));
        set.add(new Student());

        Iterator elements = set.iterator();
        while (elements.hasNext()) {        // Hashset 객체들을 iterator의 메서드로 차례대로 출력
            System.out.println(elements.next());
        }
    }
}

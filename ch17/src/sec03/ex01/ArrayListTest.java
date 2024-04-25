package sec03.ex01;

import sec01.ex05.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List aList = new ArrayList();
        aList.add("hello");
        aList.add(Integer.valueOf(178));
        aList.add(Float.valueOf(4.56F));
        aList.add(new Student());

        Iterator iterator = aList.iterator();       // Iterator 얻음
        while (iterator.hasNext()) {                // ArrayList의 객체들을 iterator의 메서드로 차례대로 출력
            System.out.println(iterator.next());
        }
    }
}

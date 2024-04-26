package sec04.ex03;

import sec01.ex05.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenericTest {
    public static void main(String[] args) {
        List<String> aList1 = new ArrayList<String>();   // String 타입으로 제네릭 지정했으므로 ArrayList에는 문자열만 저장 가능
        aList1.add("a");
        aList1.add("b");
        aList1.add("c");
        aList1.add("d");

        String name1 = aList1.get(0);    // 다운캐스팅 없이 문자열 얻음

        for (int i=0; i<aList1.size(); i++) {
            String name2 = aList1.get(i);
            System.out.println(name2);
        }

        List<Student> aList2 = new ArrayList<>();
        aList2.add(new Student("20220001", "이순신", 3));
        aList2.add(new Student("20220002", "홍길동", 2));
        aList2.add(new Student("20220003", "손흥민", 1));

        Student s1 = aList2.get(0);
        System.out.println(s1);

        for (int i=0; i<aList2.size(); i++) {
            Student s2 = aList2.get(i);
            System.out.println(s2.toString());
        }




    }
}

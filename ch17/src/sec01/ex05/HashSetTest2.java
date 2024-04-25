package sec01.ex05;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetTest2 {
    public static void main(String[] args) {
        Set set = new HashSet();

        Student s1 = new Student("20220002", "홍길동", 2);
        set.add(s1);
        set.add("hello");
        set.add(Integer.valueOf(178));
        set.add(Float.valueOf(4.56F));
        set.add("hello");
        set.add(Integer.valueOf(178));

        Student s2 = new Student("20220002", "홍길동", 2);
        set.add(s2);
        Object[] obj = set.toArray();

        for (int i=0; i<obj.length; i++) {
            System.out.println(obj[i]);
        }
        System.out.println(set);

    }
}

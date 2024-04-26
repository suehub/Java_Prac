package sec05.ex03;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSortTest {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(new ScoreComparator());    // TreeSet 객체 생성 시 정렬 기능을 하는 ScoreComparator 객체를 생성자로 전달

        treeSet.add(new Student("홍길동", 3, 90));
        treeSet.add(new Student("차범근", 2, 80));
        treeSet.add(new Student("손흥민", 2, 70));
        treeSet.add(new Student("유현진", 3, 92));

        Iterator<Student> ite1 = treeSet.descendingIterator();
        System.out.println("\n시험 점수순으로 이름 출력하기");
        System.out.println("-----------------------------");
        while (ite1.hasNext()) {
            Student s = (Student) ite1.next();
            System.out.println(s.score + ", " + s.name);
        }
    }
}

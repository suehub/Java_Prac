package sec03.ex01;

import java.util.Objects;

public class Student {
    String hakbun;
    String name;
    int grade;

    public Student() {
        this("20220001", "이순신", 3);
    }

    public Student(String hakbun, String name, int grade) {
        this.hakbun = hakbun;
        this.name = name;
        this.grade = grade;

    }

    @Override
    public String toString() {
        return "학번: " + hakbun + " 이름: " + name + " 학년: " + grade;
    }

    @Override
    public int hashCode() {
        int hashCode = Objects.hash(hakbun);
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        String _hakbun = ((Student) obj).hakbun;
        int _grade = ((Student) obj).grade;

        if(hakbun.equals(_hakbun) && _grade == this.grade) {
            return true;
        } else {
            return false;
        }
    }
}

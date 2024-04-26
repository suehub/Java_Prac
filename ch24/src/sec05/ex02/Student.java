package sec05.ex02;

public class Student implements Comparable{
    String name;
    int grade;
    int score;

    public Student() { }
    public Student(String name, int grade, int score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        if(score > ((Student)o).score) {
            return 1;
        } else if (score == ((Student)o).score) {
            return 0;
        } else {
            return -1;
        }
    }
}

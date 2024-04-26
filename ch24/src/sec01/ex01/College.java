package sec01.ex01;

public class College extends Student{
    private int credit;

    public College(String name, int grade, int credit) {
        super.name = name;
        super.grade = grade;
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        String info = "이름: " + name + ", 학년: " + grade + ", 학점: " + credit;
        return info;
    }
}

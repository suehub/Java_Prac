public class College extends Student {
    private int courses;

    public College() {
        this("이순신", 2, 20);
        System.out.println("College 클래스의 기본 생성자 호출");
    }

    public College(String name, int grade, int courses) {
        super();
        System.out.println("매개변수가 3개인 College 생성자 호출");

        super.name = name;
        super.grade = grade;
        this.courses = courses;
    }

    public int getCourses() {
        return courses;
    }

    @Override
    public String getStudentInfo() {
        System.out.println("College 클래스의 getStudentInfo() 메서드입니다.");
        return "이름>> " + name + ", 학년>> " + grade + ", 신청 학점>> " + courses;
    }
}
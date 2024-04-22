public class College extends Student {
    private int courses;
    private char credit;

    public College() {
        System.out.println("College 클래스의 기본 생성자 호출");
    }

    public College(String name, int grade, int courses, String teacher) {
        super();
        System.out.println("매개변수가 3개인 College 생성자 호출");

        super.name = name;
        super.grade = grade;
        super.teacher = teacher;
        this.courses = courses;
    }

    public int getCourses() {
        return courses;
    }

    public char getCredit() {
        return credit;
    }

    public String getStudentInfo() {
        System.out.println("College 클래스의 getStudentInfo() 메서드 호출");
        return "이름은 >> " + name + ", 학년은 " + grade + ", 신청 학점은 >> " + courses;
    }

    @Override
    public String getTeacher() {
        return "지도 교수님: " + teacher;
    }


}

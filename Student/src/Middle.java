public class Middle extends  Student {

    public Middle(String name, int grade, String teacher) {
       System.out.println("Middle 클래스 생성자 호출");
       super.name = name;
       super.grade = grade;
       super.teacher = teacher;
    }

    @Override
    public String getTeacher() {
        return "담임 선생님: " + teacher;
    }

}

public class Middle extends  Student {
    public Middle(String name, int grade) {
        super();
        System.out.println("Middle 클래스 생성자 호출");
        super.name = name;  // super를 이용해서 부모 클래스의 필드임을 명시적으로 표시
        super.grade = grade;
    }

}

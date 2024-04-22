public class Middle extends  Student {

    public Middle(String name, int grade, int score) {
        super();
        System.out.println("Middle 클래스 생성자 호출");
        super.name = name;  // super를 이용해서 부모 클래스의 필드임을 명시적으로 표시
        super.grade = grade;
        super.score = score;
    }

    public Middle(String name, int grade, String gender, int age) {
        super();
        System.out.println("매개변수가 4개인 Middle 클래스 생성자 호출");
        super.gender = gender;
        super.age = age;
        super.name = name;
        super.grade = grade;
    }

}

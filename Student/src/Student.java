public abstract class Student {      // 일반 클래스를 추상 클래스로 선언
    protected String name;
    protected int grade;
    protected String teacher;
    protected int score;

    public Student() {
        System.out.println("Student 기본 생성자 호출");
    }

    public Student(String name, int grade) {
        System.out.println("매개변수가 있는 Student 생성자 호출");
        this.name = name;
        this.grade = grade;
    }

    // 학생 신상 정보 출력 메서드
    public String getStudentInfo() {
        System.out.println("Student 클래스의 getStudInfo() 호출");
        return "이름: " + name + ", 학년: " + grade;
    }

    public abstract String getTeacher();      // 학생의 담임 선생님 이름을 구하는 추상 메서드

//    public void study() {
//        System.out.println("시험 공부를 합니다.");
//    }
//
//    public void calcScore(Student s) {
//        if(s instanceof College) {
//            College c = (College) s;    // 자식 클래스로 다운캐스팅 후, credit 필드에 접근
//            char credit = c.getCredit();
//            System.out.println("대학생 학점: " + credit);
//        } else if(s instanceof Middle) {
//            Middle m = (Middle) s;  // 자식 클래스로 다운캐스팅 후, credit 필드에 접근
//            int score = m.score;
//            System.out.println("중학생 시험 점수: " + score);
//        }
//    }
//
//    public int test() {
//        System.out.println("시험 점수입니다.");
//        return 0;
//    }
//
//
//
//    public String getTeacher() {
//        return "김길동 선생님";
//    }
//
//    public void breath() {}     // 블록만 있어도 구현 메서드

//    public abstract void run(); // 추상 메서드는 abstract로 지정되고 구현부 블록이 없음


//    public void calcScore(Student s) {              // 부모 클래스 타입 매개변수를 지정해서 모든 자식 클래스 인스턴스 받을 수 있음
//        System.out.println("학생 시험 점수 구하기");
//    }

//    public void calcScore(College c) {            // 다형성을 사용하지 않으면 전달되는 자식 클래스 타입.
//        System.out.println("시험 점수 구하기");       // 매개변수를 따로 지정해서 메서드 구현
//    }
//
//    public void calcScore(Middle m) {
//        System.out.println("시험 점수 구하기");
//    }


}

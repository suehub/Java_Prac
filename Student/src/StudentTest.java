import java.util.concurrent.CountDownLatch;

public class StudentTest {
    public static void main(String[] args) {
//        Student s = new Student();  // 추상 클래스는 직접 인스턴스 생성 불가능
        Student s = new College("홍길동", 3, 22, "차범근");
        Middle m = new Middle("이순신", 2, "손흥민");
        String sinsang = s.getStudentInfo();
        System.out.println("학생 정보 : " + sinsang);

        String teacher = s.getTeacher();       // 추상 메서드를 오버라이딩한 메서드를 호출해서 지도 교수님 이름 구하기
        System.out.println(teacher);

        teacher = m.getTeacher();           // 추상 메서드를 오버라이딩한 메서드를 호출해서 담당 선생님 이름 구하기
        System.out.println(teacher);

    }
}

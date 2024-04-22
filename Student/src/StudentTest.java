import java.util.concurrent.CountDownLatch;

public class StudentTest {
    public static void main(String[] args) {
        String sinsang = null;
        Person p1 = new Middle("이순신", 2, "남", 15);
        Person p2 = new College("홍길동", 3, 22, "여", 20);

        sinsang = ((Student) p1).getStudentInfo();  // 다운캐스팅 후, Student 클래스의 getStudentInfo() 메서드 호출
        System.out.println("학생 정보: " + sinsang);

        sinsang = ((Student) p2).getStudentInfo();
        System.out.println("학생 정보: " + sinsang);

        sinsang = ((College) p2).getStudentInfo();
        System.out.println("학생 정보: " + sinsang);

//        Middle m = new Middle("이순신", 3, 80);
//        College c = new College("홍길동", 2, 24, 'B');
//
//        c.calcScore(c);     // Student s = new College("홍길동", 2, 24); 메서드 호출 시 자식 클래스 인스턴스가 업캐스팅되어 전달
//        m.calcScore(m);     // Student s = new Middle("이순신", 3);


//        sinsang = m.getStudentInfo();
//        System.out.println("\n학생 정보");
//        System.out.println("------------");
//        System.out.println(sinsang);
//
//        System.out.println();
//        sinsang = c.getStudentInfo();   // 메서드 호출 시 오버라이딩한 getStudentInfo() 메서드가 호출
//        System.out.println("학생 정보");
//        System.out.println("------------");
//        System.out.println(sinsang);




//        College c1 = new College("홍길동", 3, 22);
//        College c2 = new College();

//        System.out.println();
//        sinsang = c1.getStudentInfo();
//        System.out.println("학생 정보");
//        System.out.println("--------------");
//        System.out.println(sinsang + ", 수강 학점: " + c1.getCourses() + "점");
//
//        System.out.println();
//        sinsang = c2.getStudentInfo();
//        System.out.println("학생 정보");
//        System.out.println("--------------");
//        System.out.println(sinsang + ", 수강 학점: " + c2.getCourses() + "점");

    }
}

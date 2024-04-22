import java.util.concurrent.CountDownLatch;

public class StudentTest {
    public static void main(String[] args) {
        String sinsang = null;
        Middle m = new Middle("이순신", 2);
        College c = new College("홍길동", 3, 20);

        sinsang = m.getStudentInfo();
        System.out.println("\n학생 정보");
        System.out.println("------------");
        System.out.println(sinsang);

        System.out.println();
        sinsang = c.getStudentInfo();   // 메서드 호출 시 오버라이딩한 getStudentInfo() 메서드가 호출
        System.out.println("학생 정보");
        System.out.println("------------");
        System.out.println(sinsang);




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

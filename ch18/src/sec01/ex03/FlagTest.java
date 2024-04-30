package sec01.ex03;

public class FlagTest {
    public static void main(String[] args) {
        White white = new White();      // 인터페이스를 구현한 클래스 객체 생성
        Blue blue = new Blue();

        Thread t = new Thread(white);
        Thread t2 = new Thread(blue);

        t.start();  // 참조 변수로 start() 메서드 호출해서 스레드 실행
        t2.start();
    }
}

package sec01.ex02;

public class FlagTest {
    public static void main(String[] args) {
        White white = new White();
        Blue blue = new Blue();
        white.start();      // start 메서드를 호출해서 스레드 생성
        blue.start();
    }
}

package sec01.ex01;

public class FlagTest {
    public static void main(String[] args) {
        White white = new White();
        Blue blue = new Blue();
        white.whiteFlag();  // CPU는 순차적으로 코드를 실행하므로 첫 번째 호출한 메서드의 while 구문만 무한 반복함
        blue.blueFlag();
    }
}

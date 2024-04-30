package sec01.ex05;

// 우선 순위 지정하지 않고 스레드 생성 후 실행
public class HorseRaceTest1 {
    public static void main(String[] args) {
        Thread horse = null;
        for (int i = 0; i < 10; i++) {
            horse = new Horse(i);
        }
        horse.start();
        System.out.println("메인 스레드 종료");

    }
}

package sec01.ex05;

// 우선 순위 지정하지 않고 스레드 생성 후 실행
public class HorseRaceTest2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread horse = new Horse(i);
            horse.start();

            if (i == 9) {
                horse.setPriority(Thread.MAX_PRIORITY);  // 9번 경마의 우선 순위를 가장 높게 설정
            }
        }

        System.out.println("메인 스레드 종료");
    }
}

package sec01.ex06;

public class DaemonThreadTest3 {
    public static void main(String[] args) {
        Thread horse1 = new Horse(1);
        horse1.setDaemon(true);
        horse1.start();

        Thread horse2 = new Horse(2);
        horse2.setDaemon(false);     // 2번 경마는 일반 스레드로 동작

        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        horse2.start();
        System.out.println("메인 스레드 종료");
    }
}

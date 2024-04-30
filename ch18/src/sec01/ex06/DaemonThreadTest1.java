package sec01.ex06;

public class DaemonThreadTest1 {
    public static void main(String[] args) {
        Thread horse1 = new Horse(1);
        horse1.setDaemon(false);  // 일반 스레드로 설정
        horse1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        System.out.println("메인 스레드 종료");
    }
}

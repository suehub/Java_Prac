package sec01.ex06;

public class DaemonThreadTest2 {
    public static void main(String[] args) {
        Thread horse1 = new Horse(1);
        horse1.setDaemon(true);
        horse1.start();

        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        System.out.println("메인 스레드 종료");
    }
}

package sec02.ex05;

public class InterruptMethodTest1 {
    public static void main(String[] args) throws InterruptedException{
        VideoThread videoThread = new VideoThread();
        videoThread.start();

        System.out.println("videoThread 상태: " + videoThread.getState());    // RUNNABLE

        videoThread.interrupt();    // 메서드 호출 후 실제 예외 발생까지 시간이 걸림
        System.out.println("videoThread 상태: " + videoThread.getState());    // TIME_WAITING

        Thread.sleep(1000);

        System.out.println("videoThread 상태: " + videoThread.getState());    // TERMINATED

        System.out.println("메인 스레드 종료");
    }
}

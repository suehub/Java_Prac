package sec02.ex06;


public class InterruptMethodTest2 {
    public static void main(String[] args) {
        VideoThread videoThread = new VideoThread();
        videoThread.start();

        System.out.println("videoThread 상태: " + videoThread.getState());    // RUNNABLE

        videoThread.interrupt();    // 메서드 호출 후 실제 예외 발생까지 시간이 걸림
        System.out.println("videoThread 상태: " + videoThread.getState());    // TIME_WAITING

        System.out.println("videoThread 상태: " + videoThread.getState());    // TERMINATED

        System.out.println("메인 스레드 종료");
    }
}

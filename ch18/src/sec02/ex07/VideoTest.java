package sec02.ex07;

public class VideoTest {
    public static void main(String[] args) {
        VideoThread videoThread = new VideoThread();
        videoThread.start();

        System.out.println("videoThread 상태: " + videoThread.getState());

        for (int i = 0; i < 10; i++) {} // 시간 지연시킴
        videoThread.setStopped(true);   // Video 스레드 종료

        System.out.println("메인 스레드 종료");
    }
}

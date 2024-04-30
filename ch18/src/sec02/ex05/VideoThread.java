package sec02.ex05;

public class VideoThread extends Thread {
    public VideoThread() {}

    public void run() {
        try {
            while (true) {
                System.out.println("동영상을 재생합니다.");
                Thread.sleep(1);    // 1/1000초 동안 스레드 일시 정지 상태로 만듦
            }
        } catch (InterruptedException e) {
            System.out.println("interrupt() 호출에 의한 동영상 종료");     // interrupt() 메서드 호출 시 발생하는 예외 처리
        }
    }
}

package sec02.ex06;

public class VideoThread  extends Thread{
    public VideoThread() {}

    public void run(){
        System.out.println("동영상을 재생합니다.");
        while (true) {
            if (Thread.interrupted()) { // interrupt() 메서드 호출 여부 확인
                System.out.println("동영상 재생 강제 종료");
                break;
            }
        }
    }
}

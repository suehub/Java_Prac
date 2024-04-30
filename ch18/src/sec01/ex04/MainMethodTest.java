package sec01.ex04;

public class MainMethodTest {
    public static void main(String[] args) {
        Thread curThread = Thread.currentThread();  // 현재 실행 중인 스레드 객체 얻음
        System.out.println("현재 실행 중인 스레드 객체 이름: " + curThread.getName());   // 현재 실행 중인 스레드 객체 이름 얻음
        System.out.println("실행 중인 스레드 수: " + Thread.activeCount());           // 스레드풀에서 실행 중인 스레드 수 얻음
    }
}

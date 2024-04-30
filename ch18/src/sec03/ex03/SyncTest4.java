package sec03.ex03;

public class SyncTest4 {
    Object objKey = new Object();   // 동기화 블록의 락으로 사용됨

    Thread t1 = new Thread("thread1") {
        public void run() {
            method1();
        }
    };

    Thread t2 = new Thread("thread2") {
        public void run() {
            method2();
        }
    };

    public synchronized void method1() {
        System.out.println("\n method1() 메서드");
        System.out.println("실행 스레드: " + Thread.currentThread().getName());
        System.out.println("thread1: " + t1.getState());
        System.out.println("thread2: " + t2.getState());
        for(long j = 0; j < 100000000000L; j++) {}
    }

    public void method2() {
        synchronized (objKey) {     // 다른 객체로 동기화 블록의 락 지정
            System.out.println("method2() 메서드");
            System.out.println("실행 스레드: " + Thread.currentThread().getName());
            System.out.println("thread1: " + t1.getState());
            System.out.println("thread2: " + t2.getState());
            for (long j = 0; j < 100000000000L; j++) {
            }
        }
    }

    void startAll() {
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        SyncTest4 st = new SyncTest4();
        st.startAll();
    }
}

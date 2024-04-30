package sec03.ex03;

public class SyncTest2 {
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

    Thread t3 = new Thread("thread3") {
        public void run() {
            method3();
        }
    };

    public synchronized void method1() {
        System.out.println("method1() 메서드");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}

        System.out.println("실행 스레드: " + Thread.currentThread().getName());
        System.out.println("thread1: " + t1.getState());
        System.out.println("thread2: " + t2.getState());
        System.out.println("thread3: " + t3.getState());
        for(long j = 0; j < 100000000000L; j++) {}
    }

    public synchronized void method2() {
        System.out.println("method2() 메서드");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}

        System.out.println("실행 스레드: " + Thread.currentThread().getName());
        System.out.println("thread1: " + t1.getState());
        System.out.println("thread2: " + t2.getState());
        System.out.println("thread3: " + t3.getState());
        for(long j = 0; j < 100000000000L; j++) {}
    }

    public void method3() {   // 동기화되지 않음
        System.out.println("method3() 메서드");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}

        System.out.println("실행 스레드: " + Thread.currentThread().getName());
        System.out.println("thread1: " + t1.getState());
        System.out.println("thread2: " + t2.getState());
        System.out.println("thread3: " + t3.getState());
        for(long j = 0; j < 100000000000L; j++) {}
    }

    void startAll() {
        t1.start();
        t2.start();
        t3.start();
    }

    public static void main(String[] args) {
        SyncTest2 st = new SyncTest2();
        st.startAll();
    }
}

package sec03.ex03;

public class SyncTest3 {
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

    public void method3() {   // 동기화 블록 지정해서 사용
        System.out.println("\n method3() 메서드의 동기화 블록 외부");
        synchronized (this) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
            System.out.println("\n method3() 메서드의 동기화 블록 내부");

            System.out.println("실행 스레드: " + Thread.currentThread().getName());
            System.out.println("thread1: " + t1.getState());
            System.out.println("thread2: " + t2.getState());
            System.out.println("thread3: " + t3.getState());

            for(long j = 0; j < 100000000000L; j++) {}
        }

    }

    void startAll() {
        t1.start();
        t2.start();
        t3.start();
    }

    public static void main(String[] args) {
        SyncTest3 st = new SyncTest3();
        st.startAll();
    }
}

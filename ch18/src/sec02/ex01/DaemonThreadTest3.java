package sec02.ex01;

public class DaemonThreadTest3 {
    public static void main(String[] args) {
        Thread.State state;
        Thread thread = new Thread() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    if(i > 100000) {
                        break;
                    }
                    i++;
                }
            }
        };

        state = thread.getState();  // NEW
        System.out.println("스레드 상태: " + state);

        thread.start();
        state = thread.getState();   // RUNNABLE
        System.out.println("스레드 상태: " + state);

        thread.interrupt();
        try {Thread.sleep(100);} catch (InterruptedException e){}

        state = thread.getState();  // TERMINATED
        System.out.println("스레드 상태: " + state);

        System.out.println("메인 스레드 종료");

    }

}

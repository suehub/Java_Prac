package sec01.ex03;

public class FlagTest2 {
    public static void main(String[] args) {
        White white = new White();
        Blue blue = new Blue();

        Thread t = new Thread(white);
        Thread t2 = new Thread(blue);
        t.start();
        t2.start();

        Thread thread = new Thread() {      // Thread 클래스를 상속받는 익명 클래스를 이용해서 run() 메서드 오버라이딩하여 스레드 구현
            @Override
            public void run() {
                for (int i = 0; i < 10000000; i++) {
                    System.out.println("파일 업로드 중");
                }
            }
        };
        thread.start();
    }
}

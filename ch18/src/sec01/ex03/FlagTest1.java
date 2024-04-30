package sec01.ex03;

import java.util.TreeMap;

public class FlagTest1 {
    public static void main(String[] args) {
        White white = new White();
        Blue  blue = new Blue();

        Thread t = new Thread(white);
        Thread t2 = new Thread(blue);
        t.start();
        t2.start();

        new Thread(new Runnable() {     // Runnable 인터페이스를 익명 스레드 객체로 구현해서 스레드로 사용
            @Override
            public void run() {
                for(int i=0; i<10000000; i++) {
                    System.out.println("파일 업로드 중");
                }
            }
        }).start();
    }
}

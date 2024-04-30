package sec01.ex02;

public class Blue extends Thread{   // Thread 클래스 상속받음
    @Override
    public void run() {
        while (true){
            System.out.println("청기 올려~");
        }
    }

}

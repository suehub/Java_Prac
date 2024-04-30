package sec01.ex03;

public class Blue implements Runnable{   // Thread 클래스 상속받음
    @Override
    public void run() {
        while (true){
            System.out.println("청기 올려~");
        }
    }

}

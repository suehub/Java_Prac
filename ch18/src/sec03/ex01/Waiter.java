package sec03.ex01;

public class Waiter extends Thread{
    Food food;

    public Waiter(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            food.receiveOrder();    // 주문받는 메서드 호출
        }
    }
}

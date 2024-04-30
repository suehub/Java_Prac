package sec03.ex04;

public class Waiter extends Thread{
    Food food;

    public Waiter(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            food.receiveOrder(this);
        }
    }
}

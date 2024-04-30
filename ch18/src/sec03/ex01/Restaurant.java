package sec03.ex01;

public class Restaurant {
    public static void main(String[] args) {
        Food food = new Food();
        Waiter waiter = new Waiter(food);
        waiter.setName("웨이터 스레드");

        Chef chef = new Chef(food);
        chef.setName("주방장 스레드");
        waiter.start();
        chef.start();
    }
}

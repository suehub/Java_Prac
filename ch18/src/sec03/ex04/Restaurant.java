package sec03.ex04;

public class Restaurant {
    public static void main(String[] args) {
        // 두 스레드 교대로 실행
        Food food = new Food();
        Waiter waiter = new Waiter(food);
        waiter.setName("웨이터");

        Chef chef1 = new Chef(food);
        chef1.setName("한식 주방장");

        Chef chef2 = new Chef(food);
        chef2.setName("중식 주방장");

        waiter.start();
        chef1.start();
        chef2.start();

    }
}

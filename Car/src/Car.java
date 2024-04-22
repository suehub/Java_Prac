public class Car {
    protected String carName;
    protected String carNumber;
    protected String carColor;
    protected int carSize;
    protected int velocity;

    public Car() {
        System.out.println("Car 생성자 호출");
    }

    public void speedUp(int speed) {
        velocity += speed;
    }

    public void speedDown(int speed) {
        velocity -= speed;
    }

    public void stop() {
        velocity = 0;
    }

    public void park() {}

    public String getCarInfo() {
        return "차 이름: " + carName + ", 차 번호: " + carNumber + ", 차 색상: " + carColor + ", 속도: " + velocity + "km/h, 차 크기: " + carSize + "cc";
    }
}

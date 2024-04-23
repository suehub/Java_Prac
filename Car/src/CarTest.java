public class CarTest {
    public static void main(String[] args) {

        Truck t = new Truck();
        Car c = new SportsCar();    // 인터페이스ㅡ 타입은 업캐스팅으로 사용 가능

        System.out.println("모든 차의 안전 속도: " + Car.SAFE_SEEPD);   // 상수는 인터페이스 이름과 도트(.)를 이용해서 접근

        t.speedUp();
        t.speedDown();
        t.stop();

        c.speedUp();
        c.speedDown();
        c.stop();

        SportsCar s = (SportsCar)c; // 다운캐스팅 후 구현 클래스의 메서드 접근 가능
        s.turbo();

    }
}

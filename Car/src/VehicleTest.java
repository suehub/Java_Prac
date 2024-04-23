public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        Truck truck = vehicle.getTruck();
        truck.speedUp();
        truck.speedDown();
        truck.stop();

        Car car1 = vehicle.getTruck();      // 인터페이스 타입으로 받음
        car1.speedUp();
        car1.speedDown();
        car1.stop();

        Car car2 = vehicle.getSportCar();   // 업캐스팅한 인터페이스 타입으로 받음
        car2.speedUp();
        car2.speedDown();
        car2.stop();

        SportsCar sportsCar = (SportsCar) vehicle.getSportCar();    // 리턴값을 다운캐스팅 후 자식 클래스의 메서드에 접근함
        sportsCar.turbo();
    }
}

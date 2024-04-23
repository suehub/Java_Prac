public class DriverTest {
    public static void main(String[] args) {
        Driver driver1 = new Driver(new Truck());     // 생성자 호출 시 Car car = new Truck();로 업캐스팅됨
        driver1.drive();

        driver1.speedUp(new Truck());                   // 생성자 호출 시 Car car = new Truck();로 업캐스팅됨

        Driver driver2 = new Driver(new SportsCar());   // 생성자 호출 시 Car car = new SportsCar(); 로 업캐스팅됨
        driver2.drive();

        SportsCar sportsCar = new SportsCar();
        driver2.speedUp(sportsCar);                      // 메서드 호출 시 Car car = new SportsCar();로 업캐스팅됨
    }
}

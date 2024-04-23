public class Vehicle {
    // 인터페이스를 메서드의 리턴 타임으로 사용
    public Truck getTruck() {
        Truck truck = new Truck();
        return truck;
    }

    public Car getSportCar() {
        SportsCar sportsCar = new SportsCar();  // SportsCar 인스턴스를 업캐스팅 후 리턴
        return sportsCar;
    }
}

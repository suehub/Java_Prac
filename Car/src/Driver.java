public class Driver {
    private Car car;    // 인터페이스 타입 참조 변수가 필드로 사용됨

    public Driver(Car car) {
        this.car = car;
    }

    public void drive() {
        car.speedUp();
        car.speedDown();
        car.stop();
    }

    public void truckDrive() {
        Car car = new Truck();      // 메서드의 지역변수에서 업캐스팅으로 사용됨
        car.speedUp();
        car.speedDown();
        car.stop();
    }

    public void speedUp(Car car) {  //  메서드의 매겨변수에서 업캐스팅으로 사용됨
        if(car instanceof Truck) {  // instanceof 연산자로 업캐스팅된 객체 타입을 판별함
            Truck truck = (Truck) car;
            truck.speedUp();
        } else if (car instanceof SportsCar) {
            SportsCar sportsCar = (SportsCar) car;
            sportsCar.speedUp();
        }
    }
}


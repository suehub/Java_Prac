public class CarTest {
    public static void main(String[] args) {

        // 1. 변수 선언
        Sedan myCar = null;
        Truck truck = null;
        Bus bus = null;

        // 2. 인스턴스 생성
        myCar = new Sedan("아반떼", "111가 111", "은색", 60, 2000);
        truck = new Truck("1톤 포터", "222나 222", "청색", 3000, 60, 1);
        bus = new Bus("1001번 버스", "333다 333", "노란색", 4000, 60, 20, 1000);

        // 3. 메서드 호출
        System.out.println(myCar.getCarInfo());
        System.out.println(truck.getCarInfo() + ", 적재량: " + truck.getLoad() + "톤");
        System.out.println();

        truck.speedUp(10);
        truck.carryload();

        // 트럭과 버스 정보 출력
        System.out.println(myCar.getCarInfo() + ", 적재량: " + truck.getLoad() + "톤");
        System.out.println(bus.getCarInfo() + ", 승객 수: " + bus.getPassenger() + "명, 승차 요금: " + bus.getFee() + "원");

        bus.ridePassenger(3);
        System.out.println(bus.getCarInfo() + ", 승객 수: " + bus.getPassenger() + "명, 승차 요금: " + bus.getFee() + "원");
    }
}

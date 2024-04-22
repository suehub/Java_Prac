public class Truck extends Car{
    private int load;   // 적재화물량

    public Truck(String carName, String carNumber, String carColor, int carSize, int velocity, int load) {
        System.out.println("Truck 클래스 생성자 호출");
        super.carName = carName;
        super.carNumber = carNumber;
        super.carColor = carColor;
        super.carSize = carSize;
        super.velocity = velocity;
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    // 화물 운반 메서드
    public void carryload() {
        if (load > 0) {
            load++;
        } else {
            load = 0;
        }
    }
}

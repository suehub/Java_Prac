public class Bus extends Car {
    private int passenger;  // 버스 승객수
    private int fee;

    public Bus(String carName, String carNumber, String carColor, int carSize, int velocity, int passenger, int fee) {
        System.out.println("Bus 클래스 생성자 호출");
        super.carName = carName;
        super.carNumber = carNumber;
        super.carColor = carColor;
        super.carSize = carSize;
        super.velocity = velocity;
        this.passenger = passenger;
        this.fee = passenger * fee;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    // 승객 태우는 메서드
    public void ridePassenger() {
        if (passenger > 0) {
            passenger++;
            fee += 1000;
        }
    }

    void ridePassenger(int passengers) {
        if (passenger > 0) {
            passenger += passengers;
            fee += 1000 * passenger;
        }
    }
}

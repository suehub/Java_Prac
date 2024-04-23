public class Truck implements Car{
    @Override
    public void speedUp() {
        System.out.println("Truck speeds up");
    }

    @Override
    public void speedDown() {
        System.out.println("Truck speeds down");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop");
    }
}

public class SportsCar implements Car{
    @Override
    public void speedUp() {
        System.out.println("SportsCar speedUp");
    }

    @Override
    public void speedDown() {
        System.out.println("SportsCar speedDown");
    }

    @Override
    public void stop() {
        System.out.println("SportsCar stop");
    }

    public void turbo() {
        System.out.println("SportsCar turbo");     // 자신만의 기능
    }
}

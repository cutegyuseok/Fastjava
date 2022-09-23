public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getinstance();
        Car mycar = factory.createCar();
        Car mcar = factory.createCar();

        System.out.println(mycar.getCarNum());
        System.out.println(mcar.getCarNum());
    }
}

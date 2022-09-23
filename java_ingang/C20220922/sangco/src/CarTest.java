public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mycar = factory.creatCar();
        System.out.println(mycar.getCarNum());
    }

}

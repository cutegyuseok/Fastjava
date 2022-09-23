public class CarFactory {
    private static int carNum = 10000;
    private static CarFactory instance = new CarFactory();
    private CarFactory() {}

    public static CarFactory getinstance() {
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }
    public static Car createCar() {
        carNum++;
        return new Car(carNum);
    }
}


public class CarFactory {
        static CarFactory Instance = new CarFactory();
        private int carNum = 1000;


    public static CarFactory getInstance() {
        if( Instance == null){
            Instance = new CarFactory();
        }
        return Instance;
    }
    public Car creatCar(){
        carNum++;
        return new Car(carNum);
    }
}

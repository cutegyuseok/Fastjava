public class Car {
    private int serialNum ;
    private int carNum;

    public Car(int serialNum) {
        this.serialNum = serialNum;
    }
    //my car (carnum == this.serianum)
    public int getCarNum(){
        return this.serialNum;
    }

}
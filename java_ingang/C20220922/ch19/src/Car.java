
public class Car {
    private int carSerialNum;
    //static => 여러개의 인스턴스가 하나의 메모리를 공유한다.
    private int carNum;


    public Car(int carSerialNum) {
        this.carSerialNum = carSerialNum;
        // 모두가 공유하는 static 변수의 값을 인스턴스 객체의 메모리에 각각 할당
    }


    public int getCarNum() {

        return this.carSerialNum;
    }

}
public class CarTest {

    public static void main(String[] args) {
        // getInstance()메서드가 정적 메서드 이므로 클래스명.정적 메스드명으로 인스턴스 생성
        CarFactory factory = CarFactory.getInstance();  //싱글톤 패턴
        Car mySonata = factory.createCar();  //메서드에서 Car 생성
        Car yourSonata = factory.createCar();
        Car Sonata1 = factory.createCar();

        System.out.println(mySonata.getCarNum());     //10001 출력
        System.out.println(yourSonata.getCarNum());   //10002 출력
        System.out.println(Sonata1.getCarNum());
    }
}
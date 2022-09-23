public class CarFactory {
    private static CarFactory instance = new CarFactory();
        //  CarFactory 클래스 내부에서 유일한 인스턴스를 private으로 생성

        private static int carNum = 10000;

        private CarFactory() {}
        // 기본 생성자 접근 제한


        // 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드 제공
        // static을 사용 -> 외부에서 클래스 이름으로 메서드를 호출해서 사용가능해짐
        public static CarFactory getInstance() {
            if( instance == null) {
                instance = new CarFactory();
            }
            return instance;
        }

        public Car createCar() { // 자동차 객체 생성 메서드
            carNum++;
            return new Car(carNum);
            // 새로운 차를 생성하는 createCar()메서드를 구현
        }
    }




// public static Company getUnstance() {
//  if( instance == null){
//      instance = new Company();
// return instance;
// } }
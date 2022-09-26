public abstract class Computer {

    public abstract void display();
    public abstract void typing();
    //추상 메서드;
    //상속받을 애들이 알아서 구현해라!

    public void turnOn() {
        System.out.println("전원을 켭니다");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다");
    }



}

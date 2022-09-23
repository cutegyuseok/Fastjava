public class Taxi {
    String taxi ;
    int money;

    public Taxi(String taxi){
        this.taxi = taxi;
    }
    public void take(int money){
        this.money += money;
    }
    public void show_TaxiInfo(){
        System.out.println(taxi+"의 수익은 "+money+"입니다.");
    }
}

public class Bus {
    int bus_Number;
    int money;
    int bus_Passenger;

    public Bus(int bus_Number){
        this.bus_Number = bus_Number;
    }
    public void pay(int money){
        this.money += money;
        bus_Passenger++;
    }
    public void show_Bus_info(){
        System.out.println(bus_Number+"번의 버스 승객은 "+bus_Passenger+"명 이고 버스의 수익은 "+money+"원 입니다.");
    }
}


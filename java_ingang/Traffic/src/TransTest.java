public class TransTest {
    public static void main(String[] args) {
        Student Lee = new Student("Lee" ,10000);
        Student Lim = new Student("Lim", 6000);

        Bus bus1241 = new Bus(1241);
        Bus bus5001 = new Bus(5001);
        Subway sub2 = new Subway(2);

        Lee.take_bus(bus1241);
        Lim.take_subway(sub2);

        Lee.showInfo();
        Lim.showInfo();
        sub2.show_Subway_Info();
        bus1241.show_Bus_info();
    }
}

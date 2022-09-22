public class Student {
    String student_name;
    int money1;

    public Student(String student_name,int student_money){
        this.money1 = student_money;
        this.student_name = student_name;
    }
    public  void  take_bus(Bus  bus){
        bus.pay(1000);
        this.money1 -= 1000;
    }
    public  void  take_subway(Subway subway){
        subway.take(700);
        this.money1 -= 700;
    }
    public void showInfo(){
        System.out.println(student_name+"님의 잔돈은 "+money1+"원 입니다");
    }
}

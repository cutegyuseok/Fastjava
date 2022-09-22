public class Subway {
    int subwayNum;
    int subwayPassenger;
    int money;

    public Subway(int subwayNum) {
        this.subwayNum = subwayNum;
    }
    public void take(int money){
        this.money += money;
        subwayPassenger ++;
    }
    public void show_Subway_Info(){
        System.out.println(subwayNum+"호선의 승객은 "+subwayPassenger+"명이고 수익은 "+money+"원 입니다.");
    }

}

public class baedalCalss {
    public int order_num;
    public int phone_num;
    public String adress;
    public int date;
    public int time;
    public int price;
    public int menu_num;

    public baedalCalss(int order_num,int phone_num, String adress, int date,int time,int price,int menu_num){
        this.order_num = order_num;
        this.phone_num = phone_num;
        this.adress = adress;
        this. date = date;
        this.time = time;
        this.price = price;
        this.menu_num = menu_num;
    }
    public String order_info(){
        return "주문번호: "+order_num+"\n전화번호: "+phone_num+"\n주소: "+adress+"\n날짜: "+ date + "\n시간: "+time+"\n메뉴번호: "+menu_num;
    }
}

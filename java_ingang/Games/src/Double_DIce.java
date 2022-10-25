public class Double_DIce {
    public static void main(String[] args) {
        int dice1=0;
        int dice2=0;
        boolean status = false;
        while (!status){
            int num = (int) (Math.random() * 10);
            if (num < 7 && num > 0) {
                dice1 = num;
                status =true;
            }
        }
        status =false;
        while (!status){
            int num = (int) (Math.random() * 10);
            if (num < 7 && num > 0) {
                dice2 = num;
                status =true;
            }
        }
        System.out.println("당신의 주사위는 "+dice1+","+dice2+"입니다.");
    }
}

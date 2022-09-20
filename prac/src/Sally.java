import java.util.Scanner;
public class Sally {
    public static void main(String[] args){
        int price = 1250000;
        int pay ;
        int change;
        Scanner scan = new Scanner(System.in);
        System.out.println("얼마 내셨나요?");
        pay = scan.nextInt();
        change = Math.abs(price - pay);
        System.out.println(change);
        if (pay >=1250000) {
            System.out.println("잔돈은"+change+"원 입니다");
        }
        else{
            System.out.println(change+"원 더 내세요!");
        }
    }
}

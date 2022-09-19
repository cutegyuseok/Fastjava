import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount = 0.0;
        Scanner input = new Scanner (System.in);
        System.out.print("당신의 키를 적어주세요 ");
        amount = input.nextInt();
        if (amount <= 177.0){
            System.out.println("이규석 보다 작은 난쟁이 이군요");
        }
        else
        System.out.println("이규석 보다 큰 멀대 시군요");
    }
}
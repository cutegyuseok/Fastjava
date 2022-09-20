import java.util.Scanner;

public class charges {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("당신의 나이를 적어주세요 ");
        int age = input.nextInt();
        int charge ;
        if(age < 8){
            charge = 0;
        } else if (age <14) {
            charge = 800;
        } else if (age <20){
            charge = 1500;
        } else if (age >65) {
            charge = 0;
        } else {
            charge = 2000;
        }
        System.out.println("당신의 입장료는 "+charge+"원 입니다");
    }
}

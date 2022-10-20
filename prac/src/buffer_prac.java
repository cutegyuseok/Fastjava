import java.util.Scanner;

public class buffer_prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력하세요.");
        int n = sc.nextInt();
        for (int i=1;i<10;i++){
            System.out.println(Math.pow(7,i));
        }
    }
}
import java.util.Scanner;
public class Pibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int j = s.nextInt();
        int num1, num2, sum;
        num1 = 0;
        num2 = 1;
        sum = 1;
        for (int i = 0; i < j; i++) {
            System.out.print(sum + " ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
import java.util.Scanner;

public class whileprac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        do {
            sum += num;
            num ++;
        }
        while (num<=50);
        System.out.println(sum);
        System.out.println(num);
    }
}

import java.util.Scanner;

public class forprac {
    public static void main(String[] args){
        int i;
        int total=0;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(i=1; i<=num; i++){
            total +=i;
        }
        System.out.println(total);
    }
}

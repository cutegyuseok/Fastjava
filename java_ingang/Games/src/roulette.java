import java.util.Scanner;

public class roulette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input Number");
        int range = sc.nextInt();
        boolean status = false;
        while (!status) {
            int Winner = (int)(Math.random()*10);
            if(Winner>=1&&Winner<=range){
                System.out.println("Winner is "+Winner);
                status = true;
            }
        }
    }
}

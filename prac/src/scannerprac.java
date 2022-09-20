import java.util.Scanner;

public class scannerprac {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        double height;
        System.out.print("이름");
        name = scan.next();
        System.out.print("나이");
        age = scan.nextInt();
        System.out.print("키");
        height = scan.nextDouble();
        System.out.println(name+"은 "+age+"살이고, 키는 "+height+"cm이다." );
    }
}

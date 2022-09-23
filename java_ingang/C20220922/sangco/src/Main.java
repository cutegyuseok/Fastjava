import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("input A");
        int lineA = sc.nextInt();
        System.out.println("input B");
        int lineB = sc.nextInt();

        Print p1 = new Print();
        p1.line = "====";
        p1.lineA = lineA;
        p1.lineB = lineB;

        Print p2 = new Print();
        p2.line = "****";
        p2.lineA = lineA;
        p2.lineB = lineB;

        Print p3 = new Print();
        p3.line = "****";
        p3.lineA = lineA;
        p3.lineB = lineB;

        p1.A();
        p2.A();
        p1.B();
        p2.B();
    }
}
//p1 , p2 는 객체
// Print.java 는 클래스
// 인스턴스 new 를 통해 힙 메모리를 할당받은 객체
// 멤버변수 는 lineA , lineB , line
// 매서드 는 A() , B()

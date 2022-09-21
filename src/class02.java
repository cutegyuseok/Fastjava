public class class02 {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        System.out.println(num3);
        num2 = (int) num3;
        System.out.println(num3);
        System.out.println(num2);

        int result = num1 - num2;
        System.out.println(result);
    }
}
// 문자열 + 정수
// 정수가 문자열에 결합되기 위해 변환됨
// "a" + 1 == "a" + "1" == "a1"


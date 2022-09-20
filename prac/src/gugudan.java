public class gugudan {
    public static void main(String[] args) {
        int i;
        int num;
        int result;
        for (i = 1; i < 10; i++) {
            for (num = 1; num < 10; num++) {
                result = i * num;
                System.out.println(i + " X " + num + " = " + result);
            }
            System.out.println();
        }
        i = 1;
        num = 1;
        while (i < 10) {

            while (num < 10) {

                System.out.println(i + " X " + num + " = " + i * num);
                num++;
            }
            i++;
            System.out.println();
        }
    }
}

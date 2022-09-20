public class gugudanStop {
    public static void main(String[] args) {
        int i;
        int num;
        int result;
        for (i = 1; i < 10; i++) {
            for (num = 1; num < 10; num++) {
                result = i * num;
                if(result >= 50) break;
                System.out.println(i + " X " + num + " = " + result);
            }
            System.out.println();
        }
    }
}

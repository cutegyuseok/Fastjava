public class coutinuePrac {
        public static void main(String[] args) {
            int i;
            int num;
            int result;
            for (i = 1; i < 10; i++) {
                if (i % 2 != 0 ) continue;
                for (num = 1; num < 10; num++) {
                    result = i * num;
                    System.out.println(i + " X " + num + " = " + result);
                }
                System.out.println();
            }
        }
    }

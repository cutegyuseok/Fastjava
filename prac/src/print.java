public class print {
    public static void main(String[] args){
        System.out.println("Hello_World");

        //주석 : 프로그램에 영향을 주지 않음
        /* 다중행
        *주
        * 석
        * 입니다
         */
        System.out.println("Hello Java World");
        System.out.println("1");
        System.out.print("2");
        System.out.printf("3");
        System.out.println();

        int i = 10;
        float f = 12.34f;
        double d = 56.78;
        char c = 'a';
        String s = "Hello";
        boolean b = true;
        //지시자 다시공부

        System.out.printf("%d\n", i);
        System.out.printf("%10d\n", i);
        System.out.printf("%-10d\n", i);
        System.out.printf("%010d\n", i);
        System.out.printf("o\n", i);
        System.out.printf("%x\n", i);
        System.out.printf("%X\n", i);
        System.out.printf("%n", i);
        System.out.println();

        //float
        System.out.printf("%f\n", f);
        System.out.printf("%.2f\n", f);
        System.out.printf("%.8f\n", f);
        System.out.printf("%-5.2f\n", f);
        System.out.printf("%e\n", f);
        System.out.printf("%E\n", f);
        System.out.printf("%30.3e\n", f);
        System.out.printf("%30.3E\n", f);
        System.out.println();

        // double
        System.out.printf("%f\n", d);
        System.out.printf("%.2f\n", d);
        System.out.printf("%f\n", d);
        System.out.printf("%f\n", d);
        System.out.printf("%f\n", d);
        System.out.printf("%f\n", d);


    }

}



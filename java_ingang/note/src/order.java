public class order {

    public static int addNum(int num, int num2){
        int result;
        result = num + num2;
        return result;
    }
    public static void printHello(String greeting){
        System.out.println(greeting);
    }
    public static int calcSum(){
        int sum = 0;
        int i;
        for(i = 0; i <=100; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int total = addNum(n1, n2);
        System.out.println(total);

        printHello("안녕하세용");

        total = calcSum();
        System.out.println(total);

    }
}

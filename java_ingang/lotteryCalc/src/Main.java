

public class Main {
    static int[] arr = new int[6];
    public static void main(String[] args) {



        int count = 0;
        boolean status = false;
        while(!status) {
            int j=0;
            arr = new int[6];
            for (int i = 0; i < 6; i++) {
                int num = (int) (Math.random() * 100);
                if (num < 46 && num > 0 && overlap(num)) {
                    arr[j] = num;
                    j++;
                } else {
                    i--;
                }
            }
            count++;
            status = victory(arr);
        }
        for ( int a : arr) {
            System.out.println(a);
        }
        System.out.println(count);
        System.out.println("당신은 "+count*1000+"원을 쓰셨습니다.");
    }

    static boolean overlap(int num){
        boolean check = true;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==num){
                check =false;
            }
        }
        return check;
    }

    static boolean victory(int[] result){
        int grade =0;
        int[] VictoryNum ={7,16,24,27,37,44}; //로또 번호
        for(int i =0;i<VictoryNum.length;i++){
            for(int a :result ){
                if(a == VictoryNum[i]){
                    grade++;
                }
            }
        }
        if (grade==6){
            return true;
        }else return false;
    }
}
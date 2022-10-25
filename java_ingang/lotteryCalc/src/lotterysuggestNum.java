

public class lotterysuggestNum {
    static int[] arr = new int[6];
    public static void main(String[] args) {
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
        System.out.print("당신의 로또 추첨 번호는 ");
        for ( int a : arr) {
            System.out.print(a+"번 ");
        }
        System.out.println("입니다.");
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
}
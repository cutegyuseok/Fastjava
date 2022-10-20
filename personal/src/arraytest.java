public class arraytest {
    public static void main(String[] args) {
        int num = 5;
        String[] arr = new String[num];
        arr[3] = "asd";
        String a = "asdasd";
        arr[3]+=a;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        int addNum = 5;
        num +=addNum;
        String[] newarr = new String[num];
        for (int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        arr = newarr;
        for (int i=0;i<newarr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

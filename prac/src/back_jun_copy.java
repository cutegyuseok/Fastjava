import java.io.*;
import java.util.StringTokenizer;

public class back_jun_copy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer b;
        for(int i=0;i<a;i++){
            b = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(b.nextToken()))+(Integer.parseInt(b.nextToken()))+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
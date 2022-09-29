import java.io.*;
import java.util.StringTokenizer;

public class backjun  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer c;
        for(int i=0;i<n;i++){
            c = new StringTokenizer((br.readLine()));
            int b =Integer.parseInt(c.nextToken());
            int d =Integer.parseInt(c.nextToken());
            int result = b+d;
            int num = i+1;
            bw.write("Case #"+i+": "+b+" + "+d+" = "+result+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int max = 0;
        int total = Integer.valueOf(br.readLine());
        String[] n = br.readLine().split(" ");
        
        for (int i = 0; i<total; i++) {
            if (Integer.valueOf(n[i]) > max) {
                max = Integer.valueOf(n[i]);
            }
            sum += Integer.valueOf(n[i]);
        }
        
        System.out.println(sum * 100.0 / max / total);
    }
}

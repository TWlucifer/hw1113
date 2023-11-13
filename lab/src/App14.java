import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App14 {
    public static void main(String[] args) throws Exception {
        System.out.println("輸入一個整數");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int num = Integer.parseInt(str);

        System.out.println("輸入數字為"+num);
    }
}

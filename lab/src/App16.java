import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App16 {
    public static void main(String[] args) throws Exception {
        System.out.println("輸入兩個整數");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int ans = Math  .max(num1, num2);

        System.out.println("輸入最大數字為"+ans);
    }
}

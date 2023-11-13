import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App15 {
    public static void main(String[] args) throws Exception {

        String str = "hello";
        char a = str.charAt(0);
        char b = str.charAt(1); 

        int num = str.length();

        System.out.println("第一個字為"+a);
        System.out.println("第二個字為"+b);
        System.out.println("文字數量為"+num);
    }
}

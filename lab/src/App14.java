import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App14 {
    public static void main(String[] args) throws Exception {
        System.out.println("��J�@�Ӿ��");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int num = Integer.parseInt(str);

        System.out.println("��J�Ʀr��"+num);
    }
}

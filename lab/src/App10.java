public class App10 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();
        
        car1.show();
    }
}

/**
 * car
 */
class car {
    private int num;
    private double gas;

    car(){
        num = 0;
        gas = 0.0;
        System.out.println("�Ͳ����l");
    }

    void show(){
        System.out.println("������"+num);
        System.out.println("�T�o�q��"+gas);
    }
}
public class App12 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();
        car1.show();

        car car2;
        car2 = new car(1234,20.5);
        car2.show();
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

    car(int n,double g){
        this();
        num = n;
        gas = g;
        System.out.println("�Ͳ�������"+num+"�T�o�q��"+gas+"����");
    }

    void show(){
        System.out.println("������"+num);
        System.out.println("�T�o�q��"+gas);
    }
}
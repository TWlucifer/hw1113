public class App13 {
    public static void main(String[] args) throws Exception {
        car.showSum();  //�����sclass

        car car1;
        car1 = new car(4567,60.2);
        car1.show();

        car.showSum();

        car car2;
        car2 = new car(1234,20.5);
        car2.show();
    }
}

/**
 * car
 */
class car {
    static int sum = 0;

    private int num;
    private double gas;

    car(){
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("�Ͳ����l");
    }

    car(int n,double g){
        this();
        num = n;
        gas = g;
        System.out.println("�Ͳ�������"+num+"�T�o�q��"+gas+"����");
    }

    static void showSum(){
        System.out.println("���l�`�@��"+sum+"�x");
    }

    void show(){
        System.out.println("������"+num);
        System.out.println("�T�o�q��"+gas);
    }
}
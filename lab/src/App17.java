public class App17 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("�ŧicar1");
        car car1;
        car1 = new car();
        car1.setcar(1234,20.5);

        System.out.println("�ŧicar2");
        car car2;

        System.out.println("�Ncar1���w��car2");
        car2 = car1;

        System.out.println("car1��");
        car1.show();

        System.out.println("car2��");
        car2.show();

        System.out.println("����car1�����");
        car1.setcar(4567,50.3);

        System.out.println("car1��");
        car1.show();

        System.out.println("car2��");
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

    void setcar(int n,double g){
        num = n;
        gas = g;
        System.out.println("�Ͳ�������"+num+"�T�o�q��"+gas+"����");
    }

    void show(){
        System.out.println("������"+num);
        System.out.println("�T�o�q��"+gas);
    }
}
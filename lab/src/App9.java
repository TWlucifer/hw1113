public class App9 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();
        
        car1.setCar(1234,20.5);
        car1.show();

        car1.setCar(20.5);
        car1.show();

        car1.setCar(1234);
        car1.show();
    }
}

/**
 * car
 */
class car {
    int num;
    double gas;

    void setCar(int n){
        num = n;
        System.out.println("�N�����]��"+num);
    }

    void setCar(double g){
        gas = g;
        System.out.println("�T�o�q�]��"+gas);
    }
    void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
    }
    void show(){
        System.out.println("������"+num);
        System.out.println("�T�o�q��"+gas);
    }
}
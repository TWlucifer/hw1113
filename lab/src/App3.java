public class App3 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();

        car1.num=1234;
        car1.gas=20.5;

        car1.showCar();
    }
}

/**
 * car
 */
class car {
    int num;
    double gas;

    void show(){
        System.out.println("������"+num);
        System.out.println("�o�q�O"+gas);
    }
    void showCar(){
        System.out.println("��ܨ��l���");
        show();
        this.show();
    }
}
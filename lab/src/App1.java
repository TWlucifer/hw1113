public class App1 {
    public static void main(String[] args) throws Exception {
        car car1;
        car1 = new car();

        car1.num=1234;
        car1.gas=20.5;

        car car2;
        car2 = new car();

        car2.num=2345;
        car2.gas=30.5;

        System.out.println("�T�����O"+car1.num);
        System.out.println("�o�q�O"+car1.gas);

        System.out.println("�T�����O"+car2.num);
        System.out.println("�o�q�O"+car2.gas);

    }
}

/**
 * car
 */
class car {
    int num;
    double gas;
}